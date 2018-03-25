/**
 * Copyright © 2017 eSunny Info. Tech Ltd. All rights reserved.
 *
 * @Description:TODO
 * @Package: com.taotao.common.pojo
 * @author: Rajer
 * @date: 2017年9月20日 下午5:17:48
 */
package com.taotao.common.pojo;

import java.util.List;

/**
 * @ClassName: EasyUIResult
 * @Description: TODO
 * @author: Rajer
 * @date: 2017年9月20日 下午5:17:48
 */
public class EUIDataGridResult {
    /**
     * @Title:EUIDataGridResult
     * @Description:TODO
     * @param
     */

    private Integer total;

    private List<?> rows;

    public EUIDataGridResult() {
    }

    public EUIDataGridResult(Integer total, List<?> rows) {
        this.total = total;
        this.rows = rows;
    }

    public EUIDataGridResult(Long total, List<?> rows) {
        this.total = total.intValue();
        this.rows = rows;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }


}
