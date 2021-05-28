package clase;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// Variables
		double num1;
		double num2;
		double resultado = 0;
		int opcion;
		boolean salir;
		//Hay condiciones y repeticiones?
		do {
			//Imprimimos el pantalla el menu
			System.out.println("operaciones");
			System.out.println("1-suma");
			System.out.println("2-resta");
			System.out.println("3-multiplicacion");
			System.out.println("4-division");
			System.out.println("Salir de la aplicación");
			//Itntroducimos la opción y la validamos
			Scanner entrada = new Scanner(System.in);
			boolean opcionValida;
			do {
				//Introduccion de la opción
				opcion = entrada.nextInt();
				//Comprobamos si es válida
				opcionValida = (opcion >= 1 && opcion <= 5);
				if (!opcionValida)
					System.out.println("Error: teclea una opción entre 1 y 5");
			}while(!opcionValida);
			//Comprobamos si ha comprobado la opcion para salir
			salir = (opcion == 5);
			if(!salir) {
				//pedimos los numeros por teclado
				System.out.println("Introduce el num 1: ");
				num1 = entrada.nextDouble();
				System.out.println("Introduce el num 2: ");
				num2 = entrada.nextDouble();
				while (opcion == 4 && num2 == 0) {
						System.out.println("El segundo numero no puede ser 0");
						num2 = entrada.nextInt();
				//Comprobamos la operacion que tenemos que realizar
				switch(opcion) 
				{
				case 1:
					resultado = num1 + num2;
					break;
				case 2:
					resultado = num1 - num2;
					break;
				case 3:
					resultado = num1 * num2;
					break;
				case 4:
					// si el divisor es 0 sacamos un mensaje de error
					//en caso contrario hacemos la division
					if(num2 != 0 )
						resultado = num1 / num2;
					break;
				}//fin switch
				System.out.println("El resultado es = " +resultado);
				//Imprimimos en pantalla el resultado


			}//Fin del IF
				
		}while (!salir);
		}
	}

	
	



