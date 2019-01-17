package game.entity;
/**
 * 玩家
 * @author 刘诗樱
 *
 */
public class Player {
	private Equip armet;//头盔
	private Equip loricae;//铠甲
	private Equip boot;//靴子
	private Equip ring;//指环
	public Equip getArmet() {
		return armet;
	}
	public void setArmet(Equip armet) {
		this.armet = armet;
	}
	public Equip getLoricae() {
		return loricae;
	}
	public void setLoricae(Equip loricae) {
		this.loricae = loricae;
	}
	public Equip getBoot() {
		return boot;
	}
	public void setBoot(Equip boot) {
		this.boot = boot;
	}
	public Equip getRing() {
		return ring;
	}
	public void setRing(Equip ring) {
		this.ring = ring;
	}
	//升级装备
	public void updateEquip(Equip equip){
		if(("头盔").equals(equip.getType())){
			System.out.println(armet.getName()+"升级为"+equip.getName());
			this.armet=equip;
			System.out.println("升级完成");
		}
		if(("铠甲").equals(equip.getType())){
			System.out.println(loricae.getName()+"升级为"+equip.getName());
			this.loricae=equip;
			System.out.println("升级完成");
		}
		if(("靴子").equals(equip.getType())){
			System.out.println(boot.getName()+"升级为"+equip.getName());
			this.boot=equip;
			System.out.println("升级完成");
		}
		if(("指环").equals(equip.getType())){
			System.out.println("升级指环");
			System.out.println(ring.getName()+"升级为"+equip.getName());
			this.ring=equip;
			System.out.println("升级完成");
		}
	}
	
	public void say(Equip equip){
		System.out.println(equip.getName()+"[速度增效:"+equip.getSpeedPlus()+";攻击增效:"+equip.getAttackPlus()+";防御增效:"+equip.getDefencePlus()+"]");
	}
}
