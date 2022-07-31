package workingWithMethods.business.concretes;

import workingWithMethods.business.abstracts.ProductService;
import workingWithMethods.dataAccess.abstracts.ProductDao;
import workingWithMethods.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {
ProductDao productDao;

    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public void add(Product product) {
        productDao.add(product);

    }

    @Override
    public List<Product> getAll() {
        return this.productDao.getAll();
    }
}
