package Inventario_Comany.dao;

import org.springframework.data.repository.CrudRepository;

import com.company.inventario.model.Category;

public interface ICategoryDao extends CrudRepository <Category, Long> {
	
}
