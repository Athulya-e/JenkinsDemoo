package com.example.SpringOnetoOneUni;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.SpringOnetoOneUni.model.Address;
import com.example.SpringOnetoOneUni.model.Employee;

@SpringBootApplication
public class SpringOnetoOneUniApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringOnetoOneUniApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*Address ad=new Address();
		ad.setCity("Kozhikode");
		ad.setAddressType("Kerala");
		Employee e=new Employee();
		e.setEmpName("Ann");
		e.setEmpAge(23);
		e.setAddress(ad);
	     save(e);	*/
		
	}

}
