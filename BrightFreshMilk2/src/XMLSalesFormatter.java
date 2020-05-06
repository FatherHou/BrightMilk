/**
 * 
 */

/**
 * @author
 *
 */
public class XMLSalesFormatter implements SalesFormatter {

	private final static String NEW_LINE = System.getProperty("line.separator");
	static private XMLSalesFormatter singletonInstance = null;

	static public XMLSalesFormatter getSingletonInstance() {
		if (singletonInstance == null) {
			singletonInstance = new XMLSalesFormatter();
		}
		return singletonInstance;
	}

	private XMLSalesFormatter() {

	}

	public String formateSales(Sale sales) {
		String out = "<Sales>" + NEW_LINE;
		for (int i = 0; i < sales.getOrderList().size(); i++) {
			out += " <Order Total=¡±" + sales.getOrderList().get(i).getOrderTotal() + "¡±>" + NEW_LINE;
			for (int j = 0; j < sales.getOrderList().get(i).getOrderItemList().size(); j++) {
				out += "  <OrderItem quantity=¡±" + sales.getOrderList().get(i).getOrderItemList().get(j).getQuantity()
						+ "¡± price=¡±" + sales.getOrderList().get(i).getOrderItemList().get(j).getProduct().getPrice()
						+ "¡±>" + sales.getOrderList().get(i).getOrderItemList().get(j).getProduct().getCode()
						+ "</OrderItem>" + NEW_LINE;
			}
			out += " </Order>" + NEW_LINE;
		}
		out += "</sales>";
		return out;
	}
}
