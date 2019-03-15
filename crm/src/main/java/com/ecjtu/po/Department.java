package com.ecjtu.po;
public class Department {
    private String id;

    private String depName;
    
    private int isCancel;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public int getIsCancel() {
		return isCancel;
	}

	public void setIsCancel(int isCancel) {
		this.isCancel = isCancel;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", depName=" + depName + ", isCancel=" + isCancel + "]";
	}

} 