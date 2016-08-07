package model;

public class Board {

	private int id;
	private int num;
	private String name;
	private String title;
	private String content;
	
	public String showContent(){
		//내용 보기
		return content;
	}
	
	public String showTitle(){
		//제목 보기
		return title;
	}
	
	
}
