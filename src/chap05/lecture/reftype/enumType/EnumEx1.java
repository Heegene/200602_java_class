package chap05.lecture.reftype.enumType;

public class EnumEx1 {
	public static void main(String[] args) {

		Object o = new Object(); // 생성된 인스턴스의 참조값을 가짐
		//enum은 정해진 값만 받을 수 있고, 그 값을 사용자가 지정해 줌
		
		MyEnum e1 = MyEnum.COFFEE;
		MyEnum e2 = MyEnum.WATER;
		MyEnum e3 = MyEnum.COFFEE; 
		
		System.out.println(e1.name()); // COFFEE라는 STring으로 바뀌어 리턴됨 
		System.out.println(e1.toString()); // 마찬가지로 String화 
		System.out.println(e1.ordinal()); // 커피가 첫번째니까 0번 리턴됨 
		System.out.println(e2.ordinal()); // 1
		
		System.out.println(e1.compareTo(e2));
		
		MyEnum e5 = MyEnum.valueOf("COFFEE"); // String을 Enum 타입으로 변경
		System.out.println(e5 == MyEnum.COFFEE); // TRUE 출력
//		MyEnum e6 = MyEnum.valueOf("ESPRESSO");
//		System.out.println(e6 == MyEnum.ESPRESSO); // 같은 게 없으면 illegal argument로 exception 발생 
	
		System.out.println();
		
		MyEnum[] vals = MyEnum.values(); // 내용 리턴함 
		System.out.println(vals.length);
		System.out.println(vals[0]);
		System.out.println(vals[1]);
		
		}
	}

