package workingWithMethods.dataAccess.abstracts;

import workingWithMethods.entities.concretes.Product;

import java.util.List;

public interface ProductDao {
    void add(Product product);
    List<Product> getAll();

}
