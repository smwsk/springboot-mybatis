package com.smu.hydm.util;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @description 图像工具类
 * @version 1.0.0
 * @author wangSk
 * @date 创建时间2018年1月31日
 */
public class ImageUtil {
	/**
	 * 
	 * @param downloadUrl 下载地址
	 * @param ImageName 图像名称
	 * @param suffix 后缀名
	 * @description 下载保存图片
	 * @author wangSk
	 * @date 2018年1月31日
	 */
	public boolean downloadImage(String downloadUrl,String ImageName,String suffix) {
		URL url = null;
        try {
            url = new URL(downloadUrl);
            DataInputStream dataInputStream = new DataInputStream(url.openStream());
            String imageName = ConfigUtil.getValue("saveImageDir") + "/" +ImageName + suffix;

            FileOutputStream fileOutputStream = new FileOutputStream(new File(imageName));
            ByteArrayOutputStream output = new ByteArrayOutputStream();

            byte[] buffer = new byte[1024];
            int length;

            while ((length = dataInputStream.read(buffer)) > 0) {
                output.write(buffer, 0, length);
            }
            byte[] context=output.toByteArray();
            fileOutputStream.write(output.toByteArray());
            dataInputStream.close();
            fileOutputStream.close();
            return true;
        } catch (MalformedURLException e) {
//            e.printStackTrace();
            return false;
        } catch (IOException e) {
//        	e.printStackTrace();
        	return false;
        }
	}
}
