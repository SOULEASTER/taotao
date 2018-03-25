/**
 * Copyright © 2017 eSunny Info. Tech Ltd. All rights reserved.
 *
 * @Description:TODO
 * @Package: com.taotao.service
 * @author: Rajer
 * @date: 2017年9月20日 下午12:40:14
 */
package com.taotao.service;

import com.taotao.common.pojo.EUIDataGridResult;
import com.taotao.pojo.TbItem;

/**
 * @ClassName: ItemService
 * @Description: TODO
 * @author: Rajer
 * @date: 2017年9月20日 下午12:40:14
 */
public interface ItemService {
    TbItem getItemById(Long itemId);

    EUIDataGridResult getItemList(int page, int rows);
}
