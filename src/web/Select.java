package web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
import org.apache.http.util.EntityUtils;

/**
 * Servlet implementation class Select
 */
@WebServlet("/Select")
public class Select extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Select() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpClient httpclient = new DefaultHttpClient();
		try { 
			HttpHost target = new HttpHost("localhost", 9080, "http");

			HttpGet getRequest = new HttpGet("/FinalProject_WebService/main/users04/WebSelect");

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
		      HttpSession session = request.getSession();
		      session.setAttribute("MyResponsemessage", Responsemessage);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// When HttpClient instance is no longer needed,
			// shut down the connection manager to ensure
			// immediate deallocation of all system resources
			httpclient.getConnectionManager().shutdown();
		}
		response.sendRedirect("./NewSelect.jsp");	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
