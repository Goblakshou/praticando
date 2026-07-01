package dio.pm.praticando;

import dio.pm.praticando.domain.FamilyPack;
import dio.pm.praticando.domain.HalfTicket;
import dio.pm.praticando.domain.Ticket;

public class PraticandoApplication {

	public static void main(String[] args) {

		Ticket halfTicket = new HalfTicket(17.10, "John and Mary", "Dubbed", 1);
		Ticket familyPack = new FamilyPack(30.50, "Avengers", "Subtitled", 5);

		System.out.println(halfTicket.printReceipt());
		System.out.println(familyPack.printReceipt());

	}

}
