import java.util.Scanner;

/**
 * 
 */

/**
 * @author vijaykumbhar
 *
 */
public class ArrayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a[] = new int[3];
		int aa, bb, cc;
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;

		for (int i : a) {
			System.out.println(i);
		}
		Employee emparray[] = new Employee[2];
		System.out.println(emparray.length);
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < emparray.length; i++) {
			System.out.println("Enter " + i + 1 + "Details ");
			System.out.println("Enter ID for " + i + 1);
			Employee employee = new Employee();
			employee.setId(scanner.nextInt());
			System.out.println("Ener Name ");
			employee.setName(scanner.next());
			emparray[i] = employee;
		}

		System.out.println("############################");
		for (int i = 0; i < emparray.length; i++) {

			Employee em = emparray[i];
			System.out.println("Enter " + i + 1 + "Details ");

			System.out.println("Data  ID for " + em.getId());
			System.out.println("Data  NAME  for " + em.getName());
		}

	}

}
