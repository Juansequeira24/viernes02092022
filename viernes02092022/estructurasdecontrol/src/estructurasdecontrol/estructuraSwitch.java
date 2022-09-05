package estructurasdecontrol;

import java.util.Scanner; 
public class estructuraSwitch {

	public static void main(String[] args) {
	  //estructuras condicionales
	  //estructura condicional simple(if)
	  //estructura condicional doble (if else)
	  //estructura condicional anidada(multiple - if else if)
	  //para hoy - estructura condicional multiple(switch)
		
		Scanner lector = new Scanner(System.in);
		
		int op=2;
		System.out.println("ingrese el color del semaforo");
		char car = lector.next().charAt(0);
		
		
		switch (car) {
		
		
		case 'a' & 'A':
			System.out.println("el valor es amarillo");
			break;
		
		case 'v' & 'V':
		    System.out.println("el valor es verde");
		    break;
		
		case 'r' & 'R':
		    System.out.println("el valor es rojo");
		    break;
		 default:
			 System.out.println("caracter incorrecto.");
		}
        System.out.println("fin del programa.");
	}

}
