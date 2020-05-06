import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 */

/**
 * @author Admin
 *
 */
public class Product {
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (productionDate == null) {
			if (other.productionDate != null)
				return false;
		} else if (!productionDate.equals(other.productionDate))
			return false;
		if (shelfLife == null) {
			if (other.shelfLife != null)
				return false;
		} else if (!shelfLife.equals(other.shelfLife))
			return false;
		return true;
	}

	private String code;
	private String description;
	private BigDecimal price;
	private Date productionDate;
	private String shelfLife;

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * @return the productionDate
	 */
	public Date getProductionDate() {
		return productionDate;
	}

	/**
	 * @param productionDate
	 *            the productionDate to set
	 */
	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}

	/**
	 * @return the shelfLife
	 */
	public String getShelfLife() {
		return shelfLife;
	}

	/**
	 * @param shelfLife
	 *            the shelfLife to set
	 */
	public void setShelfLife(String shelfLife) {
		this.shelfLife = shelfLife;
	}


	/**
	 * @param code
	 * @param description
	 * @param price
	 * @param productionDate
	 * @param shelfLife
	 */
	public Product(String code, String description, BigDecimal price, Date productionDate, String shelfLife) {
		this.code = code;
		this.description = description;
		this.price = price;
		this.productionDate = productionDate;
		this.shelfLife = shelfLife;
	}

	@Override
	public String toString() {
		return "[code=" + getCode() + ", description=" + getDescription() + ",price="
				+ getPrice() + "]";
	}

}
