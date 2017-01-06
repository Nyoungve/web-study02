package unit01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServelet
 */
@WebServlet("/hello") //어노테이션으로 URL을 맵핑시킨다. 어노테이션은, 문장이나 문서에 추가적인 정보를 기입하는 것을 말한다.
public class HelloServelet extends HttpServlet {
	
	//필드
	private static final long serialVersionUID = 1L; 
	//클래스를 구분하기 위한 값 , 사람에게 주민번호와 같은 역할 : 클래스는 명시적으로 serialVersionUID 필드를 정의해 클래스 버전에 따른 고유 번호를 포함한다.

    //생성자
    public HelloServelet() {
      
    }

	//메소드
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//클라이언트에게 응답할 페이지 정보를 셋팅
		response.setContentType("text/html; charset=UTF-8;"); //응답 객체에 콘텐트 타입 지정하기. 한글 깨짐현상 방지!
		
		//자동 임포트 시켜주기 
		PrintWriter out = response.getWriter();
		out.print("<html><body><h1>");
		out.print("Hello Servlet 안녕하세요");//한글깨짐현상 방지 
		out.print("</h1></body></html>");
		out.close(); //출력스트림과 같은 자원들은 사용이 끝나면 안전하게 닫아줘야한다.
		
		
		
		
	}

}
