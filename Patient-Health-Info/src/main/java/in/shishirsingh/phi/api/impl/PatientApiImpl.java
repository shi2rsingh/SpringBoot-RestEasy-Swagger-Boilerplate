package in.shishirsingh.phi.api.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.shishirsingh.phi.api.PatientApi;
import in.shishirsingh.phi.model.Patient;
import in.shishirsingh.phi.service.PatientService;

@Component
public class PatientApiImpl implements PatientApi {

	@Autowired
	PatientService pservice;
	
	@Override
	public List<Patient> getPatients() {
		return pservice.getPatients();
		
	}

	/*{
        "name": "Shishir Singh",
        "age": 18,
        "height": 160,
        "weight": 80,
        "pastMedication": [
            "Diabeties",
            "BP"
        ]
    }*/
	
	@Override
	public boolean createPatients(Patient p) {
		return pservice.createPatient(p);
		
	}
	
	

}
