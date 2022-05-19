package com.swagger.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swagger.Entity.swagger;
import com.swagger.Repositories.SwaggerRepository;




@RestController
@RequestMapping(value="/doctor")
public class SwaggerController {
	
	@Autowired
	private SwaggerRepository doctorRepo;
	@GetMapping(value="/getdoctor")
	public List<swagger> getAlldoctor()
	{
	List<swagger> doctor=doctorRepo.findAll();
	return doctor;
	}

	@GetMapping(value="/getdoctor/{roll_no}")
	public Optional<swagger> getdoctorById(@PathVariable int roll_no)
	{
	Optional<swagger> doctor = doctorRepo.findById(roll_no);
	return doctor;
	}

	@PostMapping(value="/savedoctor")
	public void savedoctor(@RequestBody swagger doctor) {
	doctorRepo.save(doctor);
	}

	@PutMapping(value="/updatedoctor")
	public void updatedoctor(@RequestBody swagger doctor)
	{
	doctorRepo.save(doctor);
	}

	@DeleteMapping("/delete/{roll_no}")
	public void delatedoctor(@PathVariable int roll_no)
	{
	doctorRepo.deleteById(roll_no);
	}

}
