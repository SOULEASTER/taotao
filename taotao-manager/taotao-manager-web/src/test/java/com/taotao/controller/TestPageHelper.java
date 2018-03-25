/**
 * Copyright © 2017 eSunny Info. Tech Ltd. All rights reserved.
 * <p>
 * Description TODO
 *
 * @Package: com.taotao.controller
 * @author: Rajer
 * @date: 2017年9月20日 下午4:53:20
 */
package com.taotao.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * ClassName TestPageHelper
 * Description TODO
 *
 * @author Rajer
 * @date 2017年9月20日 下午4:53:20
 */
public class TestPageHelper {

    @Test
    public void testPageHelper() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        TbItemMapper mapper = applicationContext.getBean(TbItemMapper.class); //sdfsd
        TbItemExample example = new TbItemExample();
        PageHelper.startPage(1, 30);
        List<TbItem> list = mapper.selectByExample(example);
//		for(TbItem tbItem : list){
//			System.out.println(tbItem.getTitle());
//		}

        PageInfo<TbItem> pageInfo = new PageInfo<>(list);
        long total = pageInfo.getTotal();
        System.out.println("total:" + total);
        int pages = pageInfo.getPages();
        System.out.println("pages:" + pages);
        int pageSize = pageInfo.getPageSize();
        System.out.println("pageSize:" + pageSize);

    }


}
