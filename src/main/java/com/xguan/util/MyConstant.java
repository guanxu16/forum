package com.fc.util;


public class MyConstant {
    //七牛云相关
    /*public static final String QINIU_IMAGE_URL = ConfigPropertiesUtil.getProp("qiniu.url");
    public static final String QINIU_ACCESS_KEY = ConfigPropertiesUtil.getProp("qiniu.accessKey");
    public static final String QINIU_SECRET_KEY = ConfigPropertiesUtil.getProp("qiniu.secretKey");
    public static final String QINIU_BUCKET_NAME = ConfigPropertiesUtil.getProp("qiniu.bucketName");
    public static final String MAIL_FROM = ConfigPropertiesUtil.getProp("mail.host");
    public static final String DOMAIN_NAME = ConfigPropertiesUtil.getProp("project.domain");*/
    //七牛相关配置url
    public static final String QINIU_IMAGE_URL = "XXX";
    //七牛相关配置accessKey
    public static final String QINIU_ACCESS_KEY = "XXX";
    //七牛相关配置SECRETKEY
    public static final String QINIU_SECRET_KEY = "XXXXX";
    //七牛相关配置:空间名
    public static final String QINIU_BUCKET_NAME = "XXXXX";

    //发送邮件的邮箱，要与df.properties中的一致
    public static final String MAIL_FROM = "XXXXXXXXX";

    //域名
    public static final String DOMAIN_NAME = "http://localhost:8080/";

    //三种操作
    public static final int OPERATION_CLICK_LIKE = 1;
    public static final int OPERATION_REPLY = 2;
    public static final int OPERATION_COMMENT = 3;

}
