package com.ecjtu.po;

import java.util.Date;

public class Consult {
    private Integer id;

    private Integer referid;

    private Integer userid;

    private Date consulttime;

    
    @Override
	public String toString() {
		return "Consult [id=" + id + ", referid=" + referid + ", userid=" + userid + ", consulttime=" + consulttime
				+ "]";
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReferid() {
        return referid;
    }

    public void setReferid(Integer referid) {
        this.referid = referid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getConsulttime() {
        return consulttime;
    }

    public void setConsulttime(Date consulttime) {
        this.consulttime = consulttime;
    }
}