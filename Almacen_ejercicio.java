import java.util.Scanner;

public class Almacen_ejercicio {

	public static void main(String[] args) {
		
		int existencias = 3200;
		int en;//<>
		System.out.println("El n�mero actual de existencias disponibles son 3200");

		
		while (existencias >= 100) {
			
			Scanner sc = new Scanner (System.in);
			System.out.println("Introduce n�mero a entregar: ");
			en=sc.nextInt();
			
			existencias=existencias-en;
			
			System.out.println("Existencias restantes = " +existencias);
			
			if (existencias <=100) {
			
			System.out.println("Se ha alcanzado el l�mite de existencias disponibles");
				
			}
			
			
			
		}

	}

}
