//package prova;
//
//import java.util.*;
//
//public class corrida {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		Integer segmentos = scan.nextInt();
//		Integer tamanhoNorte = 2;
//		Integer tamanhoLeste = 2;
//		
//		for(int cont = 0; cont<segmentos; cont++) {
//			Integer tamanho = scan.nextInt();
//			char direcao = scan.next().charAt(0);
//			
//			if(direcao == 'N') {
//				tamanhoNorte+=tamanho;
//			}
//			if(direcao == 'L') {
//				tamanhoLeste+=tamanho;
//			}
//		}
//		
//		Integer tamanhoTotal = (tamanhoLeste*2)+(tamanhoNorte*2);
//		System.out.println(tamanhoTotal);
//	}
//}
