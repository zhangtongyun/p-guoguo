package com.guoguo.respVo;

import java.io.Serializable;

/**
 * Created by lenovo on 2018/2/8.
 */
public class JsonResultPage<T> extends JsonResult<T> implements Serializable {
    private static final long serialVersionUID = 7924904837637997179L;

    /**
     * 总记录数
     */
    private Integer total;

    private Integer offset = 1;
    private Integer limit = 10;
    private Integer page;

    public JsonResultPage(){

    }

    public JsonResultPage(Integer page,Integer limit,Integer total){
        this.page = page;
        this.total = total;
        this.limit = limit;
    }
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }
}
