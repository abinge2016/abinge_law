package com.abinge.lawinfo.service;

import com.abinge.lawinfo.dto.LawSimpleInfo;

import java.util.List;

/**
 * Describe:法律基础信息服务接口
 * <p>Created by <a href="mailto:chenbingjie071@163.com">chenbj</a> at  2017/3/22 10:49.
 *
 * @Author: chenbj
 * @Version: $Id$
 * @Since: 0.0.1-SNAPSHOT
 * @Company: www.abinge.com
 */
public interface ILawInfoService {

    List<LawSimpleInfo> queryList(LawSimpleInfo lawSimpleInfo);
}
