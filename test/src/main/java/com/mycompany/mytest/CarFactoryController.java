package com.mycompany.mytest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class CarFactoryController {

	@RequestMapping(value = "/cfAction", method = RequestMethod.GET)
	 public String  CarFactoryTest(HttpServletRequest request ,Model model ){
		//@RequestParam("cfName") String cfName
		 String cfName = request.getParameter("cfName");
			  carFactory factory=new carFactory();
			  Car c=factory.createCar(cfName);
			  c.run();	
			  
			  model.addAttribute("cf", cfName);  
			  return "carrun";
		      }  
}


interface Car{
	public void run();
}

class Audi implements Car{
	@Override
	public void run(){
		System.out.println("奥此车跑的快");
	}
}

class Auto implements Car{
	@Override
	public void run(){
		System.out.println("奥拓车跑侧慢");
	}
}


class carFactory{
	public Car createCar(String type){
		if("audi".equalsIgnoreCase(type)){
			return new Audi();
		}else if("auto".equalsIgnoreCase(type)){
			return new Auto();
		}else{
			return null;
		}
	}
 
}

	  