package print.dao.impl;

import java.awt.Color;

import print.dao.Ink;

public class ColorInk implements Ink{
	//��ӡ������ɫ
	public String getColor(int r,int g,int b){
		Color color=new Color(r,g,b);
		return "#"+Integer.toHexString(color.getRGB()).substring(2);
	}
}
