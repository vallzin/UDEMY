package EstruturaRepeticao;

import java.util.Scanner;

public class UrnaEleicao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String candidato1, candidato2, candidato3;
		
		int votos1 = 0; 
		int votos2 = 0;
		int votos3 = 0;
		
		int votacao, totalVotos, maiorVotacao;
		
		totalVotos = 0;
		
		System.out.println("Nome do candidato 1:");
		candidato1 = sc.nextLine();
		
		System.out.println("Nome do candidato 2:");
		candidato2 = sc.nextLine();
		
		System.out.println("Nome do candidato 3:");
		candidato3 = sc.nextLine();
		
		do {
			
			System.out.println("Digite o número do candidato");
			votacao = sc.nextInt();
			
			switch(votacao) {
			
			case 1:{
				votos1++;
				totalVotos++;
				break;
			}
			case 2:{
				votos2++;
				totalVotos++;
				break;
			}
			case 3:{
				votos3++;
				totalVotos++;
				break;
			}
			default:
				if(votacao != 0)
					System.out.println("Voto inválido");
				break;
			}
			
		}while(votacao != 0);
		
		System.out.println(candidato1 + " - "+votos1+" votos");
		System.out.println(candidato2 + " - "+votos2+" votos");
		System.out.println(candidato3 + " - "+votos3+" votos");
		System.out.println("Total de votos: "+totalVotos);
		
		maiorVotacao = votos1;
		
		if(votos2 > maiorVotacao) {
			maiorVotacao = votos2;
		}else if( votos3 > maiorVotacao) {
			maiorVotacao = votos3;
		}
		
		System.out.println("Candidato vencedor");
		if(votos1 == maiorVotacao) {
			System.out.println("Candidato 1 "+candidato1+" venceu a eleição com "+votos1);
		}else if(votos2 == maiorVotacao) {
			System.out.println("Candidato 2 "+candidato2+" venceu a eleição com "+votos2);
		}else if(votos3 == maiorVotacao) {
			System.out.println("Candidato 3 "+candidato3+" venceu a eleição com "+votos3);
		}
	}

}


