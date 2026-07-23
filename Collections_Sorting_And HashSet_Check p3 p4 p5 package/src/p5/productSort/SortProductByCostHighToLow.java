package p5.productSort;

import java.util.Comparator;

import p3.Product;

public class SortProductByCostHighToLow implements Comparator<Product>
{

	@Override
	public int compare(Product p1, Product p2) {
		return p2.getCost() - p1.getCost();
	}

	
}
