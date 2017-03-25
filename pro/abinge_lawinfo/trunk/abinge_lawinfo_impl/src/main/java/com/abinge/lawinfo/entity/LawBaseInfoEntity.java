package com.abinge.lawinfo.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Describe:法律基本信息model类
 * <p>Created by <a href="mailto:abinge2016@163.com">chenbingjie</a> at  2017/3/22 13:55.
 *
 * @Author: chenbingjie
 * @Version: $Id$
 * @Since: 1.0.0-SNAPSHOT
 * @Company: www.abinge.com
 */
@Entity
@Table(name = "law_base_info")
public class LawBaseInfoEntity implements Serializable{
    private static final long serialVersionUID = -1997013766945932294L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;//主键id

    @Column(name = "law_name")
    private String lawName;//法律文件名

    @Column(name = "law_type")
    private Integer lawType;//法律文件类型

    @Column(name = "pub_department")
    private String pubDepartment;//发布机构名称

    @Column(name = "pub_department_id")
    private Long pubDepartmentId;//发布机构编码

    @Column(name = "draft_department")
    private String draftDepartment;//制定机构名称

    @Column(name = "draft_department_id")
    private Long draftDepartmentId;//制定机构编码

    @Column(name = "effective_date")
    private Date effectiveDate;//生效日期

    @Column(name = "pub_date")
    private Date pubDate;//公布日期

    @Column(name = "status")
    private Integer status;//法律文件状态日期 0-颁布未生效；1-生效；2-失效；

    @Column(name = "abate_file_code")
    private String abateFileCode;//法律文件失效文号

    @Column(name = "pub_file_code")
    private String pubFileCode;//文件颁布文号

    @Column(name = "create_time")
    private Date createTime;//创建时间

    @Column(name = "update_time")
    private Date updateTime;//修改时间

    @Override
    public String toString() {
        return "LawBaseInfoEntity{" +
                "id=" + id +
                ", lawName=" + lawName +
                ", lawType=" + lawType +
                ", pubDepartment=" + pubDepartment +
                ", pubDepartmentId=" + pubDepartmentId +
                ", draftDepartment=" + draftDepartment +
                ", draftDepartmentId=" + draftDepartmentId +
                ", effectiveDate=" + effectiveDate +
                ", pubDate=" + pubDate +
                ", status=" + status +
                ", abateFileCode=" + abateFileCode +
                ", pubFileCode=" + pubFileCode +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
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

    public String getPubDepartment() {
        return pubDepartment;
    }

    public void setPubDepartment(String pubDepartment) {
        this.pubDepartment = pubDepartment;
    }

    public Long getPubDepartmentId() {
        return pubDepartmentId;
    }

    public void setPubDepartmentId(Long pubDepartmentId) {
        this.pubDepartmentId = pubDepartmentId;
    }

    public String getDraftDepartment() {
        return draftDepartment;
    }

    public void setDraftDepartment(String draftDepartment) {
        this.draftDepartment = draftDepartment;
    }

    public Long getDraftDepartmentId() {
        return draftDepartmentId;
    }

    public void setDraftDepartmentId(Long draftDepartmentId) {
        this.draftDepartmentId = draftDepartmentId;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAbateFileCode() {
        return abateFileCode;
    }

    public void setAbateFileCode(String abateFileCode) {
        this.abateFileCode = abateFileCode;
    }

    public String getPubFileCode() {
        return pubFileCode;
    }

    public void setPubFileCode(String pubFileCode) {
        this.pubFileCode = pubFileCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
