package controller;

import model.Client;

public class LoginManager extends Manager {

	private Client client;
	
	public void login(){
		//로그인하기
	}
	public void checkClient(){
		//사용자 확인
	}
	public void findId(){
		//아이디 찾기
	}
	
	public void findPs(){
		//비밀번호 찾기
	}
	
	public class FacebookManager{
		
		public void facebookLogin(){
			String appKey        = "your app key";
		    String appSecret     = "your app secret";

		    String code             = request.getParameter("code");
		    String errorReason         = request.getParameter("error_reason");
		    String error             = request.getParameter("error");
		    String errorDescription = request.getParameter("error_description");
		    
		    String accesstoken = "";
		    String result       = "";

		    if( StringUtils.isNotEmpty(code) ) {
		        HttpGet get = new HttpGet("https://graph.facebook.com/oauth/access_token"+
		                "?client_id="+appKey+
		                "&client_secret="+appSecret+
		                "&redirect_uri=http://javaking.com:9090/FacebookTest1/facebook_step2.jsp" +
		                "&code="+code);
		        
		        DefaultHttpClient http = new DefaultHttpClient();
		        result = http.execute(get, new BasicResponseHandler());
		        
		        accesstoken = result.substring(result.indexOf("=")+1);
		    }
		}
		
	}
}
