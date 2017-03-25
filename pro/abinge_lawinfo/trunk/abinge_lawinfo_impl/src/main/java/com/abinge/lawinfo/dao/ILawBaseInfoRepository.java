package com.abinge.lawinfo.dao;

import com.abinge.law.dao.BaseRepository;
import com.abinge.lawinfo.constant.DBConstant;
import com.abinge.lawinfo.entity.LawBaseInfoEntity;

import javax.persistence.PersistenceUnit;
import javax.persistence.PersistenceUnits;

/**
 * Describe:
 * <p>Created by <a href="mailto:chenbj@yintong.com.com">chenbj</a> at  2017/3/22 14:29.
 *
 * @Author: chenbj
 * @Version: $Id$
 * @Since: 1.0.0-SNAPSHOT
 * @Company: www.lianlianpay.com
 */
@PersistenceUnits({@PersistenceUnit(unitName = DBConstant.MYSQL_PERSISTENCE_UNIT)})
public interface ILawBaseInfoRepository extends BaseRepository<LawBaseInfoEntity, Long> {
}
