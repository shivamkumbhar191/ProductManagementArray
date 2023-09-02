package dao;

import java.util.Scanner;

import bean.ProductInfo;

public class ProductImplementation implements ProductDetails {

	ProductInfo prd[] = new ProductInfo[4];
	Scanner sc = new Scanner(System.in);
	int count;

	public ProductImplementation() {
		count = 0;
	}

	@Override
	public void addProduct() {
		System.out.println("enter the total number of product");
		int prodNo = sc.nextInt();
		for (int i = 1; i <= prodNo; i++) {
			System.out.println("enter the product Id");
			int id = sc.nextInt();
			System.out.println("enter the product name");
			String name = sc.next();
			System.out.println("enter the product price");
			double price = sc.nextDouble();
			System.out.println("enter the product Quntity");
			int qunt = sc.nextInt();

			prd[count] = new ProductInfo(id, name, price, qunt);
			count++;

		}

	}

	@Override
	public void searchProduct(String name) {
		// TODO Auto-generated method stub
		System.out.println("searching product.............");
		for (int i = 0; i < count; i++) {
			if (prd[i] != null) {
				if (prd[i].prodName.contains(name)) {
					System.out.println(
							"product found with prodct id " + prd[i].prodId + " and product name " + prd[i].prodName);

				}

			}
		}

	}

	@Override
	public void deleteProduct(int id) {
		for (int i = 0; i < count; i++) {
			if (prd[i] != null && prd[i].prodId == id) {
				prd[i] = null;

			}
		}

	}

	@Override
	public void updateProduct(int id) {
		// TODO Auto-generated method stub

		for (int i = 0; i < count; i++) {
			if (prd[i].prodId == id && prd[i] != null) {
				
				char ch;
				do {
					System.out.println("enter the choice");
					System.out.println("1.update price\n2.update quntity");
					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						System.out.println("enter the new price");
						int newPrice = sc.nextInt();
						prd[i].prodPrice = newPrice;
						break;
					case 2:
						System.out.println("enter the quntity");
						int newQuntity = sc.nextInt();
						prd[i].prodQuntity = newQuntity;
						break;
					default:
						System.out.println("Invalid choice");
					}
					System.out.println("Do you want to update again");
					ch = sc.next().charAt(0);
				} while (ch == 'y' || ch == 'Y');
			}
		}

	}

	@Override
	public void displayProduct() {
		// TODO Auto-generated method stub
		for (int i = 0; i < count; i++) {
			System.out.println(prd[i]);
		}

	}

}
