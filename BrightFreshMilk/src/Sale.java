import java.util.*;

/**
 * 
 */

/**
 * @author Admin
 *
 */
public class Sale implements Iterable<CurrentOrder> {
	
	@Override
	public String toString() {
		return orderList + "";
	}

	@Override
	public Iterator<CurrentOrder> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	private ArrayList<CurrentOrder>orderList;

	/**
	 * @return the orderLists
	 */
	public ArrayList<CurrentOrder> getOrderList() {
		return orderList;
	}

	/**
	 * @param orderLists the orderLists to set
	 */
	public void setOrderList(List<CurrentOrder> orderList) {
		this.orderList = (ArrayList<CurrentOrder>) orderList;
	}

	/**
	 * @param orderList
	 */
	public Sale(ArrayList<CurrentOrder> orderList) {
		this.orderList = orderList;
	}

	/**
	 * 
	 */
	public Sale() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
