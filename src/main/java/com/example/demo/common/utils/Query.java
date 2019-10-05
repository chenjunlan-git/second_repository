package com.example.demo.common.utils;

import com.baomidou.mybatisplus.plugins.Page;
import com.example.demo.common.xss.SQLFilter;
import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class Query<T> extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    /**
     * mybatisPlus分页参数
     */
    private Page page;
    /**
     * 每页条数
     */
    private int limit = 10;
    /**
     * 当前页码
     */
    private int currPage = 1;

    public Query(Map<String, Object> params) {
        this.putAll(params);

        if (params.get("limit") != null) {
            limit = Integer.parseInt((String) params.get("limit"));
        }
        if (params.get("page") != null) {
            currPage = Integer.parseInt((String) params.get("page"));
        }

        this.put("offSet", (currPage - 1) * 10);
        this.put("limit", limit);
        this.put("page", currPage);

        //mybatisPlus分页
        this.page = new Page<>(currPage, limit);

        //防止SQL注入（因为sidx、order是通过拼接SQL实现排序的，会有SQL注入风险）
        String sidx = SQLFilter.sqlInject((String) params.get("sidx"));
        String order = SQLFilter.sqlInject((String) params.get("order"));
        this.put("sidx", sidx);
        this.put("order", order);

        //排序
        if (StringUtils.isNotBlank(sidx) && StringUtils.isNotBlank(order)) {
            page.setOrderByField(sidx);
            page.setAsc("ASC".equalsIgnoreCase(order));
        }
    }

    public Page getPage() {
        return page;
    }

    public int getLimit() {
        return limit;
    }

    public int getCurrPage() {
        return currPage;
    }
}
