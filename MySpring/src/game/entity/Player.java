package game.entity;
/**
 * ���
 * @author ��ʫӣ
 *
 */
public class Player {
	private Equip armet;//ͷ��
	private Equip loricae;//����
	private Equip boot;//ѥ��
	private Equip ring;//ָ��
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
	//����װ��
	public void updateEquip(Equip equip){
		if(("ͷ��").equals(equip.getType())){
			System.out.println(armet.getName()+"����Ϊ"+equip.getName());
			this.armet=equip;
			System.out.println("�������");
		}
		if(("����").equals(equip.getType())){
			System.out.println(loricae.getName()+"����Ϊ"+equip.getName());
			this.loricae=equip;
			System.out.println("�������");
		}
		if(("ѥ��").equals(equip.getType())){
			System.out.println(boot.getName()+"����Ϊ"+equip.getName());
			this.boot=equip;
			System.out.println("�������");
		}
		if(("ָ��").equals(equip.getType())){
			System.out.println("����ָ��");
			System.out.println(ring.getName()+"����Ϊ"+equip.getName());
			this.ring=equip;
			System.out.println("�������");
		}
	}
	
	public void say(Equip equip){
		System.out.println(equip.getName()+"[�ٶ���Ч:"+equip.getSpeedPlus()+";������Ч:"+equip.getAttackPlus()+";������Ч:"+equip.getDefencePlus()+"]");
	}
}
