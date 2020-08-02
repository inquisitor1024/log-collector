package com.atguigu.bean;

/**
 * @projectName:
 * @fileName:
 * @packageName: AppNewsDetail
 * @author: Mr.乐
 * @date: 2020/7/23 14:07
 * @copyright(c): 无
 * @versions: 1.0版本
 * @instructions:
 */

public class AppNewsDetail {
    //页面入口来源:应用首页=1,push =2,详细页相关推荐=3
    private String entry;
    //动作: 开始加载=1，加载成功=2(pv),加载失败=3，退出页面=4
    private String action;
    //商品ID(服务端下发的ID)
    private String goodsid;
    //商品样式:0、无图 1、一张大图 2、两张图 3、三张小图 4、一张小图 5、一张大图两种小图
    //来源于详细页相关的推荐商品，上报样式都为0(因为都市左文右图)
    private String showtype;
    //页面停留时长，从商品开始加载时开始计算，到用户关闭页面所用的时间，若中途用跳转到其他页面了
    //则暂停计时，待回到详情页时恢复计时，或中途划出的时间超过10分钟，则本次计时作为，不上报本次
    //如为加载成功退出，则报空
    private String news_staytime;
    //加载时长，计算页面开始加载到接口返回数据的时间(开始加载报0，加载成功或加载失败才上报时间)
    private String loading_time;
    //加载失败码，把加载失败状态码报回来(报空为加载成功，没有失败)
    private String type1;
    //分类ID(服务器定义的分类ID)
    private String category;

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

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

    public String getShowtype() {
        return showtype;
    }

    public void setShowtype(String showtype) {
        this.showtype = showtype;
    }

    public String getNews_staytime() {
        return news_staytime;
    }

    public void setNews_staytime(String news_staytime) {
        this.news_staytime = news_staytime;
    }

    public String getLoading_time() {
        return loading_time;
    }

    public void setLoading_time(String loading_time) {
        this.loading_time = loading_time;
    }

    public String getType1() {
        return type1;

    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

