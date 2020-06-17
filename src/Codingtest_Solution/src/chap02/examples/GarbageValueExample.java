package chap02.examples;

public class GarbageValueExample {
	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for (int i=0; i<5; i++) {
			var1++;
			var2++;
			System.out.println("var1:" + var1 + "\t" + "var2 :" + var2);
		}
	}
}
// 결과물 (byte 타입의 경우 127을 넘어가면 -128부터 다시 시작하는 것을 볼 수 있음 )
//var1:126	var2 :126
//var1:127	var2 :127
//var1:-128	var2 :128
//var1:-127	var2 :129
//var1:-126	var2 :130
