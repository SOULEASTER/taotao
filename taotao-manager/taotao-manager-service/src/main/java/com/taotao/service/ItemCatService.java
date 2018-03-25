/**
 * Copyright © 2017 eSunny Info. Tech Ltd. All rights reserved.
 *
 * @Description:TODO
 * @Package: com.taotao.service
 * @author: Rajer
 * @date: 2017年9月21日 下午3:16:45
 */
package com.taotao.service;

import java.util.List;

import com.taotao.common.pojo.EUITreeNode;

/**
 * @ClassName: ItemCatService
 * @Description: TODO
 * @author: Rajer
 * @date: 2017年9月21日 下午3:16:45
 */
public interface ItemCatService {
    List<EUITreeNode> getItemCatList(long parentId);
}
