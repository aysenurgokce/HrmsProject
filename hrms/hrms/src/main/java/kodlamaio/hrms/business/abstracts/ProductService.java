package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.Product;

public interface ProductService {
	List<Product> getAll();
}
