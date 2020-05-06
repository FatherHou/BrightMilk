import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 */

/**
 * @author Admin
 *
 */
public class Jelly extends Product {
	private String type;
	private String diluteconcentration;
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * @return the diluteconcentration
	 */
	public String getDiluteconcentration() {
		return diluteconcentration;
	}
	/**
	 * @param diluteconcentration the diluteconcentration to set
	 */
	public void setDiluteconcentration(String diluteconcentration) {
		this.diluteconcentration = diluteconcentration;
	}
	

	
	@Override
	public String toString() {
		return "Jelly [Code=" + getCode() + ", Description=" + getDescription() + ", Price=" + getPrice()
				+ ", ProductionDate=" + getProductionDate() + ", ShelfLife=" + getShelfLife() + ", Type=" + getType() + ", Diluteconcentration=" + getDiluteconcentration()+ "]";
	}
	/**
	 * @param code
	 * @param description
	 * @param price
	 * @param productionDate
	 * @param shelfLife
	 * @param type
	 * @param diluteconcentration
	 */
	public Jelly(String code, String description, BigDecimal price, Date productionDate, String shelfLife, String type,
			String diluteconcentration) {
		super(code, description, price, productionDate, shelfLife);
		this.type = type;
		this.diluteconcentration = diluteconcentration;
	}


}
