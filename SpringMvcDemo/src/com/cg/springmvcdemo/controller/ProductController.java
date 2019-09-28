package com.cg.springmvcdemo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.springmvcdemo.dto.Product;
import com.cg.springmvcdemo.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService prodservice;
	@RequestMapping(value = "/homes", method = RequestMethod.GET)
	public String homePage() {
		return "home";
	}
	
	/*@RequestMapping(value = "/addpage", method = RequestMethod.GET)
	public String addProduct(@ModelAttribute("product") Product pro) {
		return "AddProduct";
	}*/
	@RequestMapping(value = "/addpage", method = RequestMethod.GET)
	public String addProduct(@ModelAttribute("product") Product pro,
			Map<String,Object> model, Map<String,Object> model1) {                                                        //  ModelAndView  Sends data from controller to jsp
		List<String> types=new ArrayList<>();
		types.add("SELECT");
		types.add("Electronics");
		types.add("Grocery");
		types.add("H A");
		
		model.put("dataitem", types);
		List<String> val = new ArrayList<String>();
        val.add("online");
        val.add("offline");
        
        model1.put("onli", val);
		
		
		return "AddProduct";
	}
	@RequestMapping(value = "/pagesubmit", method = RequestMethod.POST)
	public String addData(@Valid@ModelAttribute("product") Product pro, BindingResult result) {             //after submitting this method will be called And if not valid then show the msg and binding result
		if(result.hasErrors()) {
			return "AddProduct";
		}else {
			System.out.println(pro);
		prodservice.addProduct(pro);
		return "home";
		}
	}
	@RequestMapping(value="/showpage", method=RequestMethod.GET)
	public ModelAndView getAllData() {
		List<Product> myList=prodservice.showProduct();
		return new ModelAndView("ShowProduct","data",myList);
		
	}
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String deletePage() {
		
		return "DeleteProduct";
		
	}
	@RequestMapping(value="/deletedata", method=RequestMethod.POST)
	public String deleteData(@RequestParam("pid") int prodId) {
		System.out.println(prodId);
		return "redirect:/showpage";
	}
	public String searchData(@RequestParam("pid") int proId) {
		 
		prodservice.searchProduct(proId);
		return "redirect:/showpage";
	}

}
