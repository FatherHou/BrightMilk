import java.util.*;
/**
 * 
 */

/**
 * @author
 *
 */
public class PlainTextSalesFormatter implements SalesFormatter {

	private final static String NEW_LINE = System.getProperty("line.separator");
	static private PlainTextSalesFormatter singletonInstance = null;

	static public PlainTextSalesFormatter getSingletonInstance() {// 获取类的单一实例
		if (singletonInstance == null) {
			singletonInstance = new PlainTextSalesFormatter();
		}
		return singletonInstance;
	}

	private PlainTextSalesFormatter() {
		// 构造函数声明私有，其他类不能创建该类实例
	}

	public String formateSales(Sale sales) {
		String out = "";
		int j = 1;
		for (int i = 0; i < sales.getOrderList().size(); i++) {
			out += "-----------------" + NEW_LINE + "Order " + j + NEW_LINE;
			for (int k = 0; k < sales.getOrderList().get(i).getOrderItemList().size(); k++) {
				out += sales.getOrderList().get(i).getOrderItemList().get(k).getQuantity() + " ";
				out += sales.getOrderList().get(i).getOrderItemList().get(k).getProduct().getCode() + " ";
				out += sales.getOrderList().get(i).getOrderItemList().get(k).getProduct().getPrice() + " ";
				out += NEW_LINE;
			}
			out += "Total= " + sales.getOrderList().get(i).getOrderTotal() + NEW_LINE;
			// sales.getOrderList().toString();
			j += 1;
		}
		return out;
	}
}
