package com.ecjtu.po;

public class LessonType {
    private Integer id;

    private String lessonname;

    private Double lessoncost;

    private Short totaltime;

    private String remark;

    
    @Override
	public String toString() {
		return "LessonType [id=" + id + ", lessonname=" + lessonname + ", lessoncost=" + lessoncost + ", totaltime="
				+ totaltime + ", remark=" + remark + "]";
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLessonname() {
        return lessonname;
    }

    public void setLessonname(String lessonname) {
        this.lessonname = lessonname == null ? null : lessonname.trim();
    }

    public Double getLessoncost() {
        return lessoncost;
    }

    public void setLessoncost(Double lessoncost) {
        this.lessoncost = lessoncost;
    }

    public Short getTotaltime() {
        return totaltime;
    }

    public void setTotaltime(Short totaltime) {
        this.totaltime = totaltime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}