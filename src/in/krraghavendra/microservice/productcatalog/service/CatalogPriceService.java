package in.krraghavendra.microservice.productcatalog.service;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.krraghavendra.microservice.productcatalog.model.ProductPrice;
import in.krraghavendra.microservice.productcatalog.service.jaxb.PriceJaxb;

@Path("/")
public class CatalogPriceService {
	
	@Context
	HttpServletRequest request;
	
	@GET
	@Path("/{id}")
	public Response getPrice(@PathParam("id") int id){
		Session session = (Session)request.getServletContext().getAttribute("hibernateSession");
		Transaction tx = session.beginTransaction();
		
		ProductPrice price = session.load(ProductPrice.class, id);
		
		tx.commit();
		
		PriceJaxb priceJaxb = new PriceJaxb();
		priceJaxb.setProductId(id);
		priceJaxb.setPrice(price.getPrice());
		
		
	    return Response.ok(priceJaxb).build();
	}
	
	
	

}
