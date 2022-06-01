package com.iuyun.open.model.request;

public class PageQueryRequest extends BaseRequest {
    /**
     * 当前页码从1开始
     */
    private Integer pageNum = 1;

    /**
     * 每页显示条数，须大于0，默认10条
     */
    private Integer pageSize = 10;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

}
