package kadai8;

import java.util.Random;

public class Hero extends Actor {

	private int livel;
	Weapon weapon;
	Equipment[] equipments;

	public Hero(String name,int hp, int attack,int defense) {
		super(name, hp, attack,defense);
		this.livel = 0;
	}
	
	public int getLivel() {
		return this.livel;
	}

	public void setLivel(int livel) {
		this.livel = livel;
	}
	
	public Weapon getWeapon() {
		return this.weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public void attack(Actor target) {
		if (this.weapon == null) {
			System.out.println(this.getName() + "は素手で殴った");
			int tai = target.getHp();
			tai -= this.getAttack();
			//System.out.println(this.name + "の攻撃");
			System.out.println(target.getName() + "に" + this.getAttack() + "のダメージを与えた！");
			if (tai < 0) {
				tai = 0;
			}
			target.setHp(tai);
		}else {
			System.out.println(this.getName() + "は" + this.weapon.getName() + "で攻撃した！");
			int tai = target.getHp();
			tai -= this.getAttack()+this.weapon.getOffensivePower();
			//System.out.println(this.name + "の攻撃");
			System.out.println(target.getName() + "に" + (this.getAttack()+this.weapon.getOffensivePower()) + "のダメージを与えた！");
			if (tai < 0) {
				tai = 0;
			}
			target.setHp(tai);
		}
	}

	public void attack2(Actor target) {
		if (this.livel >= 2) {

			Random rand = new Random();
			int num = rand.nextInt(3);
			if (num == 0/*||num == 1||num == 2*/) {
				System.out.println(this.getName() + "はハンマーで叩いた！");
				int tai = target.getHp();
				tai -= target.getHp();
				
				System.out.println(target.getName() + "に" + target.getHp() + "のダメージを与えた！");
				if (tai < 0) {
					tai = 0;
				}
				target.setHp(tai);
			} else {
				System.out.println(this.getName() + "はハンマーで叩いた！");

				//System.out.println(this.name + "の攻撃");
				System.out.println(target.getName() + "に" + 0 + "のダメージを与えた！");

			}
		}else {
			System.out.println("まだレベルが足らない");
		}
	}

}
