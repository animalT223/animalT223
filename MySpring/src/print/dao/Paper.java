package print.dao;
/**
 * 纸张接口
 * @author 刘诗樱
 *
 */
public interface Paper {
	public static final String newLine="\r\n";
	/**
	 * 输出一个字符到纸张
	 */
	public void putInChar(char c);
	/**
	 * 得到输出到纸上的内容
	 */
	public String getContent();
}
