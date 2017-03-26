package com.abinge.lawinfo.controller;

import com.abinge.law.dto.QueryResult;
import com.abinge.lawinfo.dto.LawSimpleInfo;
import com.abinge.lawinfo.entity.LawBaseInfoEntity;
import com.abinge.lawinfo.service.impl.LawBaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Describe:
 * <p>Created by <a href="mailto:chenbingjie071@163.com">chenbingjie</a> at  18:26.
 *
 * @Author: chenbingjie
 * @Since: 1.0.0-SNAPSHOT
 * @Company: www.abinge.com
 */
@RestController
public class LawInfoController {
    @Autowired
    private LawBaseInfoService lawBaseInfoService;

    @RequestMapping("/pageQueryLawInfo")
    public QueryResult<LawBaseInfoEntity> pageQueryLawInfo(String lawName,int pageIndex,int pageSize){

        LawSimpleInfo lawSimpleInfo = new LawSimpleInfo();
        lawSimpleInfo.setLawName(lawName);
        lawSimpleInfo.setPageIndex(pageIndex);
        lawSimpleInfo.setPageSize(pageSize);
        QueryResult<LawBaseInfoEntity> queryResult = lawBaseInfoService.queryForPage(lawSimpleInfo);
        return queryResult;
    }

}
