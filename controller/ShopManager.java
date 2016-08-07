package controller;

public class ShopManager extends Manager{

	private LoginManager loginManager;
	public static ShopManager shopManager;

	//singleton
	public ShopManager getInstatnce(){
		if(shopManager == null){
			shopManager = new ShopManager();
		}
		return shopManager;
	}
	
	public void loding(){
		//전체 쇼핑몰 정보 가져오기
	}
}
