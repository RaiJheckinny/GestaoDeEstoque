package br.com.gestaestoque.service;

import br.com.gestaestoque.domain.Product;
import br.com.gestaestoque.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements IProductService{
    @Autowired
    private IProductRepository repository;

    @Override
    public void register(Product element) {
        repository.save(element);
    }

    @Override
    public void edit(Product element, Long id) {
        Product productExist = repository.getReferenceById(id);
        productExist.setName(element.getName());
        productExist.setDescription(element.getDescription());
        productExist.setAmount(element.getAmount());
        repository.save(productExist);
    }

    @Override
    public void remove(Long id) {
        repository.delete(repository.findById(id).get());
    }

    @Override
    public Product getProductForId(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Product> getAllProduto() {
        return repository.findAll();
    }
}
