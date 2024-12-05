package br.com.gestaestoque.controller;

import br.com.gestaestoque.domain.Product;
import br.com.gestaestoque.service.ProductService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductService service;

    @PostMapping("/register")
    public void createProduct(@RequestBody Product product){
       service.register(product);
    }
    @GetMapping("/getAll")
    public List<Product> getAllProduct(){
        return service.getAllProduto();
    }
    @PostMapping("/edit/{id}")
    public void edit(@RequestBody Product product,@PathVariable Long id){
        service.register(product);
    }
    @GetMapping("/get/{id}")
    public Product getId(@PathVariable Long id){
        return service.getProductForId(id);
    }
    @DeleteMapping("/remove/{id}")
    public void remove(@PathVariable Long id){
        service.remove(id);
    }
}
