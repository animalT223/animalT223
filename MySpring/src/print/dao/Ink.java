package print.dao;
/**
 * 墨盒接口
 * @author 刘诗樱
 *
 */
public interface Ink {
	/**
	 * 定义打印采用的颜色的方法
	 * @param r 红
	 * @param g 绿
	 * @param b 蓝
	 * @return 颜色
	 */
	public String getColor(int r,int g,int b);
}
