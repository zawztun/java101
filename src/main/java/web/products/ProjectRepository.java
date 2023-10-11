package web.products;

import org.springframework.data.repository.CrudRepository;
import web.utils.modals.Products;

import java.util.List;

/**
 * Entity Operation of Data
 * */
public interface ProjectRepository extends CrudRepository<Products, Long> {

}
