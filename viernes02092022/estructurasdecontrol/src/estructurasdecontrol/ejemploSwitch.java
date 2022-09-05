package estructurasdecontrol;

import java.util.Scanner;
public class ejemploSwitch {
    
	public static void main(String[]aregs) {
	 Scanner lec = new Scanner(System.in);	
		
		
	int entrada,base,exponente;
	double a,b,c,d,resultado,numero,raiz;
	
	System.out.println("welcome calculadora estandar");
	System.out.print("Que caso desea realizar");
	System.out.print("1.sumar/2.restar/3.multiplicar/4.dividir/5.re"
			+ "siduo/6.potencia/7.raizcuadrada/8.inversomultiplicativo:");
	 entrada =lec.nextInt();
	 switch(entrada) {
	 case 1:
		 System.out.println("Escriba num1");
		 a=lec.nextInt();
		 System.out.println("Escriba el num2");
		 b=lec.nextInt();
		 System.out.println("la suma de "+a+" y "+b+"es"+(a+b));
		 break;
	 case 2:
		 System.out.println("Escriba num1");
		 a=lec.nextInt();
		 System.out.println("Escriba el num2");
		 b=lec.nextInt();
		 System.out.println("la resta es de "+a+" menos "+b+" es "+(a-b)); 
		 break;
	 case 3:
		 System.out.println("Escriba num1");
		 a=lec.nextInt();
		 System.out.println("Escriba el num2");
		 b=lec.nextInt();
		 System.out.println("El producto de "+a+" y "+b+" es "+(a*b)); 
		 break;
	 case 4:
		 System.out.println("Escriba num1");
		 a=lec.nextInt();
		 System.out.println("Escriba el num2");
		 b=lec.nextInt();
		 if (b==0) {
		  System.out.println("la division entre 0 no esta permitida");
		 }else {
			 System.out.println("La division es de "+a+" y "+b+" es "+(a/b));  
		 }
		 break;
	 case 5:
		 System.out.println("Escriba num1");
		 a=lec.nextInt();
		 System.out.println("Escriba el num2");
		 b=lec.nextInt();
		 System.out.println("El residuo de "+a+" y "+b+" es "+(a%b)); 
		 break;
	 
	 case 6:
		 System.out.println("Ingrese la base");
		 base=lec.nextInt();
		 System.out.println("Ingrese el exponente");
		 exponente=lec.nextInt();
		 System.out.println("El resultado de una base elevado a una potencia es:"+Math.pow(base,exponente)); 
		 break;
	
         case 7:
		 System.out.println("Digite un numero para obtener la raiz Cuadrada");
		 numero=lec.nextIDouble();
		 raiz=Math.sqrt(numero);
		 System.out.println("La raiz cuadrada del numero es: +"+numero+" es "+raiz); 
		 break; 
	 
         case 8:
                 System.out.println("Escriba num1");
		 a=lec.nextInt();
		 System.out.println("Escriba el num2");
		 b=lec.nextInt();

                 System.out.println("Ingrese denominador1");
		 c=lec.nextInt();
		 System.out.println("Ingrese denominador2");
		 d=lec.nextInt();
		 if (c==0) {
		  System.out.println("la division entre 0 no esta permitida");
		 }else {
                 System.out.println("El inverso multiplicativo de: "+ (c/d)); 
                 break; 
	 
	 }

	case 9:
	    	   System.out.println("El PROGRAMA HA FINALIZADO");	
	    	   salida=lec.nextLine();
	
	}
}
