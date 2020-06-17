package chap07.lecture.polymorphism.sample2;

public class MyApp {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		// 인트배열 선언하면
		arr1[0] = 3;
		// 이렇게 인덱스로 인트 삽입 가능
		
		String[] arr2 = new String[3];
		arr2[0] = "java";
		// String도 마찬가지 
		
		
		Enemy[] enemies = new Enemy[5];
		enemies[0] = new EnemyGun();
		enemies[1] = new EnemyGun();
		enemies[2] = new EnemyArrow();
		enemies[3] = new EnemyGun();
		enemies[4] = new EnemyGun();
		
		
		for (Enemy e : enemies) { // 5개의 적을 돌아가면서 공격하는 프로그램의 일부
			e.attack();
		}
		
	}
}
