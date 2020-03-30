package com.restapi.https;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import com.restapi.https.controller.EmpController;
import com.restapi.https.dao.Employee;
import com.restapi.https.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@ExtendWith(MockitoExtension.class)
public class EmpControllerTest {

	@InjectMocks
	EmpController empController;
	@Mock
	EmployeeRepository employeeRepository;

	@Test
	public void testAddEmp() {

		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

//		when(employeeRepository.save(any(Employee.class))).thenReturn(new Employee());

		Employee employee = new Employee("Lokesh", 8384, "IT");
//		ResponseEntity<Object> responseEntity =   employeeRepository.save(employee);
//		assertThat(responseEntity.getStatusCodeValue()).isEqualTo(201);
//		assertThat(responseEntity.getHeaders().getLocation().getPath()).isEqualTo("/1");
	}

}
