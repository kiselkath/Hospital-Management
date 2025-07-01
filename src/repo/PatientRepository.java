package repo;

import model.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import repo.PatientRepositoryCustom;

import java.util.List;

/**
 * Basic repository for Patient entity.
 * Custom queries are defined in PatientRepositoryCustom.
 */
@Repository
public interface PatientRepository extends CrudRepository<Patient, Long>, PatientRepositoryCustom {
    List<Patient> findByDiagnosis(String diagnosis);
}
