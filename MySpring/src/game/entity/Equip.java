package game.entity;
/**
 * װ��
 * @author ��ʫӣ
 *
 */
public class Equip {
	private String name;//װ������
	private String type;//װ������
	private Long speedPlus;//�ٶ���Ч
	private Long attackPlus;//������Ч
	private Long defencePlus;//������Ч
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Long getSpeedPlus() {
		return speedPlus;
	}
	public void setSpeedPlus(Long speedPlus) {
		this.speedPlus = speedPlus;
	}
	public Long getAttackPlus() {
		return attackPlus;
	}
	public void setAttackPlus(Long attackPlus) {
		this.attackPlus = attackPlus;
	}
	public Long getDefencePlus() {
		return defencePlus;
	}
	public void setDefencePlus(Long defencePlus) {
		this.defencePlus = defencePlus;
	}
	
}
