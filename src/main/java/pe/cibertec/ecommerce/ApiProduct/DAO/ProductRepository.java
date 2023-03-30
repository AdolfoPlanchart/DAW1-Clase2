package pe.cibertec.ecommerce.ApiProduct.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.ecommerce.ApiProduct.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
