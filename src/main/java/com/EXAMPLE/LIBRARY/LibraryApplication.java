package com.EXAMPLE.LIBRARY;

import com.EXAMPLE.LIBRARY.model.Book;
import com.EXAMPLE.LIBRARY.model.User;
import com.EXAMPLE.LIBRARY.repo.BookRepo;
import com.EXAMPLE.LIBRARY.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private BookRepo bookRepo;


	@Override
	public void run(String... args) throws Exception {

        Book book = new Book();
		book.setAuthor("Rad");
		book.setTitle("Ran");
		bookRepo.save(book);

		User user = new User();
		user.setFirstName("Kate");
		user.setLastName("Wayne");
		user.setEmail("Kate@gmail.com");
		user.setPassword("learn");
		userRepo.save(user);

		User user1 = new User();
		user1.setFirstName("Lira");
		user1.setLastName("Wynn");
		user1.setEmail("Lira@gmail.com");
		user1.setPassword("Code");
		userRepo.save(user1);

		User user2 = new User();
		user2.setFirstName("Jake");
		user2.setLastName("Wilson");
		user2.setEmail("Jake@gmail.com");
		user2.setPassword("Slow");
		userRepo.save(user2);

	}

}
