package Implementacion;

import java.util.HashMap;

import Interface.Metodos;
import Model.Libros;

public class LogicaMetodos implements Metodos {
	//Los tipos de datos primitivos hat que parcearlos Por lo general todos van con mayuscula e int cambia a Integer
	HashMap<String, Libros> registros = new HashMap<String, Libros>();
	
	@Override
	public void guardar(Libros libro) {
		// TODO Auto-generated method stub
		registros.put(libro.getClave(), libro);//con hashMap para guardar se usa con "put y se le pasa la clave"
	}

	@Override
	public void mostar() {
		// TODO Auto-generated method stub
		System.out.println(registros);
	}

	@Override
	public Libros buscar(String titulo) {
		// TODO Auto-generated method stub
		return registros.get(titulo);
	}

	@Override
	public void editar(Libros libro) {
		// TODO Auto-generated method stub
		registros.put(libro.getClave(), libro);
	}

	@Override
	public void eliminar(String titulo) {
		// TODO Auto-generated method stub
		registros.remove(titulo);
	}
	
}
