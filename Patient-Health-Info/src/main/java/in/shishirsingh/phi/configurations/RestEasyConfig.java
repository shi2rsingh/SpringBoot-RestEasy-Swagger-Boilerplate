package in.shishirsingh.phi.configurations;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import in.shishirsingh.phi.api.PatientApi;
import in.shishirsingh.phi.api.impl.PatientApiImpl;
import io.swagger.jaxrs.config.BeanConfig;

/*import io.swagger.jaxrs.config.BeanConfig;*/

@Component
@ApplicationPath("/api/")
public class RestEasyConfig extends Application {
	
	public RestEasyConfig() {
		configureSwagger();
	}
	
	private void configureSwagger() {
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.0");
        beanConfig.setSchemes(new String[] { "http" });
        beanConfig.setHost("localhost:9191");
        beanConfig.setBasePath("/");
        beanConfig.setResourcePackage(
                PatientApi.class.getPackage().getName());
        beanConfig.setTitle("RESTEasy, ...");
        beanConfig.setDescription("Sample application to demonstrate ...");
        beanConfig.setScan(true);
    }

    //add for swagger
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet();

        //resources.add(FirstResource.class);
        //resources.add(SecondResource.class);
        //...

        resources.add(PatientApiImpl.class);
        resources.add(io.swagger.jaxrs.listing.ApiListingResource.class);
        resources.add(io.swagger.jaxrs.listing.SwaggerSerializers.class);


        return resources;
    }
    //end
}
