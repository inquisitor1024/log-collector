package com.atguigu.bean;

/**
 * @projectName:
 * @fileName:
 * @packageName: AppFavorites
 * @author: Mr.乐
 * @date: 2020/7/23 12:48
 * @copyright(c): 无
 * @versions: 1.0版本
 * @instructions:   收藏
 */

public class AppFavorites {
    private int id; //主键
    private int course_id;  //商品ID
    private  int userid;    //用户ID
    private String add_time;    //创建时间

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCourse_id() {
        return course_id;
    }
    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }
    public int getUserid() {
        return userid;
    }
    public void setUserid(int userid) {
        this.userid = userid;
    }
    public String getAdd_time() {
        return add_time;
    }
    public void setAdd_time(String add_time) {
        this.add_time = add_time;
    }
}