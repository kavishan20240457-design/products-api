package uk.ac.westminster.products_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")

public class productController {
    @Autowired
    private ProductService ProductService;

    @GetMapping()
    public List<product> getAllProducts() {
        return ProductService.getAllProducts();
    }

    @GetMapping("/{id}")
    public product getProductById(@PathVariable Long id) {
        return ProductService.getProductById(id).orElse(null);
    }

    @PostMapping()
    public product addProduct(@RequestBody product product) {
        return ProductService.addProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        ProductService.deleteProduct(id);
    }

    @GetMapping("/search")
    public List<product> search(@RequestParam String name) {
        return ProductService.findByName(name);
    }
}