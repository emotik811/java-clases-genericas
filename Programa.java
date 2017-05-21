package prClasesGenericas;

public class Programa {
	/*
	 	es importante reconocer qué es lo que pasa en esta situación
	 	el método copiaPrimero recibe dos parametros del tipo Par. 
	 	El tipo Par tiene dos variables e instancia, primero, y segundo
	 	
	 	
	 	El programa, combierte el primer elemento de b en el primer elemento de a.
	 */
	
	static public <T> void copiaPrimero(Par<T> a, Par<T> b){
		
		b.primero(a.primero());
	}


}

