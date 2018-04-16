package in.shishirsingh.phi.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import in.shishirsingh.phi.model.Patient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Path("/v1/")
@Api(value="v1" ,description = "Endpoint for Patient specific operations Version 1" )
public interface PatientApi {	
	
	@GET
	@Path("/patient/")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Get patient Detail", responseContainer="List", response=Patient.class)
	public List<Patient> getPatients();
	
	@POST
	@Path("/patient/")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "Create patient Detail" , response=Boolean.class)
	public boolean createPatients(Patient p);
}
