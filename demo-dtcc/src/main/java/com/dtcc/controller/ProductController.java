package com.dtcc.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dtcc.model.Products;

@CrossOrigin(origins = "http://localhost:8808")
@RequestMapping("api/v0/")
@RestController
public class ProductController {

	@RequestMapping(value="products",method=RequestMethod.GET)
	public List<Products> get(){
		
		return ProductStub.list();
	}
}
