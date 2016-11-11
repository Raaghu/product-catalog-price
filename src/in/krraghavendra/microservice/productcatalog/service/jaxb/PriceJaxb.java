package in.krraghavendra.microservice.productcatalog.service.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="price")
public class PriceJaxb {
	
	@XmlAttribute(name="productId")
	private int productId;
	
	@XmlAttribute(name="price")
	private float price;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
}
