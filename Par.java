package prClasesGenericas;

public class Par <T> {
	
	// CLASE QUE ALMACENE  DOS ELEMENTOS DE OTRA CLASE
	//NO ESPECIFICAMOS DE QUÉ CLASE SON LOS ELEMENTOS A ALMACENAR
	//SUPONEMOS QUE SON DE CLASE T: T = cualquier clase
		
	
	/* añadiento <T> a la cabecera, java detecta que representa a
	 cualquier clase.
	 */
	
	private T primero, segundo;
		public Par(T p, T s){
			
			primero = p;
			segundo = s;
		}
		
		public T primero()	{ return primero; }
		public T segundo()	{ return segundo; }
		
		public void primero(T p) { primero = p;}
		public void segundo(T p) { segundo = p;}
		
		//funcionará para cualquier clase o interfaz, nunca ti`pos básicos
		
		

		
}

