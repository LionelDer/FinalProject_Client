package web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

/**
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String NO = request.getParameter("myNO");
		String ID = request.getParameter("myID");
		String Money = request.getParameter("myMoney");
		
		HttpClient httpclient = new DefaultHttpClient();
		
		try { 
			HttpHost target = new HttpHost("localhost", 9080, "http");

			HttpGet getRequest = new HttpGet("/FinalProject_WebService/main/users02/WebUpdate/" + ID + "/" + Money+"/" + NO);

			HttpResponse httpResponse = httpclient.execute(target, getRequest);
			HttpEntity entity = httpResponse.getEntity();
		      
		      String Responsemessage = "";
		      StringBuilder builder = new StringBuilder();  
		      BufferedReader reader = new BufferedReader(new InputStreamReader(entity.getContent()));  
		      String s;  
		         
		      while ((s = reader.readLine()) != null)  
		      {  
		            builder.append(s);  
		      }  

		      Responsemessage= builder.toString();
		      System.out.println("@@"+Responsemessage);
		      HttpSession session = request.getSession();

		      session.setAttribute("MyResponsemessage", Responsemessage);
		      
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			httpclient.getConnectionManager().shutdown();
		}
		response.sendRedirect("./NewUpdate_NextPage.jsp");
		System.out.println("!!client_end!!");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	}

}
