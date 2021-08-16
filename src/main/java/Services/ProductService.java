package Services;

import Models.IProductService;
import Models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService {
    private List<Product> products = new ArrayList<>();
    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        for (Product i: products) {
            if(i.getId() == id)
                i = product;
        }
    }

    @Override
    public void remove(int id) {
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId() == id)
                products.remove(i);
        }
    }
}
