package by.asrohau.iShop.service;

import by.asrohau.iShop.bean.Product;
import by.asrohau.iShop.service.exception.ServiceException;

import java.util.ArrayList;

public interface ProductService {

	boolean validation(Product product);
	boolean addNewProduct(Product newProduct) throws ServiceException;
	ArrayList<Product> getAllProducts(int row) throws ServiceException;
	Product findProductWithId(Product product) throws ServiceException;
	boolean updateProduct(Product product) throws ServiceException;

	Product findProduct(Product product) throws ServiceException;
	boolean deleteProduct(Product product) throws ServiceException;
	int countProducts() throws  ServiceException;

	int countProductsComprehensive(Product product) throws  ServiceException;
	ArrayList<Product>  findProductsComprehensive(Product product, int row) throws  ServiceException;
}
