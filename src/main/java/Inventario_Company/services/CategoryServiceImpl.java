package Inventario_Company.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.inventario.model.Category;

import Inventario_Comany.dao.ICategoryDao;
import Inventario_Company.response.CategoryResponseRest;

@Service
public class CategoryServiceImpl implements ICategoryService{
   @Autowired
   private ICategoryDao categoryDao;

   @Override
   @Transactional(readOnly = true)
   public ResponseEntity<CategoryResponseRest> search() {
       CategoryResponseRest response = new CategoryResponseRest();
       
       try {
           List<Category> category = (List<Category>) categoryDao.findAll();
           response.getCategoryResponse().setCategory(category);
           response.setMetadata("Respuesta ok", "00", "Respuesta exitosa");
       
       } catch (Exception e) {
           response.setMetadata("Respuesta no ok", "-1", "Error al consultar");
           e.getStackTrace();
           return new ResponseEntity<CategoryResponseRest>(response, HttpStatus.INTERNAL_SERVER_ERROR);
       }
       
       return new ResponseEntity<CategoryResponseRest>(response, HttpStatus.OK);
   }
   

}