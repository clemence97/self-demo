package com.example.excel;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

class SiOrderFeeDetail implements Serializable {
    /**
     *
     */
    private Long id;

    /**
     * si_order_fee.id
     */
    private Long orderFeeId;

    /**
     * 费用类型 1-增员 2-汇缴 3-补缴 4-补收 5-补退
     */
    private Byte feeType;

    /**
     * 承保人id
     */
    private Long sUid;

    /**
     * 承保人快照id
     */
    private Long sHistUid;

    /**
     * 费用月
     */
    private String feeMonth;

    /**
     * 社保政策id
     */
    private Long siPolicyId;

    /**
     * 社保政策快照id
     */
    private Long siPolicyHistId;

    /**
     * 公积金政策id
     */
    private Long hfPolicyId;

    /**
     * 公积金政策快照id
     */
    private Long hfPolicyHistId;

    /**
     * 社保单位费用
     */
    private BigDecimal siOrgFee;

    /**
     * 社保个人费用
     */
    private BigDecimal siEmpFee;

    /**
     * 公积金单位费用
     */
    private BigDecimal hfOrgFee;

    /**
     * 公积金个人费用
     */
    private BigDecimal hfEmpFee;

    /**
     * 总费用
     */
    private BigDecimal totalFee;

    /**
     * 补收补退时记录 来源 1-正常计费差额补 2-渠道账单补
     */
    private Byte fromType;

    /**
     * 补收补退 源id
     */
    private Long fromId;

    /**
     * 是否已处理 0-未处理 1-已处理 增员补缴汇缴时表示是否已对账
     */
    private Byte dealFlag;

    /**
     * 备注
     */
    private String remark;

    /**
     * 1-导入费用 null-系统生成
     */
    private Byte importFee;

    /**
     * 是否忽略差异费用 0-否(恢复) 1-是(忽略)
     */
    private Byte ignoredFlag;

    /**
     * 创建人编号
     */
    private String createUserid;

    /**
     * 创建人姓名
     */
    private String createUsername;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改人编号
     */
    private String updateUserid;

    /**
     * 修改人姓名
     */
    private String updateUsername;

    /**
     * 修改时间
     */
    private Date updateDate;

    /**
     * 删除标志
     */
    private Byte active;

    private static final long serialVersionUID = 1L;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderFeeId() {
        return orderFeeId;
    }

    public void setOrderFeeId(Long orderFeeId) {
        this.orderFeeId = orderFeeId;
    }

    public Byte getFeeType() {
        return feeType;
    }

    public void setFeeType(Byte feeType) {
        this.feeType = feeType;
    }

    public Long getsUid() {
        return sUid;
    }

    public void setsUid(Long sUid) {
        this.sUid = sUid;
    }

    public Long getsHistUid() {
        return sHistUid;
    }

    public void setsHistUid(Long sHistUid) {
        this.sHistUid = sHistUid;
    }

    public String getFeeMonth() {
        return feeMonth;
    }

    public void setFeeMonth(String feeMonth) {
        this.feeMonth = feeMonth;
    }

    public Long getSiPolicyId() {
        return siPolicyId;
    }

    public void setSiPolicyId(Long siPolicyId) {
        this.siPolicyId = siPolicyId;
    }

    public Long getSiPolicyHistId() {
        return siPolicyHistId;
    }

    public void setSiPolicyHistId(Long siPolicyHistId) {
        this.siPolicyHistId = siPolicyHistId;
    }

    public Long getHfPolicyId() {
        return hfPolicyId;
    }

    public void setHfPolicyId(Long hfPolicyId) {
        this.hfPolicyId = hfPolicyId;
    }

    public Long getHfPolicyHistId() {
        return hfPolicyHistId;
    }

    public void setHfPolicyHistId(Long hfPolicyHistId) {
        this.hfPolicyHistId = hfPolicyHistId;
    }

    public BigDecimal getSiOrgFee() {
        return siOrgFee;
    }

    public void setSiOrgFee(BigDecimal siOrgFee) {
        this.siOrgFee = siOrgFee;
    }

    public BigDecimal getSiEmpFee() {
        return siEmpFee;
    }

    public void setSiEmpFee(BigDecimal siEmpFee) {
        this.siEmpFee = siEmpFee;
    }

    public BigDecimal getHfOrgFee() {
        return hfOrgFee;
    }

