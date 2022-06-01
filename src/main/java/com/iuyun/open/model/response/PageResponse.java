package com.iuyun.open.model.response;

import java.util.ArrayList;
import java.util.List;

public class PageResponse<T> extends BaseResponse {
    /**
     * 当前页码
     */
    private Integer pageNum;
    /**
     * 分页大小
     */
    private Integer pageSize;
    /**
     * 总记录数
     */
    private Long total;
    /**
     * 内容
     */
    private List<T> content;

    public PageResponse(Integer pageNum, Integer pageSize, Long total) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.total = total;
        this.content = new ArrayList<>();
    }

    public PageResponse() {
    }

    public Integer getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotal() {
        return this.total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getContent() {
        return this.content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }
}

