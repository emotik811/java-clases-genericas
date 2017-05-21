package prClasesGenericas;

public class Programa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PRUEBAS BÁSICAS
		Par<String> a= new Par<String>("que os jodan", "putazos");
		Par<Integer> b = new Par<Integer>(4,0);
			System.out.println(b.segundo());
			System.out.println(a.primero());
			b.segundo(894873);
			System.out.println(b.segundo());
		
		//PRUEBAS HERENCIAS
		ParPeso<String> parp = new ParPeso<>("hola", 112,"adios",56);
		System.out.println(parp.segundo());
		
		//PRUEBAS RESTRICIONES
		ParNumerico<Integer> q = new ParNumerico<>(10, 15);
		System.out.println(q.segundo());
		
		//PRUEBAS MÚLTIPLES PARÁMETROS
		Pareja<Double,String> g = new Pareja<>(57.33,"ho");
		System.out.println(g.primero());
		System.out.println(g.segundo());
		
		//PRUEBA MÉTODO
		Programa.copiaPrimero(b, q);
		System.out.println(q.primero()+" "+q.segundo());
		


	}

}
