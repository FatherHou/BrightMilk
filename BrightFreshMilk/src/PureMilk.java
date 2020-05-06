import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 */

/**
 * @author Admin
 *
 */
public class PureMilk extends Product {
	private String countryOfOrigin;
	private String butterfat;
	private String protein;
	
	/**
	 * @return the countryOfOrigin
	 */
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	/**
	 * @param countryOfOrigin the countryOfOrigin to set
	 */
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	/**
	 * @return the butterfat
	 */
	public String getButterfat() {
		return butterfat;
	}

	/**
	 * @param butterfat the butterfat to set
	 */
	public void setButterfat(String butterfat) {
		this.butterfat = butterfat;
	}

	/**
	 * @return the protein
	 */
	public String getProtein() {
		return protein;
	}

	/**
	 * @param protein the protein to set
	 */
	public void setProtein(String protein) {
		this.protein = protein;
	}



	@Override
	public String toString() {
		return "PureMilk [Code=" + getCode() + ", Description="
				+ getDescription() + ", Price=" + getPrice() + ", ProductionDate=" + getProductionDate()
				+ ", ShelfLife=" + getShelfLife() + ", CountryOfOrigin=" + getCountryOfOrigin() + ", Butterfat=" + getButterfat()
						+ ", Protein=" + getProtein()+ "]";
	}

	/**
	 * @param code
	 * @param description
	 * @param price
	 * @param productionDate
	 * @param shelfLife
	 * @param countryOfOrigin
	 * @param butterfat
	 * @param protein
	 */
	public PureMilk(String code, String description, BigDecimal price, Date productionDate, String shelfLife,
			String countryOfOrigin, String butterfat, String protein) {
		super(code, description, price, productionDate, shelfLife);
		this.countryOfOrigin = countryOfOrigin;
		this.butterfat = butterfat;
		this.protein = protein;
	}

	
	}

