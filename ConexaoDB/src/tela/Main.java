package tela;

import java.util.Scanner;

public class Main {

	private static Scanner leia;
	private static Scanner ler;

	public static void main(String[] args) {
		ler = new Scanner(System.in);

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
	}

	public static void IncluirMedico() {
		leia = new Scanner(System.in);
		Incluir p1 = new Incluir();
		
		System.out.println("Digite o CRM do médico: ");
		p1.setCrm(leia.nextInt());
		System.out.println("Digite o nome do médico");
		p1.setNome(leia.next());
		System.out.println("Digite a especialidade do médico");
		p1.setEspecialidade(leia.next());
		
		//INCLUIR NO BANCO DE DADOS
	}
	
	public static void AlterarMedico() {
		
	}	

	public static void ExcluirMedico(){
		
	}

	public static void ListarMedico(){
		
	}
	
	public static void ConsultarMedico(){
		
	}
}
