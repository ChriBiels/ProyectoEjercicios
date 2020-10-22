import java.util.Scanner;

public class Almacen_ejercicio {

	public static void main(String[] args) {
		
		int existencias = 3200;
		int en;//<>
		System.out.println("El número actual de existencias disponibles son 3200");

		
		while (existencias >= 100) {
			
			Scanner sc = new Scanner (System.in);
			System.out.println("Introduce número a entregar: ");
			en=sc.nextInt();
			
			existencias=existencias-en;
			
			System.out.println("Existencias restantes = " +existencias);
			
			if (existencias <=100) {
			
			System.out.println("Se ha alcanzado el límite de existencias disponibles");
				
			}
			
			
			
		}

	}

}