    public void setHfOrgFee(BigDecimal hfOrgFee) {
        this.hfOrgFee = hfOrgFee;
    }

    public BigDecimal getHfEmpFee() {
        return hfEmpFee;
    }

    public void setHfEmpFee(BigDecimal hfEmpFee) {
        this.hfEmpFee = hfEmpFee;
    }

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    public Byte getFromType() {
        return fromType;
    }

    public void setFromType(Byte fromType) {
        this.fromType = fromType;
    }

    public Long getFromId() {
        return fromId;
    }

    public void setFromId(Long fromId) {
        this.fromId = fromId;
    }

    public Byte getDealFlag() {
        return dealFlag;
    }

    public void setDealFlag(Byte dealFlag) {
        this.dealFlag = dealFlag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Byte getImportFee() {
        return importFee;
    }

    public void setImportFee(Byte importFee) {
        this.importFee = importFee;
    }

    public Byte getIgnoredFlag() {
        return ignoredFlag;
    }

    public void setIgnoredFlag(Byte ignoredFlag) {
        this.ignoredFlag = ignoredFlag;
    }

    public String getCreateUserid() {
        return createUserid;
    }

    public void setCreateUserid(String createUserid) {
        this.createUserid = createUserid;
    }

    public String getCreateUsername() {
        return createUsername;
    }

    public void setCreateUsername(String createUsername) {
        this.createUsername = createUsername;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateUserid() {
        return updateUserid;
    }

    public void setUpdateUserid(String updateUserid) {
        this.updateUserid = updateUserid;
    }

    public String getUpdateUsername() {
        return updateUsername;
    }

    public void setUpdateUsername(String updateUsername) {
        this.updateUsername = updateUsername;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Byte getActive() {
        return active;
    }

    public void setActive(Byte active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SiOrderFeeDetail other = (SiOrderFeeDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getOrderFeeId() == null ? other.getOrderFeeId() == null : this.getOrderFeeId().equals(other.getOrderFeeId()))
                && (this.getFeeType() == null ? other.getFeeType() == null : this.getFeeType().equals(other.getFeeType()))
                && (this.getsUid() == null ? other.getsUid() == null : this.getsUid().equals(other.getsUid()))
                && (this.getsHistUid() == null ? other.getsHistUid() == null : this.getsHistUid().equals(other.getsHistUid()))
                && (this.getFeeMonth() == null ? other.getFeeMonth() == null : this.getFeeMonth().equals(other.getFeeMonth()))
                && (this.getSiPolicyId() == null ? other.getSiPolicyId() == null : this.getSiPolicyId().equals(other.getSiPolicyId()))
                && (this.getSiPolicyHistId() == null ? other.getSiPolicyHistId() == null : this.getSiPolicyHistId().equals(other.getSiPolicyHistId()))
                && (this.getHfPolicyId() == null ? other.getHfPolicyId() == null : this.getHfPolicyId().equals(other.getHfPolicyId()))
                && (this.getHfPolicyHistId() == null ? other.getHfPolicyHistId() == null : this.getHfPolicyHistId().equals(other.getHfPolicyHistId()))
                && (this.getSiOrgFee() == null ? other.getSiOrgFee() == null : this.getSiOrgFee().equals(other.getSiOrgFee()))
                && (this.getSiEmpFee() == null ? other.getSiEmpFee() == null : this.getSiEmpFee().equals(other.getSiEmpFee()))
                && (this.getHfOrgFee() == null ? other.getHfOrgFee() == null : this.getHfOrgFee().equals(other.getHfOrgFee()))
                && (this.getHfEmpFee() == null ? other.getHfEmpFee() == null : this.getHfEmpFee().equals(other.getHfEmpFee()))
                && (this.getTotalFee() == null ? other.getTotalFee() == null : this.getTotalFee().equals(other.getTotalFee()))
                && (this.getFromType() == null ? other.getFromType() == null : this.getFromType().equals(other.getFromType()))
                && (this.getFromId() == null ? other.getFromId() == null : this.getFromId().equals(other.getFromId()))
                && (this.getDealFlag() == null ? other.getDealFlag() == null : this.getDealFlag().equals(other.getDealFlag()))
                && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
                && (this.getImportFee() == null ? other.getImportFee() == null : this.getImportFee().equals(other.getImportFee()))
                && (this.getIgnoredFlag() == null ? other.getIgnoredFlag() == null : this.getIgnoredFlag().equals(other.getIgnoredFlag()))
                && (this.getCreateUserid() == null ? other.getCreateUserid() == null : this.getCreateUserid().equals(other.getCreateUserid()))
                && (this.getCreateUsername() == null ? other.getCreateUsername() == null : this.getCreateUsername().equals(other.getCreateUsername()))
                && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
                && (this.getUpdateUserid() == null ? other.getUpdateUserid() == null : this.getUpdateUserid().equals(other.getUpdateUserid()))
                && (this.getUpdateUsername() == null ? other.getUpdateUsername() == null : this.getUpdateUsername().equals(other.getUpdateUsername()))
                && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
                && (this.getActive() == null ? other.getActive() == null : this.getActive().equals(other.getActive()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderFeeId() == null) ? 0 : getOrderFeeId().hashCode());
        result = prime * result + ((getFeeType() == null) ? 0 : getFeeType().hashCode());
        result = prime * result + ((getsUid() == null) ? 0 : getsUid().hashCode());
        result = prime * result + ((getsHistUid() == null) ? 0 : getsHistUid().hashCode());
        result = prime * result + ((getFeeMonth() == null) ? 0 : getFeeMonth().hashCode());
        result = prime * result + ((getSiPolicyId() == null) ? 0 : getSiPolicyId().hashCode());
        result = prime * result + ((getSiPolicyHistId() == null) ? 0 : getSiPolicyHistId().hashCode());
        result = prime * result + ((getHfPolicyId() == null) ? 0 : getHfPolicyId().hashCode());
        result = prime * result + ((getHfPolicyHistId() == null) ? 0 : getHfPolicyHistId().hashCode());
        result = prime * result + ((getSiOrgFee() == null) ? 0 : getSiOrgFee().hashCode());
        result = prime * result + ((getSiEmpFee() == null) ? 0 : getSiEmpFee().hashCode());
        result = prime * result + ((getHfOrgFee() == null) ? 0 : getHfOrgFee().hashCode());
        result = prime * result + ((getHfEmpFee() == null) ? 0 : getHfEmpFee().hashCode());
        result = prime * result + ((getTotalFee() == null) ? 0 : getTotalFee().hashCode());
        result = prime * result + ((getFromType() == null) ? 0 : getFromType().hashCode());
        result = prime * result + ((getFromId() == null) ? 0 : getFromId().hashCode());
        result = prime * result + ((getDealFlag() == null) ? 0 : getDealFlag().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getImportFee() == null) ? 0 : getImportFee().hashCode());
        result = prime * result + ((getIgnoredFlag() == null) ? 0 : getIgnoredFlag().hashCode());
        result = prime * result + ((getCreateUserid() == null) ? 0 : getCreateUserid().hashCode());
        result = prime * result + ((getCreateUsername() == null) ? 0 : getCreateUsername().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateUserid() == null) ? 0 : getUpdateUserid().hashCode());
        result = prime * result + ((getUpdateUsername() == null) ? 0 : getUpdateUsername().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getActive() == null) ? 0 : getActive().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderFeeId=").append(orderFeeId);
        sb.append(", feeType=").append(feeType);
        sb.append(", sUid=").append(sUid);
        sb.append(", sHistUid=").append(sHistUid);
        sb.append(", feeMonth=").append(feeMonth);
        sb.append(", siPolicyId=").append(siPolicyId);
        sb.append(", siPolicyHistId=").append(siPolicyHistId);
        sb.append(", hfPolicyId=").append(hfPolicyId);
        sb.append(", hfPolicyHistId=").append(hfPolicyHistId);
        sb.append(", siOrgFee=").append(siOrgFee);
        sb.append(", siEmpFee=").append(siEmpFee);
        sb.append(", hfOrgFee=").append(hfOrgFee);
        sb.append(", hfEmpFee=").append(hfEmpFee);
        sb.append(", totalFee=").append(totalFee);
        sb.append(", fromType=").append(fromType);
        sb.append(", fromId=").append(fromId);
        sb.append(", dealFlag=").append(dealFlag);
        sb.append(", remark=").append(remark);
        sb.append(", importFee=").append(importFee);
        sb.append(", ignoredFlag=").append(ignoredFlag);
        sb.append(", createUserid=").append(createUserid);
        sb.append(", createUsername=").append(createUsername);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateUserid=").append(updateUserid);
        sb.append(", updateUsername=").append(updateUsername);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", active=").append(active);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}