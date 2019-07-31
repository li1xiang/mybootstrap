package com.china.mybootstrap.entity;

import java.util.Date;

public class Usr {
    private Integer usrId;

    private String lgnIdSdsc;

    private String usrTpEnum;

    private String usrStEnum;

    private String pswdDesc;

    private Date crtTmst;

    private Integer crtUsrId;

    private Date updTmst;

    private Integer updUsrId;

    private String telSdsc;

    public Integer getUsrId() {
        return usrId;
    }

    public void setUsrId(Integer usrId) {
        this.usrId = usrId;
    }

    public String getLgnIdSdsc() {
        return lgnIdSdsc;
    }

    public void setLgnIdSdsc(String lgnIdSdsc) {
        this.lgnIdSdsc = lgnIdSdsc == null ? null : lgnIdSdsc.trim();
    }

    public String getUsrTpEnum() {
        return usrTpEnum;
    }

    public void setUsrTpEnum(String usrTpEnum) {
        this.usrTpEnum = usrTpEnum == null ? null : usrTpEnum.trim();
    }

    public String getUsrStEnum() {
        return usrStEnum;
    }

    public void setUsrStEnum(String usrStEnum) {
        this.usrStEnum = usrStEnum == null ? null : usrStEnum.trim();
    }

    public String getPswdDesc() {
        return pswdDesc;
    }

    public void setPswdDesc(String pswdDesc) {
        this.pswdDesc = pswdDesc == null ? null : pswdDesc.trim();
    }

    public Date getCrtTmst() {
        return crtTmst;
    }

    public void setCrtTmst(Date crtTmst) {
        this.crtTmst = crtTmst;
    }

    public Integer getCrtUsrId() {
        return crtUsrId;
    }

    public void setCrtUsrId(Integer crtUsrId) {
        this.crtUsrId = crtUsrId;
    }

    public Date getUpdTmst() {
        return updTmst;
    }

    public void setUpdTmst(Date updTmst) {
        this.updTmst = updTmst;
    }

    public Integer getUpdUsrId() {
        return updUsrId;
    }

    public void setUpdUsrId(Integer updUsrId) {
        this.updUsrId = updUsrId;
    }

    public String getTelSdsc() {
        return telSdsc;
    }

    public void setTelSdsc(String telSdsc) {
        this.telSdsc = telSdsc == null ? null : telSdsc.trim();
    }
}