package unit02;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycle
 */
@WebServlet("/LifeCycle")
public class LifeCycle extends HttpServlet {
	//필드
	private static final long serialVersionUID = 1L;
	
	int initCount = 1;
	int doGetCount = 1;
	int destroyCount = 1;
	
	//생성자
    public LifeCycle() {
        super();
    }

	//메소드
    //init 메소드는 페이지 생성할 때 한 번만 호출됨.
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 메소드는 첫 요청만 호출됨: "+ initCount++);
	}


	public void destroy() {
		System.out.println("destroy 메소드는 톰캣이 종료될 때만 호출됨: "+ destroyCount++);
	}

	//doGet메소드는 새로고침할 때 마다 호출된다.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 메소드가 요청 될 때마다 호출됨 : " + doGetCount++ );
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
