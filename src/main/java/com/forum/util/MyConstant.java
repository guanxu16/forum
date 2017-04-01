package com.forum.util;


public class MyConstant {
    //七牛云相关
    public static final String QINIU_IMAGE_URL = ConfigPropertiesUtil.getProp("qiniu.url");
    public static final String QINIU_ACCESS_KEY = ConfigPropertiesUtil.getProp("qiniu.accessKey");
    public static final String QINIU_SECRET_KEY = ConfigPropertiesUtil.getProp("qiniu.secretKey");
    public static final String QINIU_BUCKET_NAME = ConfigPropertiesUtil.getProp("qiniu.bucketName");
    //发送邮件的邮箱
    public static final String MAIL_FROM = ConfigPropertiesUtil.getProp("mail.host");
    //域名
    public static final String DOMAIN_NAME = ConfigPropertiesUtil.getProp("project.domain");
    //三种操作
    public static final int OPERATION_CLICK_LIKE = 1;
    public static final int OPERATION_REPLY = 2;
    public static final int OPERATION_COMMENT = 3;

}
