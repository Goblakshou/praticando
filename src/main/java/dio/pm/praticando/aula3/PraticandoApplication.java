package main.java.dio.pm.praticando.aula3;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class PraticandoApplication {

	public static void main(String[] args) {

		List<User> users = List.of(new User("Pedro", 21), new User("Caio", 28),
								   new User("Flavio", 22), new User("Bárbara", 26));
		printStringValue(User::name, users);

	}

	private static void printStringValue(Function<User, String> callback, List<User> users){
		users.forEach(u -> System.out.println(callback.apply(u)));
	}

}
