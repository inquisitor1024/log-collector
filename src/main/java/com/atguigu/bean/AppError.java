package com.atguigu.bean;

/**
 * @projectName:
 * @fileName:
 * @packageName: AppError
 * @author: Mr.乐
 * @date: 2020/7/23 11:34
 * @copyright(c): 无
 * @versions: 1.0版本
 * @instructions:   错误日志
 */

public class AppError {
    //错误摘要
    private String errorBrief;
    //错误详情
    private String errorDetail;

    public String getErrorBrief() {
        return errorBrief;
    }
    public void setErrorBrief(String errorBrief) {
        this.errorBrief = errorBrief;
    }
    public String getErrorDetail() {
        return errorDetail;
    }
    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
    }
}