package com.china.mybootstrap.entity;

import java.util.Date;

public class Department {
    private Integer id;

    private String departmentname;

    private String usrName;

    private Date ctrTm;

    private Integer ctrUsrId;

    private String lngName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname == null ? null : departmentname.trim();
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName == null ? null : usrName.trim();
    }

    public Date getCtrTm() {
        return ctrTm;
    }

    public void setCtrTm(Date ctrTm) {
        this.ctrTm = ctrTm;
    }

    public Integer getCtrUsrId() {
        return ctrUsrId;
    }

    public void setCtrUsrId(Integer ctrUsrId) {
        this.ctrUsrId = ctrUsrId;
    }

    public String getLngName() {
        return lngName;
    }

    public void setLngName(String lngName) {
        this.lngName = lngName == null ? null : lngName.trim();
    }
}