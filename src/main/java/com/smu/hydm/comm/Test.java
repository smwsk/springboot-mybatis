package com.smu.hydm.comm;

/**
 * @description 
 * @version 1.0.0
 * @author wangSk
 * @date 创建时间2018年1月31日
 */
public class Test {
	
	public static void main(String[] args) {
		/*DownloadThread downloadThread = new DownloadThread("http://mhpic.manhualang.com/comic/J",
				".jpg-mht.middle","绝世唐门","118话SM");*/
		DownloadThread downloadThread = new DownloadThread("http://mhpic.manhualang.com/comic/J",
				".jpg-mht.middle","绝世唐门",1,84,"话");
		DownloadThread downloadThread2 = new DownloadThread("http://mhpic.manhualang.com/comic/J",
				".jpg-mht.middle","绝世唐门",85,129,"话SM");
		ConstantInfo.executorService.submit(downloadThread);
		ConstantInfo.executorService.submit(downloadThread2);
	}
	
}
