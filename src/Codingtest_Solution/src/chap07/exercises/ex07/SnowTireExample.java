package chap07.exercises.ex07;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire st = new SnowTire();
		
		Tire tr = st;
		

		st.run();
		tr.run();
		
	}
}
