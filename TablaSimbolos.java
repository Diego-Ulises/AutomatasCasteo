import java.util.*;
public class TablaSimbolos{
	HashMap t;
	
	public TablaSimbolos(){
		t=new HashMap();
	}
	
	//M�todo que nos permite ingresar un nuevo elemento a la tabla de s�mbolos
	public Simbolo insertar (String id, String tipo, String direc, String lon, String valor){ //Se reciben los datos del registro
		Simbolo s=new Simbolo(id,tipo,direc,lon,valor); //Se crea un objeto que tendr� la informaci�n del nuevo elemento. 
		t.put(id,s);  //Ingreso del elemento a la tabla de s�mbolos, con su identificador y el objeto creado. 
		return s;
	}
	
	public void asignar(String id, String valor) { 
		Iterator it = t.values().iterator();
		while (it.hasNext()) {
			Simbolo s = (Simbolo) it.next();
			if(s.id.equals(id)){
				s.valor=valor;
				t.put(id, s);
				System.out.println(s.id + " -> " + s.tipo + " -> " + s.lon + "B Valor" + "-> " + s.valor);
				break;
			}
		}
	}
	
	public float getVal(String id) {
		Iterator it = t.values().iterator();
		while (it.hasNext()) {
			Simbolo s = (Simbolo) it.next();
			if (s.id.equals(id)) {
				return Float.parseFloat(s.valor);
			}
		}
		return Float.parseFloat(id);
	}
	//M�todo que permite la busqueda de un elemento. 
	public Simbolo buscar (String nombre){
		return (Simbolo)(t.get(nombre));
	}
	//M�todo que verifica la existencia de un elemento dentro de la Tabla de s�mbolos. 
	public boolean existe (String nombre){
		if(buscar(nombre)==null){ 
			return false;			//S� no encuentra el elemento buscado retorna falso.
		}
		return true;   // S� se encuentra el elemento buscado retorna verdadero. 
	}
	//M�todo que permite imprimir todos los elementos guardados en la tabla de S�mbolos. 
	public void imprimir(){
		Iterator it=t.values().iterator();
		System.out.println("Tabla de Simbolos:");
		while (it.hasNext()){	//Ciclo que permite recorrer la tabla de S�mbolos para extraer e imprimir los elementos. 
			Simbolo s=(Simbolo)it.next();
			System.out.println(s.id+ " -> " + s.tipo +" Valor"+ "-> "+ s.valor);
		}
	}
	
}