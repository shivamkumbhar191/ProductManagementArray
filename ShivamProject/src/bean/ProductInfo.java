package bean;

public class ProductInfo {
	
	public int prodId;
	public String prodName;
	public double prodPrice;
	public int prodQuntity;
	
	public ProductInfo(int prodId,String prodName,double prodPrice,int prodQuntity){
		this.prodId=prodId;
		this.prodName=prodName;
		this.prodPrice=prodPrice;
		this.prodQuntity=prodQuntity;
		
	}
	public String toString() {
		return prodId+" "+prodName+" "+prodPrice+" "+prodQuntity;
	}

}
