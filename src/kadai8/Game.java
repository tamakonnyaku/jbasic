package kadai8;

import java.util.Random;
import java.util.Scanner;

public class Game {
	
	// スキャナークラス（フィールド）
    private static Scanner scan = new Scanner(System.in);

	
	public static void main(String[] args) {

		int hen1 = 1, hen2 = 1, hen3 = 1;
		System.out.println("★★★ゲーム開始★★★");
		// 🦸勇者（生命力：50、攻撃力：10）の生成と情報の表示
		Hero yusya = new Hero("勇者",50, 10, 0);
		Weapon[] weapons = {new Weapon("こん棒",5),
							new Weapon("どうの剣",10),
							new Weapon("奇跡の剣",20),
							new Weapon("プラチナソード",30),
							new Weapon("勇者の剣",50)};
		Weapon weapon1 = randomWeapon(weapons);
		System.out.println(yusya);
		partition();
		yusya.setWeapon(weapon1);
		System.out.println(yusya.getName() + "は" + weapon1.getName() + "を見つけ、装備した");
		partition();
		// 🦸ゾンビ（生命力：15、攻撃力：5）の生成と情報の表示
		Actor[] en = new Actor[3];
		for (int i = 0; i < en.length; i++) {
			en[i] = Actor.randomEnemy();

		}
		Dragon dragon = new Dragon(200,20,50,0);

		while (true) {
			if (en[0].getHp() > 0) {
				if (hen1 == 1) {
					System.out.println(en[0] + "があらわれた");
					partition();
					hen1 = 0;
				}
				System.out.println("ステータス");
				yusya.status();
				en[0].status();
				partition();
				// 勇者から敵への攻撃
				System.out.print("どうしますか？\n[1]攻撃 [2]回復 [3]逃げる：");
				
				int selct = scan.nextInt();
				partition();
				for (int i = 0; i < 1; i++) {
					if (selct == 1) {
						attack(yusya,en[0]);
						if(en[0].getHp() == 0) {
							yusya.setLivel(yusya.getLivel()+1);
						}
					} else if (selct == 2) {
						yusya.heal();
						System.out.println(yusya);
						partition();
					} else if (selct == 3) {
						en[0] = Actor.randomEnemy();
						hen1 = 1;
						System.out.println(yusya.getName() + "は逃げ出した！");
						partition();
						continue;
					} else {
						System.out.println("1,2,3のどれかを選択してください");
						System.out.print("どうしますか？\n[1]攻撃 [2]回復 [3]逃げる：");
						selct = scan.nextInt();
						i--;
					}
				}
				// 敵から勇者への攻撃
				if (hen1 == 0) {
					enemy(en[0],yusya);
					if(yusya.getHp() == 0) {
						break;
					}
				}
				
			} else if (en[1].getHp() > 0) {
				if (hen2 == 1) {
					System.out.println(en[1] + "があらわれた");
					partition();
					hen2 = 0;
				}
				System.out.println("ステータス");
				yusya.status();
				en[1].status();
				partition();
				// 勇者から敵への攻撃
				System.out.print("どうしますか？\n[1]攻撃 [2]回復 [3]逃げる：");

				int selct = scan.nextInt();
				partition();
				for (int i = 0; i < 1; i++) {
					if (selct == 1) {
						attack(yusya,en[1]);
						if(en[1].getHp() == 0) {
							yusya.setLivel(yusya.getLivel()+1);
						}
					} else if (selct == 2) {
						yusya.heal();
						System.out.println(yusya);
						partition();
					} else if (selct == 3) {
						en[1] = Actor.randomEnemy();
						hen2 = 1;
						System.out.println(yusya.getName() + "は逃げ出した！");
						partition();
						continue;
					} else {
						System.out.println("1,2,3のどれかを選択してください");
						System.out.print("どうしますか？\n[1]攻撃 [2]回復 [3]逃げる：");
						selct = scan.nextInt();
						i--;
					}
				}
				// 敵から勇者への攻撃
				if (hen2 == 0) {
					enemy(en[1],yusya);
					if(yusya.getHp() == 0) {
						break;
					}
				}
			} else if (en[2].getHp() > 0) {
				if (hen3 == 1) {
					System.out.println(en[2] + "があらわれた");
					partition();
					hen3 = 0;
				}
				System.out.println("ステータス");
				yusya.status();
				en[2].status();
				partition();
				// 勇者から敵への攻撃
				System.out.print("どうしますか？\n[1]攻撃 [2]回復 [3]逃げる：");

				int selct = scan.nextInt();
				partition();
				for (int i = 0; i < 1; i++) {
					if (selct == 1) {
						attack(yusya,en[2]);
						if(en[2].getHp() == 0) {
							yusya.setLivel(yusya.getLivel()+1);
						}
					} else if (selct == 2) {
						yusya.heal();
						System.out.println(yusya);
						partition();
					} else if (selct == 3) {
						en[2] = Actor.randomEnemy();
						hen3 = 1;
						System.out.println(yusya.getName() + "は逃げ出した！");
						partition();
						continue;
					} else {
						System.out.println("1,2,3のどれかを選択してください");
						System.out.print("どうしますか？\n[1]攻撃 [2]回復 [3]逃げる：");
						selct = scan.nextInt();
						i--;
					}
				}
				// 敵から勇者への攻撃
				if (hen3 == 0) {
					enemy(en[2],yusya);
					if(yusya.getHp() == 0) {
						break;
					}
				}
			}

			if (en[0].getHp() == en[1].getHp() && en[1].getHp() == en[2].getHp() && en[0].getHp() == 0) {
				System.out.println("すべての敵を倒した！");
				break;
			}
		}
		partition();
		
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
				System.out.print("どうしますか？\n[1]攻1撃 [2]回復 [3]逃げる：");

				int selct = scan.nextInt();
				partition();
				for (int i = 0; i < 1; i++) {
					if (selct == 1) {
						attack(yusya,dragon);
						if(dragon.getHp() == 0) {
							yusya.setLivel(yusya.getLivel()+1);
							
						}
					} else if (selct == 2) {
						yusya.heal();
						System.out.println(yusya);
						partition();
					} else if (selct == 3) {
						
						System.out.println(yusya.getName() + "は逃げ出した！");
						try {
							Thread.sleep(2000); // 10秒(1万ミリ秒)間だけ処理を止める
						} catch (InterruptedException e) {
							System.out.println("待機処理でエラーが発生しました");
						}
						System.out.println("しかし逃げられなかった");
						partition();
						System.out.print("どうしますか？\n[1]攻撃 [2]回復 [3]逃げる：");
						selct = scan.nextInt();
						i--;
					} else {
						System.out.println("1,2,3のどれかを選択してください");
						System.out.print("どうしますか？\n[1]攻撃 [2]回復 [3]逃げる：");
						selct = scan.nextInt();
						i--;
					}
				}
				// 敵から勇者への攻撃
				if (hen1 == 0) {
					enemy(dragon,yusya);
					if(yusya.getHp() == 0) {
						break;
					}
				}
				
			}
			if (dragon.getHp() == 0) {
				System.out.println("***Congratulations!***");
				break;
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
	
	public static void attack(Actor yusya,Actor target) {
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
		}else if(selct2 == 2) {
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
	
	public static void enemy(Actor enemy,Actor target) {

		if (target.getHp() != 0 && enemy.getHp() != 0) {
			enemy.attack(target);
			// 勇者の情報を表示
			target.status();
			partition();
			if (target.getHp() == 0) {
				System.out.println("「" + target.getName() + "はやられてしまった...」「ゲームオーバー」");
			}
		}/*else if(target.getHp() == 0){
			target.status();
			System.out.println(target.getName() + "はすでに倒れている");
			partition();
		}else {
			enemy.status();
			System.out.println(enemy.getName() + "はすでに倒れている");
			partition();
		}*/
	}
	
	public static Weapon randomWeapon(Weapon[] weapons) {
		
		Random rand = new Random();
		int num = rand.nextInt(weapons.length);
		return weapons[num];
	}
}
