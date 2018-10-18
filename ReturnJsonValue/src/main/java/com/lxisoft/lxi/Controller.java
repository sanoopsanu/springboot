package com.lxisoft.lxi;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
	
	ArrayList <Model> model=new ArrayList <Model>();
	@GetMapping("/get")
	public ArrayList<Model> getData(){
		Model m1 = new Model();
		m1.setName("sanoop");
		m1.setAge(28);
		m1.setNum(123456789);
		model.add(m1);
		
		
		return model;
	
		
	}
	
	/*public Model getData(){
		
		Model model=new Model("sanoop", 25);
		
		return model;
	
	
}*/
}