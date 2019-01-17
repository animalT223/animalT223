package print.entity;

import print.dao.*;

/**
 * ��ӡ����
 * @author ��ʫӣ
 *
 */
public class Printer {
	//����ӿڱ�̣������Ǿ����ʵ����
	private Ink ink=null;
	private Paper paper=null;
	public void setInk(Ink ink) {
		this.ink = ink;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	/**
	 * ��ӡ����ӡ����
	 * @param str �����ӡ����
	 */
	public void print(String str){
		//�����ɫ���
		System.out.println("ʹ��"+ink.getColor(255, 200, 0)+"��ɫ��ӡ:\n");
		//���ִ�ӡ��ֽ��
		for(int i=0;i<str.length();i++){
			paper.putInChar(str.charAt(i));
		}
		//��ֽ���������
		System.out.println(paper.getContent());
	}
}
