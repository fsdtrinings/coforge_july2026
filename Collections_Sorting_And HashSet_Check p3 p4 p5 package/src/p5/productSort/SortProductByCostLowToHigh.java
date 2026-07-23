package p5.productSort;

import java.util.Comparator;

import p3.Product;

public class SortProductByCostLowToHigh implements Comparator<Product>
{

	@Override
	public int compare(Product p1, Product p2) {
		return p1.getCost() - p2.getCost();
	}

	
}
