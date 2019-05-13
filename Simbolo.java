class Simbolo{
	//Declaraci�n de Variables
	String id = "";
	String tipo = "";
	String direc = "";
	String lon = "";
	String valor = "";
	//Constructor que permite guardar la informaci�n recibida del elemento, en un nuevo objeto. 
	public Simbolo(String id, String tipo, String direc, String lon, String valor){
	//Se agrega la informaci�n recibida al objeto. 
		this.id = id;
		this.tipo = tipo;
		this.direc = direc;
		this.lon = lon;
		this.valor = valor;
	}
}