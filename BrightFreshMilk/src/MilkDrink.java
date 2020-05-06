import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 */

/**
 * @author Admin
 *
 */
public class MilkDrink extends Product {
	private String flavor;
	private String sugar;

	/**
	 * @return the flavor
	 */
	public String getFlavor() {
		return flavor;
	}

	/**
	 * @param flavor
	 *            the flavor to set
	 */
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	/**
	 * @return the sugar
	 */
	public String getSugar() {
		return sugar;
	}

	/**
	 * @param sugar
	 *            the sugar to set
	 */
	public void setSugar(String sugar) {
		this.sugar = sugar;
	}



	@Override
	public String toString() {
		return "MilkDrink [Code=" + getCode()
				+ ", Description=" + getDescription() + ", Price=" + getPrice() + ", ProductionDate="
				+ getProductionDate() + ", ShelfLife=" + getShelfLife() + ", Flavor=" + getFlavor() + ", Sugar=" + getSugar() + "]";
	}

	/**
	 * @param code
	 * @param description
	 * @param price
	 * @param productionDate
	 * @param shelfLife
	 * @param flavor
	 * @param sugar
	 */
	public MilkDrink(String code, String description, BigDecimal price, Date productionDate, String shelfLife,
			String flavor, String sugar) {
		super(code, description, price, productionDate, shelfLife);
		this.flavor = flavor;
		this.sugar = sugar;
	}

}
