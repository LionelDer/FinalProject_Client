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

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

/**
 * Servlet implementation class save01
 */
@WebServlet("/Insert")
public class Insert extends HttpServlet {
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String ID = request.getParameter("myID");
		String Money = request.getParameter("myMoney");
		
		HttpClient httpclient = new DefaultHttpClient();
		
		try { 
			HttpHost target = new HttpHost("localhost", 9080, "http");

			HttpGet getRequest = new HttpGet("/FinalProject_WebService/main/users/WebInsert/" + ID + "/" + Money);

			HttpResponse httpResponse = httpclient.execute(target, getRequest);
//			System.out.println(httpResponse.getStatusLine());
			HttpEntity entity = httpResponse.getEntity();
			
		      if (entity != null) 
		      {
//		        System.out.println(EntityUtils.toString(entity));
		      }
		      System.out.println("!!112!!");
		      
		      String Responsemessage = "";
//		      Responsemessage= new String(EntityUtils.toString(entity));
		      StringBuilder builder = new StringBuilder();  
		      BufferedReader reader = new BufferedReader(new InputStreamReader(entity.getContent()));  
		      String s;  
		         
		      while ((s = reader.readLine()) != null)  
		      {  
		            builder.append(s);  
		      }  
//		      int result = Integer.parseInt(builder.toString());  
		      System.out.println("result: " + builder.toString()); 
		      
		      System.out.println("!!113!!");
//		      Responsemessage = new String(Responsemessage.getBytes("ISO-8859-1"),
//						"UTF-8");

		      Responsemessage= builder.toString();
		      System.out.println("@@"+Responsemessage);
		      HttpSession session = request.getSession();

		      session.setAttribute("MyResponsemessage", Responsemessage);

		      System.out.println("!!112!!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// When HttpClient instance is no longer needed,
			// shut down the connection manager to ensure
			// immediate deallocation of all system resources
			httpclient.getConnectionManager().shutdown();
		}
		response.sendRedirect("./NewInput_NextPage.jsp");
		System.out.println("!!client_end!!");
       
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
