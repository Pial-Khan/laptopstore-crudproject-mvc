package com.mdrafsunjanikhan.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.mdrafsunjanikhan.demo.models.Laptop;
import com.mdrafsunjanikhan.demo.service.LaptopStoreService;

@Controller
//@RequestMapping("/laptopstore")
public class LaptopStoreController {
	
	@Autowired
	private LaptopStoreService laptopStoreService;
	
	@GetMapping("/index")
	public String index() {
		System.out.println("Hello");
		return "index";
	}


	@GetMapping("/")
	public String getLaptop(Model model) {
		model.addAttribute("laptops", laptopStoreService.getAlllaptops());
		return "index";
	}
	
	@GetMapping("/{id}")
	public String getLaptopById(@PathVariable("id") String id, Model model) {
		model.addAttribute("laptops", laptopStoreService.getLaptopById(id));
		return "index";
	}
	
	@PostMapping("/addlaptop")
	public String addLaptop(@ModelAttribute("laptop") Laptop laptop, Model model) {
		//laptopStoreService.addLaptop(laptop);
		model.addAttribute("laptops", laptopStoreService.addLaptop(laptop));
		return "index";
	}
	
	@PostMapping("/updatelaptop")
	public String updateStudent(@ModelAttribute("laptop") Laptop laptop, Model model) {
		String id = laptop.getId(); 
		System.out.println("Hello");
		//laptopStoreService.updateLaptop(id, laptop);
		//return "redirect:/index";
		model.addAttribute("laptops", laptopStoreService.updateLaptop(id, laptop));
		return "index";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteStudent(@PathVariable("id") String id, Model model) {
		model.addAttribute("laptops", laptopStoreService.deleteLaptop(id));
		return "index";
	}
}

