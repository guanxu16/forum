package com.forum.util;

import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;

import java.io.IOException;

/**
 * Created by gxlly on 2017/4/1.
 */
public class QiniuSDKUtil {

    private static String ACCESS_KEY= MyConstant.QINIU_ACCESS_KEY;
    private static String SECRET_KEY= MyConstant.QINIU_SECRET_KEY;
    private static String BUCKET_NAME= MyConstant.QINIU_BUCKET_NAME;

    // 密钥配置
    private static Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
    // 创建上传对象
    private static UploadManager uploadManager = new UploadManager(new Configuration(Zone.zone2()));

    // 简单上传，使用默认策略，只需要设置上传的空间名就可以了
    public static String getUpToken() {
        return auth.uploadToken(BUCKET_NAME);
    }

    public static void upload(byte[] localData,String remoteFileName) throws IOException {
        Response res = uploadManager.put(localData, remoteFileName, getUpToken());
        // 打印返回的信息
        System.out.println(res.bodyString());
    }
}
