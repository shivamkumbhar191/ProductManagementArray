package app;

import java.util.Scanner;

import dao.ProductImplementation;

public class AddProductApp {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		
		ProductImplementation prdImple= new ProductImplementation();
		
		char ch;
		do{
			System.out.println("enter the choice");
			System.out.println("1.Add Product\n2.Search Product\n3.Delete Product\n4.Display Product\n5.Update Product");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:prdImple.addProduct();
			break;
			case 2:
				System.out.println("search product");
				String searchProd=sc.next();
				prdImple.searchProduct(searchProd);
			break;
			case 3:prdImple.deleteProduct(101);
			break;
			case 4:prdImple.displayProduct();
			break;
			case 5:prdImple.updateProduct(101);
			break;
			default:System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue");
			ch=sc.next().charAt(0);
		}
		while(ch=='y' || ch=='Y') ;
		
		sc.close();

	}

}
