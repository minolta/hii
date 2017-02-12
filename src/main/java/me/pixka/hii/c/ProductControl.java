package me.pixka.hii.c;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import me.pixka.hii.d.Product;
import me.pixka.hii.s.ProductServiceimpl;


@RestController
@RequestMapping("/rest")
public class ProductControl {

	@Autowired
	private ProductServiceimpl productService;
	
	@RequestMapping(value="/addproduct", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	@ResponseBody
	public Product add(@RequestBody Product product)
	{
		product = (Product) productService.add(product);
		return product;
	}
	
	@RequestMapping(value="/listproducts", method = RequestMethod.GET, produces = "application/json", consumes = "application/json")
	@ResponseBody
	public List list()
	{
		return (List) productService.list();
	}
	
	@RequestMapping(value="/deleteproduct", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	@ResponseBody
	public Product del(@RequestBody Product product)
	{
		productService.delete(product);
		
		return product;
	}
	
	@RequestMapping(value="/editproduct", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	@ResponseBody
	public Product edit(@RequestBody Product product)
	{
		Product pd = productService.get(product.getId());
		pd.setCode(product.getCode());
		pd.setName(product.getName());
		
		product = productService.edit(pd);
		return product;
	}
	
	@RequestMapping(value="/getproduct/{id}", method = RequestMethod.GET, produces = "application/json", consumes = "application/json")
	@ResponseBody
	public Product get(@PathVariable("id") Long id)
	{
		return productService.get(id);
		
		
	}
}
