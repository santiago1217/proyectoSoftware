package co.edu.uco.apiparqueadero;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class Apipropietario2021Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Apipropietario2021Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		 String password = "abcd1234*";
		 for (int i = 0; i < 10; i++) {
			 BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();	 
			 String passwordEncrypt = passwordEncoder.encode(password);
			 System.out.println(passwordEncrypt); 
		}
		
	}

}
