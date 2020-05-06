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

	static public PlainTextSalesFormatter getSingletonInstance() {// ��ȡ��ĵ�һʵ��
		if (singletonInstance == null) {
			singletonInstance = new PlainTextSalesFormatter();
		}
		return singletonInstance;
	}

	private PlainTextSalesFormatter() {
		// ���캯������˽�У������಻�ܴ�������ʵ��
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
