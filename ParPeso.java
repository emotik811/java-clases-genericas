package prClasesGenericas;

//implementación de herencia
public class ParPeso <T> extends Par<T> {
	
	//añadimos otras dos variables
	int pesoPrimero;
	int pesoSegundo;
	
	public ParPeso (T p,int pp, T s, int ps){
		
		super(p, s);
		pesoPrimero = pp;
		pesoSegundo = ps;
		
	}

}
