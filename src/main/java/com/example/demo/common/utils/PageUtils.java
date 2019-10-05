package com.example.demo.common.utils;

import com.baomidou.mybatisplus.plugins.Page;

import java.util.List;

/**
 * 分页工具类
 */
public class PageUtils {
    private static final long serialVersionUID = 1L;
    /**
     * 总记录数
     */
    private long totalCount;
    /**
     * 总页数
     */
    private long totalPage;
    /**
     * 当前页数
     */
    private int currPage;
    /**
     * 每页记录数
     */
    private int pageSize;
    /**
     *列表数据
     */
    private List<?> list;

    /**
     *
     * @param list 列表数据
     * @param totalCount 总记录数
     * @param currPage 当前页码
     * @param pageSize 没有记录数
     */
    public PageUtils(List<?> list,int totalCount,int currPage,int pageSize){
        this.list = list;
        this.currPage = currPage;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.totalPage = (int)Math.ceil((double)totalCount/pageSize);
    }

    /**
     * 分页
     * @param page
     */
    public PageUtils(Page<?> page){
        this.list = page.getRecords();
        this.totalCount = page.getTotal();
        this.totalPage = page.getPages();
        this.pageSize = page.getSize();
        this.currPage = page.getCurrent();
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
    }

    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }
}
