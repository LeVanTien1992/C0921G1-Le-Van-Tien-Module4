package vn.codegym.repository.ipml;

import org.springframework.stereotype.Repository;
import vn.codegym.model.Product;
import vn.codegym.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ProductRepositoryIpml implements ProductRepository {

    private static List<Product> productList;

    static {
        productList = new ArrayList<>();
        productList.add(new Product(1, "ffff 5", 50, "Apple"));
        productList.add(new Product(2, "Iphone 5s", 60, "Apple"));
        productList.add(new Product(3, "Iphone 6", 100, "Apple"));
        productList.add(new Product(4, "Iphone 6s plus", 150, "Apple"));
        productList.add(new Product(5, "Iphone 7", 500, "Apple"));
        productList.add(new Product(6, "Iphone 7 plus", 600, "Apple"));
        productList.add(new Product(7, "Iphone 8 plus", 700, "Apple"));
        productList.add(new Product(8, "Iphone xs max", 800, "Apple"));
        productList.add(new Product(9, "Iphone 11 pro max", 900, "Apple"));
        productList.add(new Product(10, "Iphone 12 pro max", 1000, "Apple"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productList);
    }

    @Override
    public void save(Product product) {
        int id = productList.indexOf(product);
        // nếu như chưa có product trong list thì thêm mới
        if (id == -1) {
            productList.add(product);
        } else {
            // nếu có rồi thì update
            productList.set(id, product);
        }
    }

    @Override
    public Product findById(int id) {
        for (Product product : productList) {
            if (id == product.getId()) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void remove(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                productList.remove(productList.get(i));
            }
        }

    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> productList1 = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getName().contains(name)){
                productList1.add(productList.get(i));
            }
        }
        return productList1;
    }

    @Override
    public boolean checkSearch(String name) {
        for (int i = 0; i <productList.size() ; i++) {
            if (productList.get(i).getName().contains(name)){
                return true;
            }
        }
        return false;
    }


}
