package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private List<product>Products = new ArrayList<>();
    private Long nextId = 1L;

    public ProductService(){
        Products.add(new Digitalproduct(
                nextId++,"Clean Code (E-book)",29.99,
                "/downloads/clean-code.pdf",4.2));

                Products.add(new PhysicalProduct(
                        nextId++,"27-inch Monitor",249.9,5.4,"61cm*41cm*18cm"));
    }

    public List<product> getAllProducts() {
        return Products;
    }

    public product addProduct(product product) {
        product.setId(nextId++);
        Products.add(product);
        return product;
    }

    public Optional<product> getProductById(Long id) {
        return Products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    public void deleteProduct(Long id) {
        Products.removeIf(p ->
                p.getId().equals(id));
    }

    public List<product> findByName(String name) {
        return Products.stream().filter(p ->
                        p.getName().contains(name))
                .toList();
    }

}