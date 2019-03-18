package com.ecjtu.po;

import java.util.Date;

public class Job {
    private Integer id;

    private String stucode;

    private String stuname;

    private String gender;

    private Integer classid;

    private Integer jobcomid;

    private String location;

    private String activecode;

    private Integer jodstate;

    private Date jobtime;

    private String remark;

    
    @Override
	public String toString() {
		return "Job [id=" + id + ", stucode=" + stucode + ", stuname=" + stuname + ", gender=" + gender + ", classid="
				+ classid + ", jobcomid=" + jobcomid + ", location=" + location + ", activecode=" + activecode
				+ ", jodstate=" + jodstate + ", jobtime=" + jobtime + ", remark=" + remark + "]";
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStucode() {
        return stucode;
    }

    public void setStucode(String stucode) {
        this.stucode = stucode == null ? null : stucode.trim();
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname == null ? null : stuname.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public Integer getJobcomid() {
        return jobcomid;
    }

    public void setJobcomid(Integer jobcomid) {
        this.jobcomid = jobcomid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getActivecode() {
        return activecode;
    }

    public void setActivecode(String activecode) {
        this.activecode = activecode == null ? null : activecode.trim();
    }

    public Integer getJodstate() {
        return jodstate;
    }

    public void setJodstate(Integer jodstate) {
        this.jodstate = jodstate;
    }

    public Date getJobtime() {
        return jobtime;
    }

    public void setJobtime(Date jobtime) {
        this.jobtime = jobtime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}