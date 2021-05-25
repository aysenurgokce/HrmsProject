package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.ProductService;
import kodlamaio.hrms.entities.concretes.Product;

@RestController
@RequestMapping("/api/jop_positions")
public class ProductsController {
	
	private ProductService productService;
	
	@Autowired 
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	
	@GetMapping("/getall")
	public List<Product> getAll(){
		return this.productService.getAll();
		
	}

}
