package hello;
/**
 * 上机练习1
 * @author 刘诗樱
 *
 */
public class Greeting {
	//说话的人
	private String person="Nobody";
	//说话的内容
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
