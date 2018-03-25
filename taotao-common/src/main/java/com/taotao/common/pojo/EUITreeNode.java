/**
 * Copyright © 2017 eSunny Info. Tech Ltd. All rights reserved.
 *
 * @Description:TODO
 * @Package: com.taotao.common.pojo
 * @author: Rajer
 * @date: 2017年9月21日 下午3:06:37
 */
package com.taotao.common.pojo;

/**
 * @ClassName: EUITreeNode
 * @Description: TODO
 * @author: Rajer
 * @date: 2017年9月21日 下午3:06:37
 */
public class EUITreeNode {
    private long id;
    private String text;
    private String state;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
