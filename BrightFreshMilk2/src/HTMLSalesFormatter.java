/**
 * 
 */

/**
 * @author
 *
 */
public class HTMLSalesFormatter implements SalesFormatter {

	private final static String NEW_LINE = System.getProperty("line.separator");
	static private HTMLSalesFormatter singletonInstance = null;

	static public HTMLSalesFormatter getSingletonInstance() {
		if (singletonInstance == null) {
			singletonInstance = new HTMLSalesFormatter();
		}
		return singletonInstance;
	}

	private HTMLSalesFormatter() {

	}

	public String formateSales(Sale sales) {
		String out = "<html>" + NEW_LINE + " <body>" + NEW_LINE + "  <center><h2>Orders</h2></center>" + NEW_LINE;
		for (int i = 0; i < sales.getOrderList().size(); i++) {
			out += "   <hr>" + NEW_LINE + "   <h4>" + "<Total=" + sales.getOrderList().get(i).getOrderTotal() + ">"
					+ "</h4>" + NEW_LINE;
			for (int j = 0; j < sales.getOrderList().get(i).getOrderItemList().size(); j++) {
				out += "    <p>" + NEW_LINE;
				out += "      <b>code:</b> "
						+ sales.getOrderList().get(i).getOrderItemList().get(j).getProduct().getCode() + "<br>"
						+ NEW_LINE;
				out += "      <b>quantity:</b> " + sales.getOrderList().get(i).getOrderItemList().get(j).getQuantity()
						+ "<br>" + NEW_LINE;
				out += "      <b>price:</b> "
						+ sales.getOrderList().get(i).getOrderItemList().get(j).getProduct().getPrice() + NEW_LINE;
				out += "    </p>" + NEW_LINE;
			}
		}
		out += " </body>" + NEW_LINE + "</html>";
		return out;
	}
}
