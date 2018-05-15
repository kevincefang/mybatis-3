package demo.model;

/**
 * @author: kevin
 * @date: 2018/4/9
 * @description:
 */
public class User {

    private String cuserid;//用户唯一序列id
    private String cpwd;//登录密码
    private String cfpwd;//资金密码
    private String cusername;//姓名
    private String cmobileno;//手机号
    private String isource;//渠道值
    private String crealname;//用户真实姓名
    private String cidcard;//身份证号
    private String cicon;//头像
    private String istate;//账户状态 0 正常  1 注销
    private String cactivedate;//活跃时间
    private String ccpuserid;
    private String cimei;

    public String getCuserid() {
        return cuserid;
    }

    public void setCuserid(String cuserid) {
        this.cuserid = cuserid;
    }

    public String getCpwd() {
        return cpwd;
    }

    public void setCpwd(String cpwd) {
        this.cpwd = cpwd;
    }

    public String getCfpwd() {
        return cfpwd;
    }

    public void setCfpwd(String cfpwd) {
        this.cfpwd = cfpwd;
    }

    public String getCusername() {
        return cusername;
    }

    public void setCusername(String cusername) {
        this.cusername = cusername;
    }

    public String getCmobileno() {
        return cmobileno;
    }

    public void setCmobileno(String cmobileno) {
        this.cmobileno = cmobileno;
    }

    public String getIsource() {
        return isource;
    }

    public void setIsource(String isource) {
        this.isource = isource;
    }

    public String getCrealname() {
        return crealname;
    }

    public void setCrealname(String crealname) {
        this.crealname = crealname;
    }

    public String getCidcard() {
        return cidcard;
    }

    public void setCidcard(String cidcard) {
        this.cidcard = cidcard;
    }

    public String getCicon() {
        return cicon;
    }

    public void setCicon(String cicon) {
        this.cicon = cicon;
    }

    public String getIstate() {
        return istate;
    }

    public void setIstate(String istate) {
        this.istate = istate;
    }

    public String getCactivedate() {
        return cactivedate;
    }

    public void setCactivedate(String cactivedate) {
        this.cactivedate = cactivedate;
    }

    public String getCcpuserid() {
        return ccpuserid;
    }

    public void setCcpuserid(String ccpuserid) {
        this.ccpuserid = ccpuserid;
    }

    public String getCimei() {
        return cimei;
    }

    public void setCimei(String cimei) {
        this.cimei = cimei;
    }

    @Override
    public String toString() {
        return "User{" +
                "cuserid='" + cuserid + '\'' +
                ", cpwd='" + cpwd + '\'' +
                ", cfpwd='" + cfpwd + '\'' +
                ", cusername='" + cusername + '\'' +
                ", cmobileno='" + cmobileno + '\'' +
                ", isource='" + isource + '\'' +
                ", crealname='" + crealname + '\'' +
                ", cidcard='" + cidcard + '\'' +
                ", cicon='" + cicon + '\'' +
                ", istate='" + istate + '\'' +
                ", cactivedate='" + cactivedate + '\'' +
                ", ccpuserid='" + ccpuserid + '\'' +
                ", cimei='" + cimei + '\'' +
                '}';
    }
}
