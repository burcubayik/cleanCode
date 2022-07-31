package workingWithMethods.business.abstracts;

import workingWithMethods.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    void add(Product product);
    List<Product> getAll();
}
