package com.ToDo.todolist;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootApplication
public class TodoListApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoListApplication.class, args);

		String url = "jdbc:postgresql://localhost:5432/todo_base";
		String user = "";
		String pass = "";
		try {
			Connection connection = DriverManager.getConnection(url, user, pass);

			connection.close();
		} catch (
				Exception ex) {
			ex.printStackTrace();
		}
	}
}


