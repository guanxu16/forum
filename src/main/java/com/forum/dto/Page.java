package com.forum.dto;

/**
 * Created by gxlly on 2017/4/11.
 */
public class Page {
    private Integer pageNo;     //当前页数
    private Integer pageSize;   //单页显示条数
    private String orderBy;     //排序条件

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public Page(Integer pageNo, Integer pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }

    public Page(Integer pageNo, Integer pageSize, String orderBy) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.orderBy = orderBy;
    }
}
