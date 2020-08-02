package com.atguigu.bean;

/**
 * @projectName:
 * @fileName:
 * @packageName: AppComment
 * @author: Mr.乐
 * @date: 2020/7/23 12:42
 * @copyright(c): 无
 * @versions: 1.0版本
 * @instructions:   评论
 */

public class AppComment {
    //评论表
    private int comment_id;
    //用户ID
    private int userid;
    //父级评论ID(为0则是一级评论，不为0，则是回复)
    private int p_comment_id;
    //评论内容
    private String content;
    //创建时间
    private String addtime;
    //评论的相关id
    private int other_id;
    //点赞数量
    private int praise_count;
    //回复数量
    private int reply_count;

    public int getComment_id() {
        return comment_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }
    public int getUserid() {
        return userid;
    }
    public void setUserid(int userid) {
        this.userid = userid;
    }
    public int getP_comment_id() {
        return p_comment_id;
    }
    public void setP_comment_id(int p_comment_id) {
        this.p_comment_id = p_comment_id;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getAddtime() {
        return addtime;
    }
    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }
    public int getOther_id() {
        return other_id;
    }
    public void setOther_id(int other_id) {
        this.other_id = other_id;
    }
    public int getPraise_count() {
        return praise_count;
    }
    public void setPraise_count(int praise_count) {
        this.praise_count = praise_count;
    }
    public int getReply_count() {
        return reply_count;
    }
    public void setReply_count(int reply_count) {
        this.reply_count = reply_count;
    }
}