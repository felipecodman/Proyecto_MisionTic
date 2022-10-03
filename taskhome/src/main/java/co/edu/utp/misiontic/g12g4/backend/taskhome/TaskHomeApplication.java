package co.edu.utp.misiontic.g12g4.backend.taskhome;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import co.edu.utp.misiontic.g12g4.backend.taskhome.model.entity.User;
import co.edu.utp.misiontic.g12g4.backend.taskhome.model.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Data;

@SpringBootApplication
public class TaskHomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskHomeApplication.class, args);
	}

	@Component
	@Data
	@AllArgsConstructor
	public static class DataLoader implements CommandLineRunner {

		private final UserRepository userRepository;

		@Override
		public void run(String... args) throws Exception {
			// loadUsers();
			// loadCategories();
			// loadMovies1();
		}

		private void loadUsers() {
			userRepository.save(new User("admin", "admin123", "Administrator",
					"admin@prueba.com", true, true));
		}


	}
	
}
