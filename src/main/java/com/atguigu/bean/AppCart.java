package com.atguigu.bean;



/**
 * @projectName:
 * @fileName:
 * @packageName: AppCart
 * @author: Mr.乐
 * @date: 2020/7/23 12:15
 * @copyright(c): 无
 * @versions: 1.0版本
 * @instructions:   购物车
 */

public class AppCart {
    int itemid;
    int action; // 1、 添加产品进入购物车 2、调整购物车
    int changeNum;   //数量变化
    int beforeNum;   //变化前数量
    int afterNum;   //变化后数量
    Double price;   //加入购物车的单价

    public int getItemid() {
        return itemid;
    }
    public void setItemid(int itemid) {
        this.itemid = itemid;
    }
    public int getAction() {
        return action;
    }
    public void setAction(int action) {
        this.action = action;
    }
    public int getChangeNum() {
        return changeNum;

    }
    public void setChangeNum(int changeNum) {
        this.changeNum = changeNum;
    }
    public int getBeforeNum() {
        return beforeNum;
    }
    public void setBeforeNum(int beforeNum) {
        this.beforeNum = beforeNum;
    }
    public int getAfterNum() {
        return afterNum;
    }
    public void setAfterNum(int afterNum) {
        this.afterNum = afterNum;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
}