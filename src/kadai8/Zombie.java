package kadai8;

public class Zombie extends Actor {

	public Zombie(String name,int hp, int attack,int defense) {
		super(name, hp, attack,defense);
	}

	public void attack(Actor target) {
		if (this.getHp() != 0 && target.getHp() != 0) {
			System.out.println(this.getName() + "の体当たり");
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
