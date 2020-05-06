import java.math.BigDecimal;
import java.util.*;

public class CurrentOrder implements Iterable<OrderItem> {



	@Override
	public Iterator<OrderItem> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	private BigDecimal orderTotal;
	private ArrayList<OrderItem> orderItemList;

	/**
	 * @return the orderTotal
	 */
	public BigDecimal getOrderTotal() {
		return orderTotal;
	}

	/**
	 * @param orderTotal
	 *            the orderTotal to set
	 */
	public void setOrderTotal(BigDecimal orderTotal) {
		this.orderTotal = orderTotal;
	}


	/**
	 * @return the orderItemLists
	 */
	public ArrayList<OrderItem> getOrderItemList() {
		return orderItemList;
	}

	/**
	 * @param orderItemLists
	 *            the orderItemLists to set
	 */
	public void setOrderItemList(List<OrderItem> orderItemList) {
		this.orderItemList = (ArrayList<OrderItem>) orderItemList;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if(orderTotal.doubleValue()==0) return "The current order is empty!";
		else{
		int a=orderItemList.size();
		for(int i=0;i<a;i++){
			System.out.print(orderItemList.get(i));
		}
		return "orderTotal=" + orderTotal;
		}
	}

	/**
	 * @param orderTotal
	 * @param orderItemList
	 */
	public CurrentOrder(BigDecimal orderTotal, ArrayList<OrderItem> orderItemList) {
		this.orderTotal = orderTotal;
		this.orderItemList = orderItemList;
	}

	/**
	 * 
	 */
	public CurrentOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
