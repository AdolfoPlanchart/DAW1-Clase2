package pe.cibertec.ecommerce.ApiProduct.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Products")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productId")
    private Long id;

    @Column(name = "productName")
    private String name;

    @Column(name = "productDescription")
    private String description;

    @Column(name = "productPrice")
    private double price;

    @Column(name = "imgUrl")
    private String imageUrl;
}
