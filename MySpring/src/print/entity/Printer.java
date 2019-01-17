package print.entity;

import print.dao.*;

/**
 * 打印程序
 * @author 刘诗樱
 *
 */
public class Printer {
	//面向接口编程，并不是具体的实现类
	private Ink ink=null;
	private Paper paper=null;
	public void setInk(Ink ink) {
		this.ink = ink;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	/**
	 * 打印机打印方法
	 * @param str 传入打印内容
	 */
	public void print(String str){
		//输出颜色标记
		System.out.println("使用"+ink.getColor(255, 200, 0)+"颜色打印:\n");
		//逐字打印到纸张
		for(int i=0;i<str.length();i++){
			paper.putInChar(str.charAt(i));
		}
		//将纸张内容输出
		System.out.println(paper.getContent());
	}
}
