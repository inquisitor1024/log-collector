package com.atguigu.bean;

/**
 * @projectName:
 * @fileName:
 * @packageName: AppDisplay
 * @author: Mr.乐
 * @date: 2020/7/23 11:37
 * @copyright(c): 无
 * @versions: 1.0版本
 * @instructions:
 *      商品点击日志
 */

public class AppDisplay {
    //动作: 曝光商品=1，点击商品=2
    private String action;
    //商品ID(服务端下发的ID)
    private String goodsid;
    //顺序(第几件商品，第一条0，第二条1，依次类推)
    private String place;
    //曝光类型:1 - 首次曝光 2 - 重复曝光(没有使用)
    private String extend1;
    //分类ID(服务器定义的分类ID)
    private String category;

    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }
    public String getGoodsid() {
        return goodsid;
    }
    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid;
    }
    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public String getExtend1() {
        return extend1;
    }
    public void setExtend1(String extend1) {
        this.extend1 = extend1;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}