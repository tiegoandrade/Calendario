package calendar;

public class Data {
	public static final int FORMATO_12H = 1; //Indica se o formato de leitura da hora só vai até 12
	public static final int FORMATO_24H = 2; // indica se o formato da leitura da hora vai até 24
	
	//Atributos da classe
	private int dia; 
	private int mes; 
	private int ano; 
	private int hora = -1; 
	private int minuto = -1; 
	private int segundo = -1; 
	
	//1° Construtor que recebe como parâmetro o dia, o mês e o ano.
	public Data(int dia, int mes,int ano) { 
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	//2° Construtor que recebe os mesmo parâmetros do anterior mais a hora, o minuto e o segundo.
	public Data(int dia, int mes, int ano, int hora, int minuto, int segundo) { 
		this (dia,mes,ano);
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;	
		
	}
	
	//Método para mostrar o dias, o mês, o ano e as horas, minutos e segundos se forem informadas pelo usuário 
	public void imprimir (int formato){
		
		//String que armazenará o dia, o mês e o ano informados pelo usuário
		String data = dia + "/" + mes + "/" + ano; 
		
		//Caso não seja informado o horário, só é apresentado a data.
		if (hora == -1){
			System.out.println(data);
		
		} 
		
		/*Caso seja informado o horário, é então concatenado os minutos e os segundos, mas não o horário, 
		pois ainda é necessário identificar seu formato.*/
		else {
			String horario = ":" + minuto + ":" + segundo;
			
			// Caso seja informado o formato de 24h, a hora é concatenada com o horário sem fazer nenhuma alteração.
			if (formato == FORMATO_24H){
				horario = hora + horario;
			} 
			
			// Caso o formato de 12h seja escolhido, é feito algumas alterações.
			else {
				
				// Se a hora for maior ou igual a 12, subtraia e concatene o "PM" no final.
				if (hora >= 12){
					horario = (hora - 12) + horario;
					horario = horario + "PM";
				} 
				
				//Se a hora for menor que 12, é so concaternar a hora com o horário e concatenar o "AM".	
				else {
					horario = hora + horario;
					horario = horario + "AM";
				}
			}
			
			//Imprime a data e a hora formatada
			System.out.println(data + " " + horario);
		}
	}
    
	//Métodos Getters para acessar os atributos privados.
	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public int getSegundo() {
		return segundo;
	}
}
