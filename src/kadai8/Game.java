package kadai8;

import java.util.Random;
import java.util.Scanner;

public class Game {

	// スキャナークラス（フィールド）
	private static Scanner scan = new Scanner(System.in);
	private static Random rand = new Random();

	public static void main(String[] args) {

		int hen1 = 1, hen2 = 1, hen3 = 1;

		System.out.println("★★★ゲーム開始★★★");
		// 🦸勇者（生命力：50、攻撃力：10）の生成と情報の表示
		Hero yusya = new Hero("勇者", 50, 50, 10, 5);
		Weapon[] weapons = { new Weapon("こん棒", 5),
				new Weapon("どうの剣", 10),
				new Weapon("奇跡の剣", 20),
				new Weapon("プラチナソード", 30),
				new Weapon("勇者の剣", 50) };

		Equipment[] equipmenty = new Equipment[5];

		Equipment[] equipments0 = { new Equipment("かわのぼうし", 5),
				new Equipment("きのぼうし", 10),
				new Equipment("はねのぼうし", 15),
				new Equipment("太陽の冠", 20),
				new Equipment("はぐれメタルヘルム", 30) };

		Equipment[] equipments1 = { new Equipment("ぬののふく", 5),
				new Equipment("みかわしの服", 10),
				new Equipment("ドラゴンメイル", 15),
				new Equipment("魔法の鎧", 20),
				new Equipment("はぐれメタルの鎧", 30) };

		Equipment[] equipments2 = { new Equipment("かわの靴", 5),
				new Equipment("プクリポの靴", 10),
				new Equipment("天使のブーツ", 15),
				new Equipment("魔法使いのブーツ", 20),
				new Equipment("はぐれメタルの靴", 30) };

		Weapon weapon1 = randomWeapon(weapons);
		equipmenty[0] = randomEquipment(equipments0);
		equipmenty[1] = randomEquipment(equipments1);
		equipmenty[2] = randomEquipment(equipments2);
		System.out.println(yusya);
		partition();
		yusya.setWeapon(weapon1);
		System.out.println(yusya.getName() + "は「" + weapon1.getName() + "」を見つけ、装備した");
		yusya.setEquipments(equipmenty);
		System.out.println(yusya.getName() + "は「" + yusya.equipments[0].getName() + "」を見つけ、装備した\n" +
				yusya.getName() + "は「" + yusya.equipments[1].getName() + "」を見つけ、装備した\n" +
				yusya.getName() + "は「" + yusya.equipments[2].getName() + "」を見つけ、装備した");
		partition();
		// 🦸ゾンビ（生命力：15、攻撃力：5）の生成と情報の表示
		Actor[] en = new Actor[3];
		for (int i = 0; i < en.length; i++) {
			en[i] = Actor.randomEnemy();

		}
		Dragon dragon = new Dragon(250, 0, 30, 70, 20);

		for (int i = 0; i < en.length; i++) {

			while (true) {

				if (hen1 == 1) {
					System.out.println(en[i] + "があらわれた");
					partition();
					hen1 = 0;
				}
				System.out.println("ステータス");
				yusya.status();
				en[i].status();
				partition();
				// 勇者から敵への攻撃
				System.out.print("どうしますか？\n[1]攻撃 [2]回復 [3]魔法 [4]逃げる：");

				int selct = scan.nextInt();
				partition();
				for (int j = 0; j < 1; j++) {
					if (selct == 1) {
						attack(yusya, en[i]);
						if (en[i].getHp() == 0) {
							yusya.setLivel(yusya.getLivel() + 1);
						}
					} else if (selct == 2) {
						yusya.heal();
						System.out.println(yusya);
						partition();
					} else if (selct == 3) {
						yusya.magicList();
						yusya.magicAttack(en[i]);
						if (en[i].getHp() == 0) {
							System.out.println(en[i].getName() + "を倒した！");
							System.out.println(yusya.getName() + "のレベルが上がった");
							yusya.setLivel(yusya.getLivel() + 1);

						}
						partition();
					} else if (selct == 4) {

						if (ranAway(yusya, en[i]) == true) {
							en[i] = Actor.randomEnemy();
							hen1 = 1;
							continue;
						} else {
							System.out.print("どうしますか？\n[1]攻撃 [2]回復 [3]魔法 [4]逃げる：");
							selct = scan.nextInt();
							j--;
						}
					} else {
						System.out.println("1,2,3のどれかを選択してください");
						System.out.print("どうしますか？\n[1]攻撃 [2]回復 [3]魔法 [4]逃げる：");
						selct = scan.nextInt();
						j--;
					}
				}
				// 敵から勇者への攻撃
				if (hen1 == 0) {
					enemy(en[i], yusya);
					if (yusya.getHp() == 0) {
						break;
					}
				}

				if (en[i].getHp() == 0) {

					break;
				}
			}
		}
		System.out.println("すべての敵を倒した！");
		partition();

		if (yusya.getHp() != 0) {
			while (true) {
				if (dragon.getHp() > 0) {
					if (hen1 == 1) {
						System.out.println(dragon + "があらわれた");
						partition();
						hen1 = 0;
					}
					System.out.println("ステータス");
					yusya.status();
					dragon.status();
					partition();
					// 勇者から敵への攻撃
					System.out.print("どうしますか？\n[1]攻撃 [2]回復 [3]魔法 [4]逃げる：");

					int selct = scan.nextInt();
					partition();
					for (int i = 0; i < 1; i++) {
						if (selct == 1) {
							attack(yusya, dragon);
							if (dragon.getHp() == 0) {
								yusya.setLivel(yusya.getLivel() + 1);

							}
						} else if (selct == 2) {
							yusya.heal();
							System.out.println(yusya);
							partition();
						} else if (selct == 3) {
							yusya.magicList();
							yusya.magicAttack(dragon);
							if (dragon.getHp() == 0) {
								System.out.println(dragon.getName() + "を倒した！");
								System.out.println(yusya.getName() + "のレベルが上がった");
								yusya.setLivel(yusya.getLivel() + 1);

							}
							partition();
						} else if (selct == 4) {

							if (ranAway(yusya, dragon) == true) {
								System.out.println();
							} else {
								System.out.print("どうしますか？\n[1]攻撃 [2]回復 [3]魔法 [4]逃げる：");
								selct = scan.nextInt();
								i--;
							}

						} else {
							System.out.println("1,2,3のどれかを選択してください");
							System.out.print("どうしますか？\n[1]攻撃 [2]回復 [3]魔法 [4]逃げる：");
							selct = scan.nextInt();
							i--;
						}
					}
					// 敵から勇者への攻撃
					if (hen1 == 0) {
						enemy(dragon, yusya);
						if (yusya.getHp() == 0) {
							break;
						}
					}

				}
				if (dragon.getHp() == 0) {
					System.out.println("***Congratulations!***");
					break;
				}
			}
		}
		partition();
		System.out.println("★★★ゲーム終了★★★");
	}

