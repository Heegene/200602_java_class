package chap09.examples.sec090503;

public class Anonymous {
	
	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
//		 arg1 = 20; final이라 안됨
		// arg2 = 20; 안적어도 당연히 final이라 얘도 안됨
		
		// var1 = 30; // 마찬가지 final
		// var2 = 30; // 안적어도 final 
		
		Calculatable calc = new Calculatable() {
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2; // 10 + 0 + 0 + 0 + 0
				return result;
			}
		};
		
		System.out.println(calc.sum());
	}

}
