package com.smu.hydm.comm;

import com.smu.hydm.util.ImageUtil;

/**
 * 下载线程
 * @author wsk
 *
 */
public class DownloadThread implements Runnable{
	public String url_prefix;//url前缀
	public String url_suffix;//url后缀 .jpg
	public String name;//动漫名称
	public String daw;//第几章
	public String totalPage;//总页数
	public Integer startDraw;//开始章数
	public Integer endDraw;//结束章数
	public String drawDesc;//章描述
	/**
	 * 
	 * @param url_prefix url前缀
	 * @param url_suffix url后缀
	 * @param name 动漫名称
	 * @param daw 第几章
	 */
	public DownloadThread(String url_prefix, String url_suffix, String name, String daw) {
		super();
		this.url_prefix = url_prefix;
		this.url_suffix = url_suffix;
		this.name = name;
		this.daw = daw;
	}

	/**
	 * 
	 * @param url_prefix
	 * @param url_suffix
	 * @param name 动漫名称
	 * @param startDraw 开始章数
	 * @param endDraw 结束章数
	 */
	public DownloadThread(String url_prefix, String url_suffix, String name, Integer startDraw, Integer endDraw,String drawDesc) {
		super();
		this.url_prefix = url_prefix;
		this.url_suffix = url_suffix;
		this.name = name;
		this.startDraw = startDraw;
		this.endDraw = endDraw;
		this.drawDesc = drawDesc;
	}


	public void run() {
		for(int i = this.startDraw; i <=this.endDraw;i++) {
			System.out.println(i);
			download(i+this.drawDesc);
		}
	}
	/**
	 * @param draw 下载章节
	 * @description
	 * @author wangSk
	 * @date 2018年2月1日
	 */
	public void download(String downloadDraw) {
		ImageUtil imageUtil = new ImageUtil();
		boolean imageExit = true;
		int page = 1;
		System.out.println(name+":"+"第"+ downloadDraw+ "章已经开始下载");
		while(imageExit) {
			System.out.println(name+":"+"第"+ downloadDraw+ "章"+"第"+page+"页正在下载...");
			String url = this.url_prefix + "/" + this.name + "/"+ downloadDraw + "/"+ page + this.url_suffix;
			imageExit = imageUtil.downloadImage(url, downloadDraw + "-" +page, ".jpg");
			page++;
		}
		System.out.println(name+":"+"第"+ downloadDraw + "章已经下载完成");
	}
}
