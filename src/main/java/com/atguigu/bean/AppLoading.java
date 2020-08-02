package com.atguigu.bean;

/**
 * @projectName:
 * @fileName:
 * @packageName: AppLoading
 * @author: Mr.乐
 * @date: 2020/7/23 12:00
 * @copyright(c): 无
 * @versions: 1.0版本
 * @instructions:   商品列表
 */

public class AppLoading {
    //动作: 开始加载 =1 ，加载成功=2，加载失败=3
    private String action;
    //加载时长，计算下拉开始到接口返回数据的时间(开始加载报0，加载成功或加载失败才上报时间)
    private String loading_time;
    //加载类型:1- 读取缓存，2- 从接口拉新数据(加载成功才上报加载类型)
    private String loading_way;
    //扩展字段 Extendl
    private String extend1;
    //扩展字段 Extend2
    private String extend2;
    //加载类型: 自动加载=1 用户下拽加载=2 底部加载=3(底部触发的点击底部提示条/点击返回顶部加载)
    private String type;
    //加载失败码，把加载失败状态码报回来(报空为加载成功，没有则失败)
    private String type1;

    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }
    public String getLoading_time() {
        return loading_time;
    }
    public void setLoading_time(String loading_time) {
        this.loading_time = loading_time;
    }
    public String getLoading_way() {
        return loading_way;
    }
    public void setLoading_way(String loading_way) {
        this.loading_way = loading_way;
    }
    public String getExtend1() {
        return extend1;
    }

    public void setExtend1(String extend1) {
        this.extend1 = extend1;
    }
    public String getExtend2() {
        return extend2;
    }
    public void setExtend2(String extend2) {
        this.extend2 = extend2;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getType1() {
        return type1;
    }
    public void setType1(String type1) {
        this.type1 = type1;
    }
}