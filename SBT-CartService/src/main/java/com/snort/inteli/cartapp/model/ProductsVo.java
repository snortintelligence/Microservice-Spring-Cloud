package com.snort.inteli.cartapp.model;

import java.util.ArrayList;

public class ProductsVo {
	public ArrayList<Product> products;
	public int total;
	public int skip;
	public int limit;

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getSkip() {
		return skip;
	}

	public void setSkip(int skip) {
		this.skip = skip;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	@Override
	public String toString() {
		return "ProductsVo [products=" + products + ", total=" + total + ", skip=" + skip + ", limit=" + limit + "]";
	}

}
