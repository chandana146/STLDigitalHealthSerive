package com.Health.StlHealth_Dev.Controllers;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Health.StlHealth_Dev.Model.CaseDoctorMapping;
import com.Health.StlHealth_Dev.repositories.CaseDoctorMappingRepo;
import com.fasterxml.jackson.databind.util.JSONPObject;


	@RestController
	@CrossOrigin("http://localhost:4200")
	public class CaseDoctorMappingController {
		@Autowired(required=false)
	private CaseDoctorMappingRepo caseDoctorMappingRepo;
		@GetMapping("/view_doctormap")
		public ResponseEntity<List<CaseDoctorMapping>> view_doctormap() {
			try {
						List<CaseDoctorMapping> MappingList= new ArrayList<>();
						caseDoctorMappingRepo.findAll().forEach(MappingList::add);
						if(MappingList.isEmpty()) {
							return new ResponseEntity<List<CaseDoctorMapping>>(HttpStatus.NO_CONTENT);
						}
						return new ResponseEntity<List<CaseDoctorMapping>>(MappingList,HttpStatus.OK);
					} catch(Exception ex) {
						return new ResponseEntity<List<CaseDoctorMapping>>(HttpStatus.INTERNAL_SERVER_ERROR);
					}
				}
		@GetMapping("/view_doctormapBycaseid/{id}")
		public CaseDoctorMapping view_doctormapcaseId(@PathVariable("id") Long case_id) {
			CaseDoctorMapping caseDoctorMapping=caseDoctorMappingRepo.getCasesBycaseId(case_id);
			System.out.println(caseDoctorMapping);
			return caseDoctorMapping;
		}
		@GetMapping("/view_doctormap/{id}")
		public ResponseEntity<CaseDoctorMapping> view_doctormap(@PathVariable Long id) {
			Optional<CaseDoctorMapping> CasesMapData=caseDoctorMappingRepo.findById(id);
			if(CasesMapData.isPresent()) {
				return new ResponseEntity<>(CasesMapData.get(),HttpStatus.OK);
			}
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		@GetMapping("view_ByDoctorId/{id}")
		public List<CaseDoctorMapping> view_doctormapId(@PathVariable("id") Long doctor_id) {
			List<CaseDoctorMapping> caseDoctorMapping=caseDoctorMappingRepo.getCasesByDoctorId(doctor_id);
			System.out.println(caseDoctorMapping);
			return caseDoctorMapping;
		}
		@GetMapping("view_BypatientId/{id}")
		public String view_BypatientId(@PathVariable("id") Long patient_id) {
			try {
				List<String> caseDoctorMapping=caseDoctorMappingRepo.getCasesBypatientId(patient_id);
				List<JSONObject> caseDoctorMappingList=new ArrayList<JSONObject>();
				for(String x:caseDoctorMapping) {
					String[] data=x.split(",");
					JSONObject object=new JSONObject();
					object.put("patient_id",data[0]);
					object.put("case_id",data[1]);
					object.put("vle_note",data[2]);
					object.put("case_date",data[3]);
					object.put("doctor_id",data[4]);
					caseDoctorMappingList.add(object);
				}
				System.out.println(caseDoctorMappingList);
				return caseDoctorMappingList.toString();
			}catch(Exception x) {
				x.printStackTrace();
				return null;
			}
						
		}
		@PostMapping("/add_doctormap")
		public ResponseEntity<CaseDoctorMapping> addCases(@RequestBody CaseDoctorMapping cases) {
			CaseDoctorMapping CasesObj=caseDoctorMappingRepo.save(cases);
			return new ResponseEntity<>(CasesObj,HttpStatus.OK);
		}
		@PutMapping("/edit_doctormap/{id}")
		public ResponseEntity<CaseDoctorMapping> updateCasesById(@PathVariable Long id, @RequestBody CaseDoctorMapping newCasesData) {
			Optional<CaseDoctorMapping>OldCasesData=caseDoctorMappingRepo.findById(id);
			if(OldCasesData.isPresent()) {
				CaseDoctorMapping updatedCasesMapData =	OldCasesData.get();
			updatedCasesMapData.setCase_id(newCasesData.getCase_id());
			updatedCasesMapData.setDoctor_id(newCasesData.getDoctor_id());
			updatedCasesMapData.setRejected_by_id(newCasesData.getRejected_by_id());
			updatedCasesMapData.setApproved_by_id(newCasesData.getApproved_by_id());
			updatedCasesMapData.setAssigned_by_id(newCasesData.getAssigned_by_id());
			updatedCasesMapData.setReason(newCasesData.getReason());
			updatedCasesMapData.setMappingStatus(newCasesData.getMappingStatus());			
			updatedCasesMapData.setCreated_date(newCasesData.getCreated_date());
			updatedCasesMapData.setUpdated_date(newCasesData.getUpdated_date());
			CaseDoctorMapping CasesObj=caseDoctorMappingRepo.save(updatedCasesMapData);
			return new ResponseEntity<>(CasesObj,HttpStatus.OK);
			}
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		@DeleteMapping("/delete_doctormap/{id}")
		public ResponseEntity<HttpStatus> deleteCasesById(@PathVariable Long id) {
			caseDoctorMappingRepo.deleteById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
	}


