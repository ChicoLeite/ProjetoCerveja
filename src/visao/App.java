package visao;

import java.util.Scanner;

import modelo.FactoryMethodCerveja;
import modelo.Cerveja;

public class App {
	
	public static void main(String[] args) {
		
		FactoryMethodCerveja fabrica = new FactoryMethodCerveja();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bem vindo a cervejaria do J�lio!");
		System.out.println("Cerveja Cereja com Am�ndoa - [1]\nCerveja Lagger - [2]"+
				"\nCerveja com Laranja - [3] \nCerveja Pilsen - [4]"+
				"\nCerveja Puro Malte - [5] \nCerveja sem �lcool - [6]"+
				"\nCerveja de Trigo - [7]");
		System.out.println("Insira a op��o de cerveja a ser adquirida:");
		int opcao = scan.nextInt();
		scan.close();
		
		Cerveja pedido = fabrica.getCerveja(opcao);
		System.out.println();
		System.out.println("Sua cerveja est� pronta.");
		System.out.println(pedido.toString());
		
		
		
		
	}

}
