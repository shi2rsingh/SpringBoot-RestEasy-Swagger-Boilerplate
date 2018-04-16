package in.shishirsingh.phi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.shishirsingh.phi.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, String> {

}
