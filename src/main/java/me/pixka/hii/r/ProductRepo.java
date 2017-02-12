package me.pixka.hii.r;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import me.pixka.hii.d.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product, Long> {

}
