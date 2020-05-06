

/**
 * 
 */

/**
 * @author Admin
 *
 */
public class OrderItem {
	private int quantity;
	private Product product;
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "[quantity=" + quantity + "," + "code=" + product.getCode() + ",description=" + product.getDescription() + ",price=" + product.getPrice() + "]"+ '\n';
	}

	/**
	 * @param product
	 * @param quantity
	 */
	public OrderItem(Product product, int quantity) {
		this.quantity = quantity;
		this.product = product;
	}

	/**
	 * 
	 */
	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}
		


}
