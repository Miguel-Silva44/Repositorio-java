package testes;

import java.util.Scanner;

public class ClasseTeste {
	 
	private static String conteudoDoNo(){
		Scanner scan = new Scanner(System.in);
		int vezes=0;
		vezes++;
		System.out.println("Digite o conteudo do no"+ vezes);
		String conteudoNo = scan.next();
		return conteudoNo; 
	}
	
	private static void chamarProximoNo(){
		
	}
	
	public static void main(String[] args) {
		 No no1 =new No(conteudoDoNo());
		 No no2 =new No(conteudoDoNo());
		 No no3 =new No(conteudoDoNo());
		 No no4 =new No(conteudoDoNo());
		 no1.setProximoNo(no2);
		 no2.setProximoNo(no3);
		 no3.setProximoNo(no4);
		 System.out.println(no1);
		 System.out.println(no1.getProximoNo());
		 System.out.println(no1.getProximoNo().getProximoNo());
		 System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
		 System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
		
	
	}

}
