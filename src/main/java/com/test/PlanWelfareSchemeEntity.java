package com.test;

import java.math.BigDecimal;
import java.util.Date;

public class PlanWelfareSchemeEntity {
    /**  */
    private Long id;

    /** 公司id */
    private Long companyId;

    /** 福利项目名 */
    private String name;

    /** 享用频率 */
    private String frequency;

    /** 是否计入工资总额 */
    private Byte salaryIncluded;

    /** 是否计税0: 不计税 1：计税 2：部分计税 */
    private Byte taxCal;

    /** 可抵税额度 */
    private BigDecimal taxDeduction;

    /** 创建人编号 */
    private String createUserid;

    /** 创建人姓名 */
    private String createUsername;

    /** 创建时间 */
    private Date createDate;

    /** 修改人编号 */
    private String updateUserid;

    /** 修改人姓名 */
    private String updateUsername;

    /** 修改时间 */
    private Date updateDate;

    /** 删除标志 */
    private Byte active;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public Byte getSalaryIncluded() {
        return salaryIncluded;
    }

    public void setSalaryIncluded(Byte salaryIncluded) {
        this.salaryIncluded = salaryIncluded;
    }

    public Byte getTaxCal() {
        return taxCal;
    }

    public void setTaxCal(Byte taxCal) {
        this.taxCal = taxCal;
    }

    public BigDecimal getTaxDeduction() {
        return taxDeduction;
    }

    public void setTaxDeduction(BigDecimal taxDeduction) {
        this.taxDeduction = taxDeduction;
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
        PlanWelfareSchemeEntity other = (PlanWelfareSchemeEntity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getFrequency() == null ? other.getFrequency() == null : this.getFrequency().equals(other.getFrequency()))
            && (this.getSalaryIncluded() == null ? other.getSalaryIncluded() == null : this.getSalaryIncluded().equals(other.getSalaryIncluded()))
            && (this.getTaxCal() == null ? other.getTaxCal() == null : this.getTaxCal().equals(other.getTaxCal()))
            && (this.getTaxDeduction() == null ? other.getTaxDeduction() == null : this.getTaxDeduction().equals(other.getTaxDeduction()))
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
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        result = prime * result + ((getSalaryIncluded() == null) ? 0 : getSalaryIncluded().hashCode());
        result = prime * result + ((getTaxCal() == null) ? 0 : getTaxCal().hashCode());
        result = prime * result + ((getTaxDeduction() == null) ? 0 : getTaxDeduction().hashCode());
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
        sb.append(", companyId=").append(companyId);
        sb.append(", name=").append(name);
        sb.append(", frequency=").append(frequency);
        sb.append(", salaryIncluded=").append(salaryIncluded);
        sb.append(", taxCal=").append(taxCal);
        sb.append(", taxDeduction=").append(taxDeduction);
        sb.append(", createUserid=").append(createUserid);
        sb.append(", createUsername=").append(createUsername);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateUserid=").append(updateUserid);
        sb.append(", updateUsername=").append(updateUsername);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", active=").append(active);
        sb.append("]");
        return sb.toString();
    }
}