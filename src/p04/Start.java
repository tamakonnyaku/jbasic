package p04;

public class Start {
	
	public static void main(String[] args) {
		
		//インスタンスを生成
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		
		m1.myGoal = "分析を担当する";
		m2.myGoal = "設計を担当する";
		m3.myGoal = "実装を担当する";
		
		Member.teamGoal = "みんなで頑張ろう！";
		Member.teamGoal = "みんなで協力して頑張ろう！";
		
		m1.displayGoal();
		m2.displayGoal();
		m3.displayGoal();
		
		Member.test();
		
	}
}
