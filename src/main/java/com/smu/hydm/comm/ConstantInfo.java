package com.smu.hydm.comm;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.smu.hydm.util.ConfigUtil;

public class ConstantInfo {
	/** 图片保存地址*/
	private String saveImageDir;
	/** 图片下载线程池*/
	public static ExecutorService executorService = Executors.newCachedThreadPool();
	public ConstantInfo() {
		
		this.saveImageDir = ConfigUtil.getValue("saveImageDir");
		
	}


	public String getSaveImageDir() {
		return saveImageDir;
	}


	public void setSaveImageDir(String saveImageDir) {
		this.saveImageDir = saveImageDir;
	}
	
	
	
}
