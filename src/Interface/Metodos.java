package Interface;

import Model.Libros;

public interface Metodos {
	//
	public void guardar(Libros libro);

	public void mostar();

	public Libros buscar(String titulo);

	public void editar(Libros libro);

	public void eliminar(String titulo);

}
