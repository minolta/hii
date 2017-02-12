package me.pixka.hii.s;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.pixka.hii.d.Product;
import me.pixka.hii.r.ProductRepo;

@Service
@Transactional
public class ProductServiceimpl implements ProductService {

	@Autowired
	private ProductRepo dao;
	@Override
	public Object add(Object o) {
		return dao.save((Product) o);
	}
	@Override
	public Iterable<Product> list() {
		return dao.findAll();
	}
	public void delete(Product product) {
		 dao.delete(product);
	}
	public Product get(Long id) {
		
		return dao.findOne(id);
	}
	public Product edit(Product p)
	{
		return dao.save(p);
	}
	
}
