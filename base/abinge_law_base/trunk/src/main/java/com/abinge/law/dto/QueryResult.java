package com.abinge.law.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Describe:
 * <p>Created by <a href="mailto:chenbingjie@163.com">chenbingjie</a> at  2017/3/22 14:17.
 *
 * @Author: chenbj
 * @Version: $Id$
 * @Since: 1.0.0-SNAPSHOT
 * @Company: www.abinge.com
 */
public class QueryResult<T> implements Serializable{
    private static final long serialVersionUID = -2399737337467969326L;

    private Long resultCount;
    private List<T> resultList;

    public QueryResult() {}

    public QueryResult(List<T> resultList,Long resultCount) {
        this.resultCount = resultCount;
        this.resultList = resultList;
    }

    public Long getResultCount() {
        return resultCount;
    }

    public void setResultCount(Long resultCount) {
        this.resultCount = resultCount;
    }

    public List<T> getResultList() {
        return resultList;
    }

    public void setResultList(List<T> resultList) {
        this.resultList = resultList;
    }
}
