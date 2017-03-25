package com.abinge.lawinfo.service.impl;

import com.abinge.law.dto.QueryResult;
import com.abinge.lawinfo.dao.ILawBaseInfoRepository;
import com.abinge.lawinfo.dto.LawSimpleInfo;
import com.abinge.lawinfo.entity.LawBaseInfoEntity;
import com.abinge.lawinfo.service.ILawBaseInfoService;
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Describe:
 * <p>Created by <a href="mailto:chenbingjie071@yintong.com.com">chenbingjie</a> at  2017/3/22 15:08.
 *
 * @Author: chenbingjie
 * @Version: $Id$
 * @Since: 1.0.0-SNAPSHOT
 * @Company: www.abinge.com
 */
@Service
public class LawBaseInfoService implements ILawBaseInfoService {

    private Logger logger = LoggerFactory.getLogger(LawBaseInfoService.class);

    @Autowired
    EntityManager entityManager;

    @Autowired
    private ILawBaseInfoRepository lawBaseInfoRepository;

    /**
     * 根据LawBaseInfo的信息分页查询法律文件信息
     *
     * @param lawSimpleInfo
     * @return
     */
    @Override
    public QueryResult<LawBaseInfoEntity> queryForPage(LawSimpleInfo lawSimpleInfo) {
        Specification specification = new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicateList = Lists.newArrayList();
                if (!StringUtils.isEmpty(lawSimpleInfo.getLawName())) {
                    predicateList.add(criteriaBuilder.like(root.get("lawName"), lawSimpleInfo.getLawName()));
                }
                if (!StringUtils.isEmpty(lawSimpleInfo.getLawType())) {
                    predicateList.add(criteriaBuilder.equal(root.get("lawType"), lawSimpleInfo.getLawType()));
                }
                if (!StringUtils.isEmpty(lawSimpleInfo.getPubFileCode())) {
                    predicateList.add(criteriaBuilder.like(root.get("pubFileCode"), lawSimpleInfo.getPubFileCode()));
                }
                if (!StringUtils.isEmpty(lawSimpleInfo.getPubStartDate())) {
                    predicateList.add(criteriaBuilder.greaterThanOrEqualTo(root.get("pubDate"), lawSimpleInfo
                            .getPubStartDate()));
                }
                if (!StringUtils.isEmpty(lawSimpleInfo.getPubEndDate())) {
                    predicateList.add(criteriaBuilder.lessThanOrEqualTo(root.get("pubDate"), lawSimpleInfo
                            .getPubEndDate()));
                }
                if (!StringUtils.isEmpty(lawSimpleInfo.getEffectiveStartDate())) {
                    predicateList.add(criteriaBuilder.greaterThanOrEqualTo(root.get("effectiveDate"), lawSimpleInfo
                            .getEffectiveStartDate()));
                }
                if (!StringUtils.isEmpty(lawSimpleInfo.getEffectiveEndDate())) {
                    predicateList.add(criteriaBuilder.lessThanOrEqualTo(root.get("effectiveDate"), lawSimpleInfo
                            .getEffectiveEndDate()));
                }
                if (!CollectionUtils.isEmpty(lawSimpleInfo.getDraftDepartmentIds())) {
                    predicateList.add(root.get("draftDepartmentId").in(lawSimpleInfo.getDraftDepartmentIds()));
                }
                return criteriaBuilder.and(predicateList.toArray(new Predicate[predicateList.size()]));
            }
        };

        Page<LawBaseInfoEntity> page = lawBaseInfoRepository.findAll(specification,
                new PageRequest(lawSimpleInfo.getPageIndex() - 1, lawSimpleInfo.getPageSize()));
        Long count = page.getTotalElements();
        List<LawBaseInfoEntity> list = page.getContent();
        return new QueryResult<>(list, count);
    }
}
