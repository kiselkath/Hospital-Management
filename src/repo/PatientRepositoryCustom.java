package repo;

import model.Patient;
import java.util.List;

public interface PatientRepositoryCustom {

    List<Patient> findPatientsForDoctor(Long doctorId);

    List<Object[]> averageBillPerDepartment();

    List<Object[]> doctorsWithPatientCount(int minCount);

    List<Patient> patientsAboveAvgBill();
}
