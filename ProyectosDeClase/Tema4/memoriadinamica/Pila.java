package memoriadinamica;

public class Pila {

	 class Nodo{
		 int info;
		 Nodo sig;	 
	 }

	 Nodo raiz;

		public Pila() {
			raiz=null;
		}


	void insertar(int dato){
		Nodo nuevo=new Nodo();
		nuevo.info=dato;
		nuevo.sig=raiz;
		raiz=nuevo;
	}
		void visualizar(){
			while(raiz!=null){
				System.out.println(raiz.info);
				raiz=raiz.sig;
			}
		}
		public static void main(String[] args) {
			
	    Pila pila1=new Pila();
	    pila1.insertar(10);
	    pila1.insertar(20);
	    pila1.insertar(50);
	    pila1.visualizar();
		}

	}
