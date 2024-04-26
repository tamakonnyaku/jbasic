package kadai8;

import java.util.Random;

public class Dragon extends Actor {

	private int superAttack;

	public Dragon(int hp,int mp, int attack, int superAttack, int defense) {
		super("ドラゴン", hp, mp, attack, defense);
		this.superAttack = superAttack;
	}

	public int getSuperAttack() {
		return this.superAttack;
	}

	public void setSuperAttack(int superAttack) {
		this.superAttack = superAttack;
	}

	public void attack(Actor target) {
		Random rand = new Random();
		int num = rand.nextInt(5);
		int bui = rand.nextInt(3);
		int tai = target.getHp();
		int damage;
		if (num == 0) {
			System.out.println(this.getName() + "のファイヤーブレス！！");
			if(bui == 0) {
				System.out.println("頭に当たった！");
				damage = damageCalculation(this.superAttack,(target.getDefense() + ((Hero)target).equipments[0].getDefensePower()));
				tai -= damage;
				System.out.println(target.getName() + "に" + damage + "のダメージを与えた！");
			}else if(bui == 1) {
				System.out.println("胴体に当たった！");
				damage = damageCalculation(this.superAttack,(target.getDefense() + ((Hero)target).equipments[1].getDefensePower()));
				tai -= damage;
				System.out.println(target.getName() + "に" + damage + "のダメージを与えた！");
			}else if(bui == 2) {
				System.out.println("脚に当たった！");
				damage = damageCalculation(this.superAttack,(target.getDefense() + ((Hero)target).equipments[2].getDefensePower()));
				tai -= damage;
				
				System.out.println(target.getName() + "に" + damage + "のダメージを与えた！");
			}
			if (tai < 0) {
				tai = 0;
			}
			target.setHp(tai);
		}else {
			System.out.println(this.getName() + "が嚙みついてきた！");
			if(bui == 0) {
				System.out.println("頭に当たった！");
				damage = damageCalculation(this.getAttack(),(target.getDefense() + ((Hero)target).equipments[0].getDefensePower()));
				tai -= damage;
				System.out.println(target.getName() + "に" + damage + "のダメージを与えた！");
			}else if(bui == 1) {
				System.out.println("胴体に当たった！");
				damage = damageCalculation(this.getAttack(),(target.getDefense() + ((Hero)target).equipments[1].getDefensePower()));
				tai -= damage;
				System.out.println(target.getName() + "に" + damage + "のダメージを与えた！");
			}else if(bui == 2) {
				System.out.println("脚に当たった！");
				damage = damageCalculation(this.getAttack(),(target.getDefense() + ((Hero)target).equipments[2].getDefensePower()));
				tai -= damage;
				
				System.out.println(target.getName() + "に" + damage + "のダメージを与えた！");
			}
			if (tai < 0) {
				tai = 0;
			}
			target.setHp(tai);
		}

	}
	
	
}