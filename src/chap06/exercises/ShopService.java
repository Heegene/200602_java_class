package chap06.exercises;

public class ShopService {
	static ShopService ShopService; 
	private ShopService () {
		
	}
	
	static ShopService getInstance() {
		return ShopService;
	}
	
}