	public static void partition() {
		try {
			Thread.sleep(1000); // 10秒(1万ミリ秒)間だけ処理を止める
		} catch (InterruptedException e) {
			System.out.println("待機処理でエラーが発生しました");
		}
		System.out.println("---------");
	}

	public static void attack(Actor yusya, Actor target) {
		System.out.print("どの攻撃をしますか？\n[1]攻撃 [2]ハンマー：");
		int selct2 = scan.nextInt();
		partition();
		if (selct2 == 1) {
			yusya.attack(target);
			// 敵の情報を表示
			target.status();
			partition();
			if (target.getHp() == 0) {
				System.out.println(target.getName() + "を倒した！");
				System.out.println(yusya.getName() + "のレベルが上がった");

				partition();
			}
		} else if (selct2 == 2) {
			yusya.attack2(target);
			// 敵の情報を表示
			target.status();
			partition();
			if (target.getHp() == 0) {
				System.out.println(target.getName() + "を倒した！");
				System.out.println(yusya.getName() + "のレベルが上がった");

				partition();
			}
		}
	}

	public static void enemy(Actor enemy, Actor target) {

		if (target.getHp() != 0 && enemy.getHp() != 0) {
			enemy.attack(target);
			// 勇者の情報を表示
			target.status();
			partition();
			if (target.getHp() == 0) {
				System.out.println("「" + target.getName() + "はやられてしまった...」「ゲームオーバー」");
			}
		}
	}

	public static Weapon randomWeapon(Weapon[] weapons) {

		int num = rand.nextInt(weapons.length);
		return weapons[num];
	}

	public static Equipment randomEquipment(Equipment[] equipments) {

		int num = rand.nextInt(equipments.length);
		return equipments[num];
	}

	public static boolean ranAway(Actor yusya, Actor enemy) {
		if (enemy.getMaxHp() >= 100) {
			System.out.println(yusya.getName() + "は逃げ出した！");
			try {
				Thread.sleep(2000); // 10秒(1万ミリ秒)間だけ処理を止める
			} catch (InterruptedException e) {
				System.out.println("待機処理でエラーが発生しました");
			}
			System.out.println("しかし逃げられなかった");
			partition();
			return false;

		} else {
			System.out.println(yusya.getName() + "は逃げ出した！");
			try {
				Thread.sleep(2000); // 10秒(1万ミリ秒)間だけ処理を止める
			} catch (InterruptedException e) {
				System.out.println("待機処理でエラーが発生しました");
			}
			System.out.println("うまく逃げられた");
			partition();
			return true;
		}
	}

}
