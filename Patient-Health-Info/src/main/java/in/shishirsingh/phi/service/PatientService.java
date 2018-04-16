package in.shishirsingh.phi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.shishirsingh.phi.model.Patient;


public interface PatientService {
	public List<Patient> getPatients();
	public boolean createPatient(Patient p);
}
