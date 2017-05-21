package prClasesGenericas;

public class Programa {
	/*
	 	es importante reconocer qu� es lo que pasa en esta situaci�n
	 	el m�todo copiaPrimero recibe dos parametros del tipo Par. 
	 	El tipo Par tiene dos variables e instancia, primero, y segundo
	 	
	 	
	 	El programa, combierte el primer elemento de b en el primer elemento de a.
	 */
	
	static public <T> void copiaPrimero(Par<T> a, Par<T> b){
		
		b.primero(a.primero());
	}


}

