package in.krraghavendra.microservice.productcatalog.service;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/catalog-price")
public class ApplicationConfig extends Application {
	
	@Override
	public Set<Class<?>> getClasses() {
		HashSet<Class<?>> resources = new HashSet<Class<?>>();
		resources.add(CatalogPriceService.class);
		return resources;
	}

}
