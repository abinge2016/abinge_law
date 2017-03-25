package com.abinge.lawinfo.service;

import com.abinge.law.dto.QueryResult;
import com.abinge.lawinfo.dto.LawSimpleInfo;
import com.abinge.lawinfo.entity.LawBaseInfoEntity;

/**
 * Describe:
 * <p>Created by <a href="mailto:chenbj@yintong.com.com">chenbj</a> at  2017/3/22 13:54.
 *
 * @Author: chenbj
 * @Version: $Id$
 * @Since: 1.0.0-SNAPSHOT
 * @Company: www.lianlianpay.com
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
