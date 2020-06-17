package chap11.examples.sec110302;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		// Key 객체를 식별키로 이용해서 String 값을 저장하는 HashMap 객체 생성
		
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		// HashMap 은 값을 이 객체 안에 저장할 수 있음
		// 배열은 아이템이 한번에 하나씩 들어가는데
		// HashMap은 값 하나가 키와 value의 쌍으로 들어감
		// 각 키로 구분되고 저장된 키에 또 다른값 넣으면 덮어씌워짐
		// 다른 언어에선 Dictionary라고도 함
		
		// 읽을 때는 key를 알면 value를 읽을 수 있는 것 		
		
		// 식별키 "new Key(1)" 로 "홍길동" 저장
		hashMap.put(new Key(1), "홍길동");
		// number가 1인 키를 넣고 홍길동이 나와야하는데
		
		// 식별키 "new Key(1)"로 "홍길동"을 읽어옴
		String value = hashMap.get(new Key(1)); // key(1) 얻어오라고했는데 null 출력
		// 키가 같ㅇ느지 확인할 때 먼저 확인하는 함수가 hashcode인데
		// 둘이 다른 해시를 가지고있어서 서로 다른 서랍을 열어봤기 때문에 같은지 확인 불가
		// equals 돌려서 보면 같다고 나오지만 둘의 해시코드가 다름
		
		// 그래서 
		
		
		System.out.println(value);
		
	}
}
