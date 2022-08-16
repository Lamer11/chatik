package chatik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatikApplication {

	public static void main(String[] args) {
		System.out.println("Запускаем...");
		SpringApplication.run(ChatikApplication.class, args);
		
		System.out.println("Запущено...");
	}

}
