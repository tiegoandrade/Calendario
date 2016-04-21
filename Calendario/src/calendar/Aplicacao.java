package calendar;

public class Aplicacao {

	public static void main(String[] args) {
		

		Data d1 = new Data(21, 04, 2016, 10, 30, 10);
		d1.imprimir(1);
		d1.imprimir(2);

		Data d2 = new Data(25, 06, 2016, 23, 15, 20);
		d2.imprimir(1);
		d2.imprimir(2);
	
		Data d3 = new Data(5, 10, 2005);
		d3.imprimir(1);
		
	}

}
