package com.xzq.user.biz.email.service.impl;

import com.google.common.collect.Maps;
import com.xzq.user.biz.email.service.EmailService;
import freemarker.core.ParseException;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.IOException;
import java.util.Map;

@Service
public class EmailServiceImpl implements EmailService {

    @Value("${spring.mail.username}")
    private String emailFrom;

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private FreeMarkerConfigurer freeMarkerConfigurer;

    @Override
    public void sendSimpleEmail(String sendTo, String title, String content) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(emailFrom);
        simpleMailMessage.setTo(sendTo);
        simpleMailMessage.setSubject(title);
        simpleMailMessage.setText(content);

        javaMailSender.send(simpleMailMessage);
    }

    @Override
    public void sendAttachmentEmail(String sendTo, String title, String content, File file) {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();

        try {
            //multipart设置为true，才能把附件发送出去
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
            mimeMessageHelper.setFrom(emailFrom);
            mimeMessageHelper.setTo(sendTo);
            mimeMessageHelper.setSubject(title);
            mimeMessage.setText(content);

            //封装附件
            FileSystemResource fileSystemResource =new FileSystemResource(file);
            mimeMessageHelper.addAttachment("附件",fileSystemResource);

        } catch (MessagingException e) {
            e.printStackTrace();
        }

        javaMailSender.send(mimeMessage);
    }


    @Override
    public void sendTemplateEmail(String sendTo, String title, String templateName) {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();

        try {
            //multipart设置为true，才能把附件发送出去
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
            mimeMessageHelper.setFrom(emailFrom);
            mimeMessageHelper.setTo(sendTo);
            mimeMessageHelper.setSubject(title);

            Map<String, Object> data = Maps.newHashMap();
            data.put("userName","志强");
            Template template = freeMarkerConfigurer.getConfiguration().getTemplate(templateName);
            String html = FreeMarkerTemplateUtils.processTemplateIntoString(template,data);

            mimeMessageHelper.setText(html,true);
        } catch (Exception e) {
            e.printStackTrace();
        }

        javaMailSender.send(mimeMessage);
    }
}
