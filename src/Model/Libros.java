package Model;

public class Libros {
	//puede ser cual quier tipo de dato la llave del hashMap
	private String clave; 
	private String titulo;//este sera la llave del hasMap
	private int numPag;
	private String autor;
	public Libros() {
	}
	public Libros(String clave, String titulo, int numPag, String autor) {
		this.clave = clave;
		this.titulo = titulo;
		this.numPag = numPag;
		this.autor = autor;
	}
	@Override
	public String toString() {
		return "Lbros [clave=" + clave + ", titulo=" + titulo + ", numPag=" + numPag + ", autor=" + autor + "]\n";
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumPag() {
		return numPag;
	}
	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
}
