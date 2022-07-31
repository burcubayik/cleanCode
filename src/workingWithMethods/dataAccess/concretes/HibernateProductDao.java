package workingWithMethods.dataAccess.concretes;

import workingWithMethods.dataAccess.abstracts.ProductDao;
import workingWithMethods.entities.concretes.Product;

import java.util.ArrayList;
import java.util.List;

public class HibernateProductDao implements ProductDao {
  List<Product> products = new ArrayList<>();
    @Override
    public void add(Product product) {
        System.out.println("Hibernate ile eklendi");
        products.add(product);
    }

    @Override
    public List<Product> getAll() {
        return products;
    }
}
