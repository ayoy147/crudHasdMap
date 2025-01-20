package Main;

import java.util.Scanner;

import Implementacion.LogicaMetodos;
import Model.Libros;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declarar las variables

		Scanner lectura = null;
		String clave;
		String titulo;// este sera la llave del hasMap
		int numPag;
		String autor;

		Libros libro;

		int menuPrincipal, subMenu;

		LogicaMetodos imp = new LogicaMetodos();
		
		String c = "hola";
		
		System.out.println("HOLA MUNDO GITHUB");
		lectura =  new Scanner(System.in);
		c = lectura.nextLine();
		System.out.println("Hola :"+ c);
		
		do {
			System.out.println("MENU PRINCIPA");
			System.out.println("1--ALTA");
			System.out.println("2--MOSTRAR");
			System.out.println("3--BUSCAR");
			System.out.println("4--EDITAR");
			System.out.println("5--ELIMINAR");
			System.out.println("6--SALIR");

			lectura = new Scanner(System.in);
			menuPrincipal = lectura.nextInt();

			switch (menuPrincipal) {
			case 1:
				System.out.println("INGRESA LOS DATOS DEL LIBRO");
				System.out.println("Clave");
				lectura = new Scanner(System.in);
				clave = lectura.nextLine();

				System.out.println("Titulo");
				lectura = new Scanner(System.in);
				titulo = lectura.nextLine();

				System.out.println("Numero de paginas");
				lectura = new Scanner(System.in);
				numPag = lectura.nextInt();

				System.out.println("Autor");
				lectura = new Scanner(System.in);
				autor = lectura.nextLine();

				// crear el objeto
				libro = new Libros(clave, titulo, numPag, autor);

				// guarddar en con el metodo
				imp.guardar(libro);

				break;

			case 2:
				imp.mostar();
				break;
			case 3:

				System.out.println("Ingresa la clave");
				lectura = new Scanner(System.in);
				clave = lectura.nextLine();
				// buscar
				libro = imp.buscar(clave);
				System.out.println("Se encontro" + libro);

				break;

			case 4:

				System.out.println("Ingresa la clave a editar");
				lectura = new Scanner(System.in);
				clave = lectura.nextLine();
				// buscar
				libro = imp.buscar(clave);
				System.out.println("Se encontro" + libro);

				do {
					System.out.println("SUB MENU");
					System.out.println("1--Titulo");
					System.out.println("2--Numero de paginas");
					System.out.println("3--Salir");
					lectura = new Scanner(System.in);
					subMenu = lectura.nextInt();
					
					switch (subMenu) {
					case 1:
						
						System.out.println("Ingrese el nuevo titulo");
						lectura = new Scanner(System.in);
						titulo = lectura.nextLine();
						
						//Actualizacion 
						libro.setTitulo(titulo);
						imp.editar(libro);
						System.out.println("se edito con exito");
						break;
					case 2:
						
						System.out.println("ingresa el numero de paginas nuevo");
						lectura = new Scanner(System.in);
						numPag = lectura.nextInt();
						
						libro.setNumPag(numPag);
						imp.editar(libro);
						System.out.println("Se edito con exito");
						
						break;

					}
				
	
					
				} while (subMenu < 3);

				break;

			case 5:
				System.out.println("Ingresa la clave a eliminar");
				lectura = new Scanner(System.in);
				clave = lectura.nextLine();
				imp.eliminar(clave);
				System.out.println("Se elimino");

				break;
			case 6:

				break;
			}
		} while (menuPrincipal < 6);

	}

}
