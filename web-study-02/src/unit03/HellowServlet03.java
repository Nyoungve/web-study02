package unit03;
//서블릿의 한글 처리와 데이터 통신

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HellowServlet03")
public class HellowServlet03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public HellowServlet03() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//클라이언트에게 응답할 페이지 정보를 셋팅
		response.setContentType("text/html; charset=UTF-8;"); //응답 객체에 콘텐트 타입 지정하기. 한글 깨짐현상 방지!
		
		//자동 임포트 시켜주기 
		PrintWriter out = response.getWriter();
		out.print("<html><body><h1>");
		out.print("Hello Servlet");
		out.print("헬로우 서블릿");//한글깨짐현상 방지 
		out.print("</h1></body></html>");
		out.close(); //출력스트림과 같은 자원들은 사용이 끝나면 안전하게 닫아줘야한다.
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
