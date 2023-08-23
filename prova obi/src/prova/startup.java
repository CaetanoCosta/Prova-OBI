package prova;

import java.util.*;

public class startup {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Integer quantidadeFuncionarios = scan.nextInt();
		Integer[][] funcionarios = new Integer[3][quantidadeFuncionarios];
		Integer insatisfeito=0;
		
		for(int cont=0; cont<quantidadeFuncionarios; cont++) {
			Integer chefe = scan.nextInt();
			Integer salarioFuncionario = scan.nextInt();
			
			funcionarios[0][cont] = cont+2;
			funcionarios[1][cont] = salarioFuncionario;
			//if(chefe!=1) {
			funcionarios[2][cont] = chefe;
			//}else
			//funcionarios[2][cont] = 0;
		}
		
		for(int contador=0; contador<quantidadeFuncionarios; contador++) {
			for(int i=0; i<quantidadeFuncionarios; i++) {
				if(funcionarios[0][contador] == funcionarios[2][i]) {
					if(funcionarios[1][contador] < funcionarios[1][i]) {
						insatisfeito++;
						System.out.println(insatisfeito);
					}
				}
			}
		}
		
		Integer quantidadeAtualizacao=scan.nextInt();
		
		for(int c=0; c<quantidadeAtualizacao; c++) {
			Integer funcionario=scan.nextInt();
			Integer novoSalario=scan.nextInt();
			
			for(int x=0; x<quantidadeFuncionarios; x++) {
				if(funcionarios[0][x] == funcionario+1) {
					funcionarios[1][x] = novoSalario;
					
					for(int y=0; y<quantidadeFuncionarios; y++) {
						if(funcionarios[2][y] == funcionarios[0][y-1]) {
							if(funcionarios[1][y] < funcionarios[1][y-1]) {
								insatisfeito++;
								System.out.println(insatisfeito);
							}
							if(funcionarios[1][y] >= funcionarios[1][y-1]) {
								insatisfeito--;
								System.out.println(insatisfeito);
							}
						}
					}
				}
			}
		}
	}
}
