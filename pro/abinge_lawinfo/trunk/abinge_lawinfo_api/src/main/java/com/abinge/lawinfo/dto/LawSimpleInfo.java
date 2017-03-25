package com.abinge.lawinfo.dto;

import com.abinge.law.dto.BaseDto;

import java.util.Date;
import java.util.List;

/**
 * Describe:法律文件基本信息
 * <p>Created by <a href="mailto:chenbingjie071@163.com">chenbingjie</a> at  2017/3/22 10:56.
 *
 * @Author: chenbingjie
 * @Version: $Id$
 * @Since: 1.0.0-SNAPSHOT
 * @Company: www.abinge.com
 */
public class LawSimpleInfo extends BaseDto {
    private static final long serialVersionUID = 3567310667821186129L;

    private Long id;
    private String lawName;
    private String lawContent;
    private Integer lawType;
    private String pubFileCode;
    private Date pubStartDate;
    private Date pubEndDate;
    private Date effectiveStartDate;
    private Date effectiveEndDate;
    private List<Long> draftDepartmentIds;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"lawName\":\"")
                .append(lawName).append('\"');
        sb.append(",\"lawContent\":\"")
                .append(lawContent).append('\"');
        sb.append(",\"lawType\":")
                .append(lawType);
        sb.append(",\"pubFileCode\":\"")
                .append(pubFileCode).append('\"');
        sb.append(",\"pubStartDate\":\"")
                .append(pubStartDate).append('\"');
        sb.append(",\"pubEndDate\":\"")
                .append(pubEndDate).append('\"');
        sb.append(",\"effectiveStartDate\":\"")
                .append(effectiveStartDate).append('\"');
        sb.append(",\"effectiveEndDate\":\"")
                .append(effectiveEndDate).append('\"');
        sb.append(",\"draftDepartmentIds\":")
                .append(draftDepartmentIds==null?0:draftDepartmentIds.size());
        sb.append('}');
        return sb.toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLawName() {
        return lawName;
    }

    public void setLawName(String lawName) {
        this.lawName = lawName;
    }

    public Integer getLawType() {
        return lawType;
    }

    public void setLawType(Integer lawType) {
        this.lawType = lawType;
    }

    public List<Long> getDraftDepartmentIds() {
        return draftDepartmentIds;
    }

    public void setDraftDepartmentIds(List<Long> draftDepartmentIds) {
        this.draftDepartmentIds = draftDepartmentIds;
    }

    public Date getEffectiveStartDate() {
        return effectiveStartDate;
    }

    public void setEffectiveStartDate(Date effectiveStartDate) {
        this.effectiveStartDate = effectiveStartDate;
    }

    public Date getEffectiveEndDate() {
        return effectiveEndDate;
    }

    public void setEffectiveEndDate(Date effectiveEndDate) {
        this.effectiveEndDate = effectiveEndDate;
    }

    public String getLawContent() {
        return lawContent;
    }

    public void setLawContent(String lawContent) {
        this.lawContent = lawContent;
    }

    public String getPubFileCode() {
        return pubFileCode;
    }

    public void setPubFileCode(String pubFileCode) {
        this.pubFileCode = pubFileCode;
    }

    public Date getPubStartDate() {
        return pubStartDate;
    }

    public void setPubStartDate(Date pubStartDate) {
        this.pubStartDate = pubStartDate;
    }

    public Date getPubEndDate() {
        return pubEndDate;
    }

    public void setPubEndDate(Date pubEndDate) {
        this.pubEndDate = pubEndDate;
    }
}
