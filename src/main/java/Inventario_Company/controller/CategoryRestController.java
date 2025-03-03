package Inventario_Company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Inventario_Company.response.CategoryResponseRest;
import Inventario_Company.services.ICategoryService;

@RestController
@RequestMapping ("/api/v1")

public class CategoryRestController {
	
	@Autowired
	private ICategoryService service;
	
	@GetMapping("/categories")
	public ResponseEntity<CategoryResponseRest> seachCategories(){
		ResponseEntity<CategoryResponseRest> response = service.search();
		return response;
	}
	
}
