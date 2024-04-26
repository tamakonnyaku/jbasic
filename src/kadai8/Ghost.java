package kadai8;

import java.util.Random;

public class Ghost extends Actor {

	public Ghost(String name, int hp,int mp, int attack, int defense) {
		super(name, hp, mp, attack, defense);
	}

	public void attack(Actor target) {
		Random rand = new Random();
		int bui = rand.nextInt(3);
		int tai = target.getHp();
		int damage;
		System.out.println(this.getName() + "の叫び声！");
		
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
