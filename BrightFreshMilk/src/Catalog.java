import java.util.*;
/**
 * 
 */

/**
 * @author Admin
 *
 */
public class Catalog implements Iterable<Product>{

	@Override
	public Iterator<Product> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private ArrayList<Product>productList;
	

	/**
	 * @return the productLists
	 */
	public ArrayList<Product> getProductList() {
		return productList;
	}


	/**
	 * @param productLists the productLists to set
	 */
	public void setProductList(List<Product> productList) {
		this.productList = (ArrayList<Product>) productList;
	}


	public Product findProductByCode(String code) {
		Iterator<Product> iterator=productList.iterator();
		while(iterator.hasNext()){
			Product productList=iterator.next();
			if((productList.getCode()).equals(code))
				return productList;
		}
		return null;
	}


	/**
	 * 
	 */
	public Catalog() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param productList
	 */
	public Catalog(ArrayList<Product> productList) {
		this.productList = productList;
	}
	
}
