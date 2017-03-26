package com.abinge.lawinfo.service;

import com.abinge.law.dto.QueryResult;
import com.abinge.lawinfo.dto.LawSimpleInfo;
import com.abinge.lawinfo.entity.LawBaseInfoEntity;

/**
 * Describe:
 * <p>Created by <a href="mailto:chenbingjie@163.com">chenbingjie</a> at  2017/3/22 13:54.
 *
 * @Author: chenbingjie
 * @Since: 1.0.0-SNAPSHOT
 * @Company: www.abinge.com
 */
public interface ILawBaseInfoService {

    /**
     * 根据LawBaseInfo的信息分页查询法律文件信息
     *
     * @param lawSimpleInfo
     * @return
     */
    QueryResult<LawBaseInfoEntity> queryForPage(LawSimpleInfo lawSimpleInfo);
}
