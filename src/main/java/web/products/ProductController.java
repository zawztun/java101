package web.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import web.utils.modals.Products;

@RestController
public class ProductController {
  @Autowired private ProjectRepository repository;

  @GetMapping("/products")
  public @ResponseBody Iterable<Products> getProduct() {
    Iterable<Products> list = repository.findAll();
    for (Products product : list) {
      System.out.println(product);
    }
    return repository.findAll();
  }

  @GetMapping("/add")
  public @ResponseBody Iterable<Products> add(
      @RequestParam(value = "title", defaultValue = "World") String title,
      @RequestParam(value = "price", defaultValue = "2000") int price) {
    Products newProduct = new Products(title, price);
    repository.save(newProduct);
    return repository.findAll();
  }
}
