package print.dao.impl;

import print.dao.Paper;

public class TestPaper implements Paper{
	//ÿ�е��ַ���
	private int charPerLine=16;
	//ÿҳ����
	private int linePerPage=5;
	//ֽ���ֵ�����
	private String content="";
	//��ǰ����λ�ã���0��charPerLine-1
	private int posX=0;
	//��ǰ����,��0��linePerPage-1
	private int posY=0;
	//��ǰҳ��
	private int posP=1;
	public String getContent() {
		String ret=this.content;
		//���뱾ҳ���У�����ʾҳ��
		if(!(posX==0&&posY==0)){
			int count=linePerPage-posY;
			for (int i = 0; i < count; i++) {
				ret+=Paper.newLine;
			}
			ret+="==��"+posP+"ҳ==";
		}
		return ret;
	}
	public void putInChar(char c) {
		content+=c;
		++posX;
		//�ж��Ƿ���
		if(posX==charPerLine){
			content+=Paper.newLine;
			posX=0;
			++posY;
		}
		//�ж��Ƿ�ҳ
		if(posY==linePerPage){
			content+="==��"+posP+"ҳ==";
			content+=Paper.newLine+Paper.newLine;
			posY=0;
			++posP;
		}
	}
	public void setCharPerLine(int charPerLine) {
		this.charPerLine = charPerLine;
	}
	public void setLinePerPage(int linePerPage) {
		this.linePerPage = linePerPage;
	}
	
}
