package restfulwebservice03;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SF03StudentBeanAdminController {

	private SF03StudentBeanService studentService;

	@Autowired
	public SF03StudentBeanAdminController(SF03StudentBeanService studentService) {
		this.studentService = studentService;
	}
	
	@GetMapping(path="/admin/api/v1/allStudents")
	@PreAuthorize("hasAnyRole('ROLE_STUDENT', 'ROLE_ADMIN')")
	public List<SF03StudentBean> getAllStudents(){
		return studentService.listStudents();
	}
	
	@GetMapping(path="/admin/api/v1/allStudents/{id}")
	@PreAuthorize("hasAnyRole('ROLE_STUDENT', 'ROLE_ADMIN')")
	public SF03StudentBean getStdById(@PathVariable Long id) {
		return studentService.selectStdById(id);
	}
	
	@DeleteMapping(path = "/admin/api/v1/deleteStudents/{id}")
	@PreAuthorize("hasAuthority('student:write')")
	public String deleteStdById(@PathVariable(value="id") Long id) {
		return studentService.deleteStdById(id);
	}
	
	@PutMapping(path = "/admin/api/v1/updateStudents/{id}")
	@PreAuthorize("hasAuthority('student:write')")
	public ResponseEntity<SF03StudentBean> updateStudent(@PathVariable Long id, @Validated @RequestBody SF03StudentBean student){
		return ResponseEntity.ok(studentService.updateStudent(id, student));		
	}
	
	/*
	 	Note: If you do not put @PreAuthorize("hasAuthority('student:write')")
	 	for PATCH method, all users can use PATCH method, because it is open
	 	to all as default.
	 */
	
	@PatchMapping(path = "/admin/api/v1/updateStudentsPartially/{id}")
	public ResponseEntity<SF03StudentBean> updateStudentPartially(@PathVariable Long id, @Validated @RequestBody SF03StudentBean student){
		return ResponseEntity.ok(studentService.updateStdPartially(id, student));		
	}
	
	@PostMapping(path = "/admin/api/v1/addNewStudent")
	@PreAuthorize("hasAuthority('student:write')")
	public ResponseEntity<SF03StudentBean> updateStudentPartially(@Validated @RequestBody SF03StudentBean student) throws ClassNotFoundException, SQLException{
		return ResponseEntity.ok(studentService.addStudent(student));		
	}
	
}
