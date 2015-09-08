package com.company.myapp;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller  
public class LoginController {  
  
//	 @RequestMapping("/login")  
//	    public String login(HttpServletRequest request) throws Exception {  
//		 String username = request.getParameter("username");
//	        String password = request.getParameter("password");
//	        // TODO Auto-generated method stub  
//	       if("123".equals(username)&&"123".equals(password)){  
//	           System.out.println("ok");  
//	           return "ok";  
//	       }else{  
//	           return "no";  
//	       }
//	 }
	       
    @RequestMapping(value = "/loginAction", method = RequestMethod.GET)
    public String login(@RequestParam("username") String username,  
                        @RequestParam("password") String password,Model model){  
        if (username.equals(password))   
        {  
            model.addAttribute("username", username);  
            model.addAttribute("password", password);  
            return "ok";  
        } else {  
            return "no";  
        }  
    }  
} 
