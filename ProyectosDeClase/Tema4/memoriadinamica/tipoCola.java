package memoriadinamica;
public class tipoCola {
	
	class Nodo{
		String nombre;
		float nota;
		Nodo sig;		
	}
	Nodo raiz, ant;
	

	public tipoCola() {
		raiz=null; //a quien le toca
		ant=null;// quien es el ultimo de la lista
	}
void insertar(String nombre, float nota){
	Nodo nuevo=new Nodo();
	nuevo.nombre=nombre;
	nuevo.nota=nota;
	nuevo.sig=null;
	if(raiz==null){
		raiz=nuevo;
		ant=nuevo;
		
	}else{
		ant.sig=nuevo;
		ant=nuevo;
		
	}
}
	void visualizar(){
		Nodo wraiz=raiz;
	while(wraiz!=null){
		System.out.println("Nombre: "+wraiz.nombre+ " nota: "+wraiz.nota);
		wraiz=wraiz.sig;
		
	}
	}
	void extraer(){
		
	raiz=raiz.sig;
		
	}
	

	
	public static void main(String[] args) {
		tipoCola col1=new tipoCola();
		col1.insertar("Miren",10.0F);
		col1.insertar("Jon",2.5F);
		col1.insertar("Ane",3.5F);
		col1.insertar("Carmen",4.0F);
		col1.insertar("Pedro",5.0F);
		col1.visualizar();
		col1.extraer();
		System.out.println("despues de extraer Miren quedan 4");
		col1.visualizar();
		System.out.println("al insertar Luz quedan");
		col1.insertar("Luz",10F);
		col1.visualizar();
	}

}
