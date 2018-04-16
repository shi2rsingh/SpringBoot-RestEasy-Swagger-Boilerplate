package in.shishirsingh.phi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.shishirsingh.phi.dao.PatientRepository;
import in.shishirsingh.phi.model.Patient;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	PatientRepository prepo;
	
	@Override
	public List<Patient> getPatients() {
		return prepo.findAll();

	}

	@Override
	public boolean createPatient(Patient p) {
		prepo.save(p);
		return true;
	}

}
