package hello;
/**
 * �ϻ���ϰ1
 * @author ��ʫӣ
 *
 */
public class Greeting {
	//˵������
	private String person="Nobody";
	//˵��������
	private String words="nothing";
	
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public String getWords() {
		return words;
	}
	public void setWords(String words) {
		this.words = words;
	}
	public Greeting(String person, String words) {
		super();
		this.person = person;
		this.words = words;
	}
	public Greeting() {
		super();
	}
}
