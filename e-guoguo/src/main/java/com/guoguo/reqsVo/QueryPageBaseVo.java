package com.guoguo.reqsVo;

import com.guoguo.util.UtilClass;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;


public class QueryPageBaseVo implements Serializable {

    private static final long serialVersionUID = 1136222549170127469L;

    private Integer limit = 10;
    private Integer page = 1;

    private String sortOrder = "asc";

    private String sortName;

    
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
    	if(limit !=null && limit > 0){
    		this.limit = limit;
    	}
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        if(page != null && page > 0)
            this.page = page;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        if(StringUtils.isNotBlank(sortName))
            this.sortName = UtilClass.getColumn(sortName);
    }
}