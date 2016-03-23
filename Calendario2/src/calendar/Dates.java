package calendar;

import javax.swing.JOptionPane;

public class Dates {

	public static void main(String[] args) {
		
		//Entrada dos dados
		int dia = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um dia"));
		int mes = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um mês"));
		int ano = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um ano"));

		
		// Verifica se a data é válida
		if (ano < 1900 || ano > 2999 || mes < 1 || mes > 12){ 
			System.out.println("Data inválida");
		} 
			
		
		// Verificar se o mês de fevereiro tem 28 ou 29 dias e se os meses de Abril, Junho, Setembro e Novembro possuem 30 dias.
		else if ((dia <= 31) && (mes <= 12)){ 
				
			if (((dia > 28) && (mes == 2)) && (ano % 4 != 0) || ((dia == 31) && ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)))){    
				System.out.println("Data inválida");
			}
				
			else{
				System.out.println("Data válida");
			}
		} 
		
		else{
		System.out.println("Data inválida");
		}
	}
}


