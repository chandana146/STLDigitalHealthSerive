package com.Health.StlHealth_Dev.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.Health.StlHealth_Dev.Model.CaseDoctorMapping;
public interface CaseDoctorMappingRepo extends JpaRepository<CaseDoctorMapping, Long> {
	@Query(value="SELECT * FROM tbl_case_doctor_mapping WHERE doctor_id=?",nativeQuery = true)
    public List<CaseDoctorMapping> getCasesByDoctorId(Long doctor_id);
	@Query(value="SELECT * FROM tbl_case_doctor_mapping WHERE case_id=?",nativeQuery = true)
    public CaseDoctorMapping getCasesBycaseId(Long case_id);
	@Query(value="SELECT * FROM tbl_case_doctor_mapping WHERE case_id=?",nativeQuery = true)
    public CaseDoctorMapping getCasesByPatientId(Long patient_id);
	@Query(value="SELECT tbl_cases.patient_id, tbl_cases.case_id, tbl_cases.vle_note, tbl_cases.case_date, tbl_case_doctor_mapping.doctor_id FROM tbl_cases INNER JOIN tbl_case_doctor_mapping ON tbl_cases.case_id=tbl_case_doctor_mapping.case_id WHERE patient_id=?",nativeQuery = true)
//	@Query(value="SELECT tbl_cases.patient_id FROM tbl_Cases INNER JOIN tbl_case_doctor_mapping ON tbl_Cases.case_id=tbl_case_doctor_mapping.case_id WHERE case_id=?",nativeQuery=true);
	public List<String> getCasesBypatientId(Long patient_id);
	
}


