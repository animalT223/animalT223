package print.dao;
/**
 * ֽ�Žӿ�
 * @author ��ʫӣ
 *
 */
public interface Paper {
	public static final String newLine="\r\n";
	/**
	 * ���һ���ַ���ֽ��
	 */
	public void putInChar(char c);
	/**
	 * �õ������ֽ�ϵ�����
	 */
	public String getContent();
}
