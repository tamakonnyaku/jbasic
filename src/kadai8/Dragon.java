package kadai8;

import java.util.Random;

public class Dragon extends Actor {

	private int superAttack;
	
	public Dragon(int hp, int attack,int superAttack,int defense) {
		super("ドラゴン", hp, attack, defense);
		this.superAttack = superAttack;
	}

	public int getSuperAttack() {
		return this.superAttack;
	}

	public void setSuperAttack(int superAttack) {
		this.superAttack = superAttack;
	}
	
	public void attack(Actor target) {
		if (target instanceof Hero) {
			Random rand = new Random();
			int num = rand.nextInt(5);
			if(num == 0) {
			System.out.println(this.getName() + "のファイヤーブレス！！");
			int tai = target.getHp();
			tai -= this.superAttack-target.get;
			//System.out.println(this.name + "の攻撃");
			System.out.println(target.getName() + "に" + this.superAttack + "のダメージを与えた！");
			if (tai < 0) {
				tai = 0;
			}
			target.setHp(tai);
			}else{
				System.out.println(this.getName() + "が嚙みついてきた！");
				int tai = target.getHp();
				tai -= this.getAttack();
				//System.out.println(this.name + "の攻撃");
				System.out.println(target.getName() + "に" + this.getAttack() + "のダメージを与えた！");
				if (tai < 0) {
					tai = 0;
				}
				target.setHp(tai);
			}
		}
	}
}