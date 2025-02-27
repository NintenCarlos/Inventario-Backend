package Inventario_Company.services;

import org.springframework.http.ResponseEntity;

import Inventario_Company.response.CategoryResponseRest;

public interface ICategoryService {
	public ResponseEntity <CategoryResponseRest> search();
}
