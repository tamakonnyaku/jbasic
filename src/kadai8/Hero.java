package kadai8;

import java.util.Random;
import java.util.Scanner;

public class Hero extends Actor {

	private int livel;
	Weapon weapon;
	Equipment[] equipments;
	final Magic[] magic = { new Magic("メラ", 2, 10),
			new Magic("メラミ", 5, 20),
			new Magic("メラゾーマ", 10, 30),
			new Magic("メラガイヤー", 20, 50) };

	public Hero(String name, int hp, int mp, int attack, int defense) {
		super(name, hp, mp, attack, defense);
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

	public Equipment[] getEquipments() {
		return equipments;
	}

	public void setEquipments(Equipment[] equipments) {
		this.equipments = equipments;
	}

	public Magic[] getMagic() {
		return magic;
	}

	public void attack(Actor target) {
		
		if (this.weapon == null) {
			System.out.println(this.getName() + "は素手で殴った");
			int tai = target.getHp();
			int damage = damageCalculation(this.getAttack(),target.getDefense());
			tai -= damage;
			//System.out.println(this.name + "の攻撃");
			System.out.println(target.getName() + "に" + damage + "のダメージを与えた！");
			if (tai < 0) {
				tai = 0;
			}
			target.setHp(tai);
		} else {
			System.out.println(this.getName() + "は" + this.weapon.getName() + "で攻撃した！");
			int tai = target.getHp();
			int damage = damageCalculation(this.getAttack()+this.weapon.getOffensivePower(),target.getDefense());
			tai -= damage;
			//System.out.println(this.name + "の攻撃");
			System.out.println(target.getName() + "に" + damage + "のダメージを与えた！");
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
		} else {
			System.out.println("まだレベルが足らない");
		}
	}

	public void magicList() {
		System.out.println("魔法リスト\n");
		System.out.println("魔法の名前（消費MP/威力）");
		System.out.println("----------------");
		for (int i = 0; i <= this.livel; i++) {
			System.out.println("[" + (i + 1) + "]　" + this.getMagic()[i].getName() + "(" +
					this.getMagic()[i].getMagicPoint() + "/" +
					this.getMagic()[i].getMagicPower() + ")");
		}
		System.out.println("----------------");
	}

	public void magicAttack(Actor target) {
		for (int i = 0; i < 1; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.print("何番の魔法を使いますか？：");
			int selct = scan.nextInt();
			if (selct - 1 <= livel) {
				this.getMagic()[selct - 1].magicAttack(this, target);
			} else {
				System.out.println("覚えている魔法を選択してください");
				i--;
			}
		}
	}
}
