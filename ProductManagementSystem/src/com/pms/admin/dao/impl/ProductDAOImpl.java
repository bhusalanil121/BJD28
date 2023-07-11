package com.pms.admin.dao.impl;

import java.util.List;
import java.util.*;

import com.pms.admin.dao.ProductDAO;
import com.pms.model.Product;

public class ProductDAOImpl implements ProductDAO {

	Scanner sc = new Scanner(System.in);

	List<Product> addProduct = new LinkedList<Product>();

	@Override
	public void addProduct() {
		// TODO Auto-generated method stub
		int k = 1;
		while (k == 1) {
			System.out.print("Enter Product Id: ");
			int pid = sc.nextInt();

			System.out.print("Enter Product Name: ");
			String pName = sc.next();

			System.out.print("Enter Product Qty: ");
			int pqty = sc.nextInt();

			System.out.print("Enter Product Price: ");
			int price = sc.nextInt();

			Product product = new Product(pid, pqty, price, pName);
			addProduct.add(product);

			System.out.println("Do you want to add more product 1) Yes 2) No : ");
			k = sc.nextInt();
		}

	}

	@Override
	public List<Product> viewProducts() {
		// TODO Auto-generated method stub
		return addProduct;
	}

	@Override
	public Product viewProduct(int pid) {
		// TODO Auto-generated method stub
		for (Product pro : addProduct) {
			if (pro.getPid() == pid) {
				return pro;
			}
		}
		return null;
	}

	@Override
	public void updateProduct(int pid) {
		// TODO Auto-generated method stub
		int k = 0;
		for(Product pd : addProduct) {
			if(pd.getPid() == pid) {
				++k;
				System.out.println("What you want to update 1) name 2)Quantity 3) Price");
				int choice = sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("Please enter the updated name: ");
					String uName = sc.next();
					pd.setPname(uName);
					System.out.println("Product Name updated Sucessfully!!!");
					break;
				case 2:
					System.out.println("Please enter the updated Quantity: ");
					int uQty = sc.nextInt();
					pd.setQty(uQty);
					System.out.println("Quantity updated Sucessfully!!!");
					break;
				case 3:
					System.out.println("Please enter the updated Price: ");
					int uPrice = sc.nextInt();
					pd.setPrice(uPrice);
					System.out.println("Price updated Sucessfully!!!");
					break;
				default:
					System.out.println("Enter number between 1- 3");
				
				}
			}
		}
		if (k ==0) {
			System.out.println("Given id does ;t exist");
		}

	}

	@Override
	public void deleteProduct(int pid) {
		// TODO Auto-generated method stub
		int k = 0;
		for (Product pro : addProduct) {
			if (pro.getPid() == pid) {
				addProduct.remove(pro);
				System.out.println("Product Deleted Sucessfully");
				++k;
				break;

			}

		}
		if (k == 0) {
			System.out.println("Id doesnot exist.");
		}
	}

}
