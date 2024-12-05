package br.com.gestaestoque.service;

import br.com.gestaestoque.domain.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IProductService {
    public void register(Product element);
    public void edit(Product element, Long id);
    public void remove(Long id);
    public Product getProductForId(Long id);
    public List<Product> getAllProduto();
}
