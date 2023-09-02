package dao;

public interface ProductDetails {
	
	void addProduct() ;
	void searchProduct(String name);
	void deleteProduct(int id);
	void displayProduct();
	void updateProduct(int id);

}
