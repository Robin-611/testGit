package com.rs;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DownloadServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
   //     System.out.println("download servlet----");
		System.out.println("This is my first code");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		 File directory = new File("C:\\");
         String files = "keywords_20190620150953.zip";
		  response.setContentType("APPLICATION/OCTET-STREAM"); 
		  response.setHeader("Content-Disposition","attachment; filename=\"" + files + "\""); 

		  java.io.FileInputStream fileInputStream = new java.io.FileInputStream(directory.getPath()+"\\" + files);
		  
		  int i; 
		  while ((i=fileInputStream.read()) != -1) {
		    out.write(i); 
		  } 
		  fileInputStream.close(); 
		  out.close(); 
	}

}
