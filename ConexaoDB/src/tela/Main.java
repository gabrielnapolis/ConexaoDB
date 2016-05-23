package tela;

import java.util.Scanner;

public class Main {

	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		

		do{
		int opcao = 0;
		System.out.println("----------------------------------------");
		System.out.println(" Digite a opcao desejada: ");
		System.out.println("    1 - Incluir Medico");
		System.out.println("    2 - Alterar");
		System.out.println("    3 - Excluir");
		System.out.println("    4 - Listar");
		System.out.println("    5 - Consultar por especialidade");
		System.out.println("    0 - Sair");
		System.out.println("----------------------------------------");
		opcao = ler.nextInt();
		if(opcao ==0){
			break;
		}
		
		switch (opcao) {
		case 1:
			IncluirMedico();
		case 2:
			AlterarMedico();
		case 3:
			ExcluirMedico();
		case 4:
			ListarMedico();
		case 5:
			ConsultarMedico();
		}
		}while(true);
	}

	public static void IncluirMedico() {
		Funcoes p1 = new Funcoes();
		
		do {

			System.out.println("Digite o CRM do médico ou 0 para sair: ");
			p1.setCrm(ler.nextInt());
			if(p1.getCrm()==0){
				break;
			}
			System.out.println("Digite o nome do médico");
			p1.setNome(ler.next());
			System.out.println("Digite a especialidade do médico");
			p1.setEspecialidade(ler.next());
			
			
			p1.IncluirNoBanco();
			
		} while (true);
	}
	public static void AlterarMedico() {
		Funcoes p2 = new Funcoes();
		
		do {
			
			System.out.println("Digite o CRM do Médico que deseja fazer alterações: ");
			p2.setCrm(ler.nextInt());
			
		} while(true);
		
		
	}

	public static void ExcluirMedico() {

	}

	public static void ListarMedico() {
		Funcoes p4 = new Funcoes();
		
		p4.Listar();
	}

	public static void ConsultarMedico() {

	}
}
