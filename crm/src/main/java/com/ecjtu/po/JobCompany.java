package com.ecjtu.po;

public class JobCompany {
    private Integer id;

    private String companyname;

    private String comcode;

    private String address;

    private String linkman;

    private String telephone;

    private String quarters;

    private Double emolument;

    private String state;

    private String remark;

    
    @Override
	public String toString() {
		return "JobCompany [id=" + id + ", companyname=" + companyname + ", comcode=" + comcode + ", address=" + address
				+ ", linkman=" + linkman + ", telephone=" + telephone + ", quarters=" + quarters + ", emolument="
				+ emolument + ", state=" + state + ", remark=" + remark + "]";
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getComcode() {
        return comcode;
    }

    public void setComcode(String comcode) {
        this.comcode = comcode == null ? null : comcode.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getQuarters() {
        return quarters;
    }

    public void setQuarters(String quarters) {
        this.quarters = quarters == null ? null : quarters.trim();
    }

    public Double getEmolument() {
        return emolument;
    }

    public void setEmolument(Double emolument) {
        this.emolument = emolument;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}