package controller;

import java.util.ArrayList;

import model.Board;
import model.Client;

public class QuestionManager extends Manager{
	private int id;
	private int product_id;
	private String product_name;
	
	private Client client;
	private ArrayList<Board> boardList;
	
	public void showBoard(){
		//게시판 조회
	}
	public class Conversation{
		private Client client;
		public void realTimeTalk(){
			//실시간일대일 대화 진행
		}
		public void run(){
			  try {
		            // 서버소켓을 생성하고 5000번 포트와 결합(bind) 시킨다.
		            serverSocket = new ServerSocket(5000);
		            System.out.println(getTime() + " 서버가 준비되었습니다.");
		        } catch (IOException e) {
		            e.printStackTrace();
		        } // try - catch
		         
		        while (true) {
		            try {
		                System.out.println(getTime() + " 연결요청을 기다립니다.");
		                // 서버소켓은 클라이언트의 연결요청이 올 때까지 실행을 멈추고 계속 기다린다.
		                // 클라이언트의 연결요청이 오면 클라이언트 소켓과 통신할 새로운 소켓을 생성한다.
		                Socket socket = serverSocket.accept();
		                System.out.println(getTime() + socket.getInetAddress() + " 로부터 연결요청이 들어왔습니다.");
		                 
		                // 소켓의 출력스트림을 얻는다.
		                OutputStream out = socket.getOutputStream(); 
		                DataOutputStream dos = new DataOutputStream(out); // 기본형 단위로 처리하는 보조스트림
		                 
		                // 원격 소켓(remote socket)에 데이터를 보낸다.
		                dos.writeUTF("서버로부터의 메세지입니다.");
		                System.out.println(getTime() + " 데이터를 전송했습니다.");
		                 
		                // 스트림과 소켓을 달아준다.
		                dos.close();
		                socket.close();
		            } catch (IOException e) {
		                e.printStackTrace();
		            } // try - catch
		        } // while
		}
	}

}
