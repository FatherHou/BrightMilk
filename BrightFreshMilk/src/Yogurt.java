import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 */

/**
 * @author Admin
 *
 */
public class Yogurt extends Product {
	private String flavor;
	/**
	 * @return the flavor
	 */
	public String getFlavor() {
		return flavor;
	}
	
	/**
	 * @param flavor the flavor to set
	 */
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	


	@Override
	public String toString() {
		return "Yogurt [Code=" + getCode() + ", Description="
				+ getDescription() + ", Price=" + getPrice() + ", ProductionDate=" + getProductionDate()
				+ ", ShelfLife=" + getShelfLife() + ", Flavor=" + getFlavor()+"]";
	}

	/**
	 * @param code
	 * @param description
	 * @param price
	 * @param productionDate
	 * @param shelfLife
	 * @param flavor
	 */
	public Yogurt(String code, String description, BigDecimal price, Date productionDate, String shelfLife,
			String flavor) {
		super(code, description, price, productionDate, shelfLife);
		this.flavor = flavor;
	}
	
}
