package p04;

public class Member {
	String myGoal;
	static String teamGoal;

	void displayGoal() {
		System.out.println("個人の目標：" + myGoal);
		System.out.println("チームの目標：" + teamGoal);
		System.out.println("-------------------------------");
	}
	
	static void test() {
		System.out.println("薄井謙汰");
	}
}
