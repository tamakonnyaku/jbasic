package kadai8;

import java.util.Random;

public class Actor {
	// フィールド（名前、生命力、攻撃力）
	private String name;
	private int maxHp;
	private int hp;
	private int attack;
	private int defense;
	private int mp;
	private int maxMp;

	// コンストラクタ
	public Actor(String name, int hp,int mp, int attack, int defense) {
		this.name = name;
		this.maxHp = hp;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
		this.mp = mp;
		this.maxMp = mp;
	}

	// ゲッター、セッター
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getAttack() {
		return this.attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	public int getDefense() {
		return this.defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	// 情報取得用toStringメソッド
	public String toString() {
		return this.name + "(HP:" + hp + "/" + maxHp + ")(MP:" + mp + "/" + maxMp + ")";
	}

	// 攻撃メソッド（★追加）
	public void attack(Actor target) {
		if (this.getHp() != 0 && target.getHp() != 0) {
			target.hp -= this.attack;
			//System.out.println(this.name + "の攻撃");
			System.out.println(target.name + "に" + this.attack + "のダメージを与えた！");
			if (target.hp < 0) {
				target.hp = 0;
			}
		}
	}
	
	public void attack2(Actor target) {
		if (this.getHp() != 0 && target.getHp() != 0) {
			target.hp -= this.attack;
			//System.out.println(this.name + "の攻撃");
			System.out.println(target.name + "に" + this.attack + "のダメージを与えた！");
			if (target.hp < 0) {
				target.hp = 0;
			}
		}
	}

	public void heal() {
		int heal = this.getHp() + this.maxHp / 2;
		if (heal > maxHp) {
			heal = maxHp;
		}
		this.setHp(heal);
		System.out.println(this.getName() + "はHPを回復した！");
	}

	public void status() {
		System.out.println(toString());
		double hp100 = 100*this.hp/this.maxHp;
		
		if (hp100 > 90 ) {
			System.out.println("[██████████]");
		}else if(hp100 >80) {
			System.out.println("[█████████ ]");
		}else if(hp100 >70) {
			System.out.println("[████████  ]");
		}else if(hp100 >60) {
			System.out.println("[███████   ]");
		}else if(hp100 >50) {
			System.out.println("[██████    ]");
		}else if(hp100 >40) {
			System.out.println("[█████     ]");
		}else if(hp100 >30) {
			System.out.println("[████      ]");
		}else if(hp100 >20) {
			System.out.println("[███       ]");
		}else if(hp100 >10) {
			System.out.println("[██        ]");
		}else if(hp100 >0) {
			System.out.println("[█         ]");
		}else{
			System.out.println("[          ]");
		}
	}

	public static Actor randomEnemy() {
		Random rand = new Random();
		int num = rand.nextInt(100);
		Zombie z1 = new Zombie("貴仁",20,0, 15,15);
		Zombie z2 = new Zombie("ネオゾンビ",30,0, 20,20);
		Zombie z3 = new Zombie("キングゾンビ",100,0, 25,25);
		Ghost g1 = new Ghost("ゴースト",30,0, 35,5);
		Ghost g2 = new Ghost("キングゴースト",150,0, 40,10);
		Ghost g3 = new Ghost("メタルゴースト",30,0, 30,300);
		Hero h1 = new Hero("川島",777,77,77,77);
		if (num > 80) {
			return z1;
		} else if (num > 60) {
			return z2;
		} else if (num > 40) {
			return g1;
		} else if (num > 21) {
			return z3;
		} else if (num > 11) {
			return g3;
		} else if(num > 2){
			return g2;
		}else {
			return h1;
		}
	}
	
	public int damageCalculation(int attack, int defense) {
		int damage = attack - defense;
		if(damage < 0) {
			damage = 0;
		}
		return damage;
	}
}