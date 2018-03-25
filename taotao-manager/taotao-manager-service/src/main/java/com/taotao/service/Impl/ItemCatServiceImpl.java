/**
 * Copyright © 2017 eSunny Info. Tech Ltd. All rights reserved.
 *
 * @Description:TODO
 * @Package: com.taotao.service.Impl
 * @author: Rajer
 * @date: 2017年9月21日 下午3:19:40
 */
package com.taotao.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.common.pojo.EUITreeNode;
import com.taotao.mapper.TbItemCatMapper;
import com.taotao.pojo.TbItemCat;
import com.taotao.pojo.TbItemCatExample;
import com.taotao.pojo.TbItemCatExample.Criteria;
import com.taotao.service.ItemCatService;

/**
 * @ClassName: ItemCatServiceImpl
 * @Description: TODO
 * @author: Rajer
 * @date: 2017年9月21日 下午3:19:40
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {

    /* (non Javadoc)
     * @Title: getItemCatList
     * @Description: TODO
     * @param parentId
     * @return
     * @see com.taotao.service.ItemCatService#getItemCatList(long)
     */
    @Autowired
    private TbItemCatMapper itemCatMapper;

    @Override
    public List<EUITreeNode> getItemCatList(long parentId) {
        TbItemCatExample example = new TbItemCatExample();
        Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        List<TbItemCat> list = itemCatMapper.selectByExample(example);
        List<EUITreeNode> resultList = new ArrayList<>();
        for (TbItemCat tbItemCat : list) {
            EUITreeNode node = new EUITreeNode();
            node.setId(tbItemCat.getId());
            node.setText(tbItemCat.getName());
            node.setState(tbItemCat.getIsParent() ? "closed" : "open");
            resultList.add(node);
        }
        return resultList;
    }

}
