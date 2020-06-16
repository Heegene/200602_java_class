package chap08.exercises.ex04;

public class DaoExample {
	
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OrcaleDao());
		dbWork(new MySqlDao());
		
		
		
	}

}
