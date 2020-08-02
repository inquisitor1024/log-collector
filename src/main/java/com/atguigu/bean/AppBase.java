package com.atguigu.bean;

/**
 * @projectName:
 * @fileName:
 * @packageName: AppBase
 * @author: Mr.乐
 * @date: 2020/7/23 11:07
 * @copyright(c): 无
 * @versions: 1.0版本
 * @instructions: 公共日志
 */

public class AppBase {
    //设备唯一标识
    private String mid;
    //用户uid
    private String uid;
    //程序版本号 versionCode
    private String vc;
    //程序版本 versionName
    private String vn;
    //系统语言
    private String l;
    //渠道号，应用从那个渠道来的
    private String sr;
    //Android 系统版
    private String os;
    //区域
    private String ar;
    //手机类型
    private String md;
    //手机品牌
    private String ba;
    //sdkVersion
    private String sv;
    //邮箱 gmail
    private String g;
    //屏幕宽 heightXwidth
    private String hw;
    //客户端日志产生时的时间
    private String t;
    //网络模式
    private String nw;
    //lng 经度
    private String ln;
    //lat 纬度
    private String la;

    public String getMid() {
        return mid;
    }
    public void setMid(String mid) {
        this.mid = mid;
    }
    public String getUid() {
        return uid;
    }
    public void setUid(String uid) {
        this.uid = uid;
    }
    public String getVc() {
        return vc;
    }
    public void setVc(String vc) {
        this.vc = vc;
    }
    public String getVn() {
        return vn;
    }
    public void setVn(String vn) {
        this.vn = vn;
    }
    public String getL() {
        return l;
    }
    public void setL(String l) {
        this.l = l;
    }
    public String getSr() {
        return sr;
    }
    public void setSr(String sr) {
        this.sr = sr;
    }
    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }
    public String getAr() {

        return ar;
    }
    public void setAr(String ar) {
        this.ar = ar;
    }
    public String getMd() {
        return md;
    }
    public void setMd(String md) {
        this.md = md;
    }
    public String getBa() {
        return ba;
    }
    public void setBa(String ba) {
        this.ba = ba;
    }
    public String getSv() {
        return sv;
    }
    public void setSv(String sv) {
        this.sv = sv;
    }
    public String getG() {
        return g;
    }
    public void setG(String g) {
        this.g = g;
    }
    public String getHw() {
        return hw;
    }
    public void setHw(String hw) {
        this.hw = hw;
    }
    public String getT() {
        return t;
    }
    public void setT(String t) {
        this.t = t;
    }
    public String getNw() {
        return nw;
    }
    public void setNw(String nw) {
        this.nw = nw;
    }

    public String getLn() {
        return ln;
    }
    public void setLn(String ln) {
        this.ln = ln;
    }
    public String getLa() {
        return la;
    }
    public void setLa(String la) {
        this.la = la;
    }
}