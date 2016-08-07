package view;

import java.util.ArrayList;

import controller.QuestionManager;
import controller.ShopManager;
import model.Product;

public class MainPage extends Page{

	
	public LoginPage loginPage;
	public ProductPage productPage;
	
	public ShopManager shopManager;
	public QuestionManager questionManager;
	
	private ArrayList<Product> productList;
	
	public void showLoginPage(){
		//로그인 페이지로 이동
	}
	public void showProductPage(){
		//상품페이지로 이동
	}
	public ShopManager getShopManager(){
		//ShopManager를 호출한다.
		return shopManager;
	}
	public QuestionManager getQuestionManager(){
		//QuestionManager를 호출한다.
		return questionManager;
	}
	
	public void quest(){
		//문의 하기
	}
	
	public MainPage(){
		//생성자 생성
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

}
