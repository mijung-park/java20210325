package p06.textbook.Exercise.ex18;

public class ShopService {

	private static ShopService shopService;
	
	private ShopService() {
		
	}
	
	static ShopService getInstance() {
		if (shopService == null) {
			shopService = new ShopService();
		}
		return shopService;
	}
	
}
