/**
 * Copyright © 2017 eSunny Info. Tech Ltd. All rights reserved.
 *
 * @Description:TODO
 * @Package: com.taotao.service.Impl
 * @author: Rajer
 * @date: 2017年9月20日 下午12:45:18
 */
package com.taotao.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EUIDataGridResult;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.pojo.TbItemExample.Criteria;
import com.taotao.service.ItemService;

/**
 * @ClassName: ItemServiceImpl
 * @Description: TODO
 * @author: Rajer
 * @date: 2017年9月20日 下午12:45:18
 */
@Service
public class ItemServiceImpl implements ItemService {

    /* (non Javadoc)
     * @Title: geTbItemById
     * @Description: TODO
     * @param itemid
     * @return
     * @see com.taotao.service.ItemService#geTbItemById(long)
     */
    @Autowired
    private TbItemMapper itemMapper;

    @Override
    public TbItem getItemById(Long itemId) {
//		TbItem item=itemMapper.selectByPrimaryKey(itemid);
        TbItem item = new TbItem();
        TbItemExample example = new TbItemExample();
        Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(itemId);
        List<TbItem> list = itemMapper.selectByExample(example);
        if (list.size() > 0 && list != null) {
            item = list.get(0);
            return item;
        }
        return item;
    }

    @Override
    public EUIDataGridResult getItemList(int page, int rows) {
        TbItemExample example = new TbItemExample();
        PageHelper.startPage(page, rows);
        List<TbItem> list = itemMapper.selectByExample(example);

        EUIDataGridResult result = new EUIDataGridResult();
        result.setRows(list);

        PageInfo<TbItem> pageInfo = new PageInfo<>(list);
        result.setTotal((int) pageInfo.getTotal());

        return result;
    }

}
