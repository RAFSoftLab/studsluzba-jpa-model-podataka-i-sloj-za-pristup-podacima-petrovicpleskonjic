package repositories;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import student_administration.models.Subject;
import student_administration.repositories.DepartmentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentRepositoryTest {

	@Autowired
	DepartmentRepository departmentRepository;
	
	@Test
	public void getSubjectOnDepartment() throws Exception{
		System.out.println("---getSubjectOnDepartment---");
		List<Subject> subjects = departmentRepository.getSubjectByDepartmentId(1);
		
		for(Subject s : subjects) {
			System.out.println(s);
		}
	}
}
