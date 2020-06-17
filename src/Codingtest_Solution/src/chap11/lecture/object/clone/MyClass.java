package chap11.lecture.object.clone;

public class MyClass implements Cloneable {
	private int id;
	private String name;
	private int[] arr; // 참조타입

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public MyClass copy() throws Exception {
//
//		Object o = this.clone();
//				return (MyClass) o; // 강제형변환
//	}

	public MyClass copy() throws Exception {
		Object o = this.clone();
		MyClass c = (MyClass) o;
		c.setArr(new int[this.arr.length]);

		for (int i = 0; i < this.arr.length; i++) {
			c.getArr()[i] = this.arr[i];
		}
		return c;
	}

}
