package prClasesGenericas;

public class Pareja <A,B> {
	
	private A primero;
	private B segundo;
	
	public Pareja(A a, B b) {primero = a; segundo = b;}
	
	public A primero() {return primero;}
	public B segundo() {return segundo;}
	
	public void primero(A a) {primero = a;}
	public void segundo (B b) {segundo = b;}
	
	static public String aCadena(Pareja<?,?> par){
		
		return par.primero() + " , "+par.segundo();
	}
	
	
}
