package com.xzq.user.biz.email.service;

import java.io.File;

public interface EmailService {

    /**
     * 发送简单的邮件
     * @param sendTo 发给谁
     * @param title 邮件标题
     * @param content 邮件内容
     */
    void sendSimpleEmail(String sendTo, String title, String content);

    /**
     * 发送带附件的邮件
     * @param sendTo 发给谁
     * @param title 邮件标题
     * @param content 邮件内容
     * @param file 附件
     */
    void sendAttachmentEmail(String sendTo, String title, String content, File file);

    /**
     * 发送模板邮件
     * @param sendTo 发给谁
     * @param title 邮件标题
     * @param template 模板名字
     */
    void sendTemplateEmail(String sendTo, String title, String template);


}
