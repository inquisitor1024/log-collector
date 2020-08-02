package com.atguigu.bean;

/**
 * @projectName:
 * @fileName:
 * @packageName: AppNotification
 * @author: Mr.乐
 * @date: 2020/7/23 12:38
 * @copyright(c): 无
 * @versions: 1.0版本
 * @instructions:   消息通知日志
 */

public class AppNotification {
    //动作:通知产生=1，通知弹出=2，通知点击=3，常驻通知展示(不重复上报，一天之内只报依次)=4
    private String action;
    //通知ID:预警通知=1，天气预报(早=2，晚=3), 常驻=4
    private String type;
    //客户端弹出时间
    private String ap_time;
    //备用字段
    private String content;

    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getAp_time() {
        return ap_time;
    }
    public void setAp_time(String ap_time) {
        this.ap_time = ap_time;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}