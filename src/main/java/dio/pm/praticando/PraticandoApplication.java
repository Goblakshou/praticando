package dio.pm.praticando;

import java.time.LocalDateTime;

import dio.pm.praticando.domain.Employee;
import dio.pm.praticando.domain.Manager;
import dio.pm.praticando.domain.Salesman;

public class PraticandoApplication {

	public static void main(String[] args) {
	
		Employee manager = new Manager("456", "Pedro", "Itupeva", 5000.00, LocalDateTime.now());
		Employee salesman =  new Salesman("123", "Cleber", "Jundiai", 2800.00, LocalDateTime.now());

		printEmployee(manager);
		printEmployee(salesman);

	}

	private static void printEmployee(Employee employee){

		switch (employee) {
			case Manager manager -> {

				manager.setLogin("pedro");
				manager.setPassword("ordep");
				manager.setComission(10);

				System.out.printf("=====%s=====\n", manager.getClass().getSimpleName());
				System.out.println(manager.getAddress());
				System.out.println(manager.getBirth());
				System.out.println(manager.getCode());
				System.out.println(manager.getLogin());
				System.out.println(manager.getName());
				System.out.println(manager.getPassword());
				System.out.println(manager.getSalary());
				System.out.println("==========");
				
			}
			case Salesman salesman -> {
				
				salesman.setPercentualPerSold(10);
				salesman.setSoldAmount(200.00);
				
				System.out.printf("=====%s=====\n", salesman.getClass().getSimpleName());
				System.out.println(salesman.getAddress());
				System.out.println(salesman.getBirth());
				System.out.println(salesman.getCode());
				System.out.println(salesman.getPercentualPerSold());
				System.out.println(salesman.getName());
				System.out.println(salesman.getSalary());
				System.out.println("==========");

			}
		}

		System.out.println(employee.getFullSalary());
	}

}
