package t2;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;

public class Goleiro {
	private Botao corpo;
	private Botao mãoDireita;
	private Botao mãoEsquerda;
	
	
	
	
	
	public Botao MaoDireita(Botao matriz[][],Botao referenciaCorpo,int colunaDoCorpo) {
		int linha,coluna;
		linha=sortear(0,8);
		coluna=sortear(0,16);
		if(matriz[linha][coluna]==referenciaCorpo ) {
			matriz[linha][coluna]=matriz[sortear(0,8)][sortear(0,16)];
		}
		else if(coluna<=colunaDoCorpo) {
			do {
				coluna=sortear(0,16);
			
		}while(coluna<=colunaDoCorpo);

		}
		
		return matriz[linha][coluna];
		
	}
	public ArrayList AreaDeAtuacao(Botao matriz[][],Botao Maoesquerda,Botao Maodireita) {
		int LinhaDireita=Linha(matriz,Maodireita);
		int LinhaEsquerda=Linha(matriz,Maoesquerda);
		int ColunaEsquerda=Coluna(matriz,Maoesquerda);
		int ColunaDireita=Coluna(matriz,Maodireita);
		ArrayList<Botao>area=new ArrayList<Botao>();
		
		if(LinhaDireita<LinhaEsquerda) {
			for(int i=LinhaDireita;i<=LinhaEsquerda;i++) {
				for(int j=ColunaEsquerda;j<=ColunaDireita;j++) {
					area.add(matriz[i][j]);
				}
			}
		}
		if(LinhaEsquerda<LinhaDireita) {
			for(int i=LinhaEsquerda;i<=LinhaDireita;i++) {
				for(int j=ColunaEsquerda;j<=ColunaDireita;j++) {
					area.add(matriz[i][j]);
				}
			}
		}
		if(LinhaEsquerda==LinhaDireita) {
			for(int i=LinhaEsquerda;i<=LinhaDireita;i++) {
				for(int j=ColunaEsquerda;j<=ColunaDireita;j++) {
					area.add(matriz[i][j]);
				}
			}
		}
		return area;
	}
			
		
	
		
	

	public void MostraArea(ArrayList<Botao>lista,Botao matriz[][]) {
		for(Botao b:lista) {
			for(int i=0;i<9;i++) {
				for(int j=0;j<=16;j++) {
					if(matriz[i][j]==b) {
						b.setBackground(Color.RED);
					}
				}
			}
		}
	}
	
	public Botao MaoEsquerda(Botao matriz[][],Botao referenciaCorpo,int colunaDoCorpo) {
		int linha,coluna;
		linha=sortear(0,8);
		coluna=sortear(0,16);
		if(matriz[linha][coluna]==referenciaCorpo) {
			matriz[linha][coluna]=matriz[sortear(0,8)][sortear(0,16)];
		}
		else if(coluna>=colunaDoCorpo) {
			do {
				coluna=sortear(0,16);
			
		}while(coluna>=colunaDoCorpo);
		}
		return matriz[linha][coluna];
	}
	public int Defesa(ImageIcon imagem,ArrayList<Botao>lista) {
		int soma=0;
		for(Botao b:lista) {
			if(b.getIcon()==imagem) {
				soma++;
			}
		}
		return soma;
	}
	
	
	
	
	public Botao getCorpo() {
		return corpo;
	}
	public void setCorpo(Botao corpo) {
		this.corpo = corpo;
	}
	public Botao getMãoDireita() {
		return mãoDireita;
	}
	public void setMãoDireita(Botao mãoDireita) {
		this.mãoDireita = mãoDireita;
	}
	public Botao getMãoEsquerda() {
		return mãoEsquerda;
	}
	public void setMãoEsquerda(Botao mãoEsquerda) {
		this.mãoEsquerda = mãoEsquerda;
	}
	public int sortear(int minimo, int maximo) {
        Random random = new Random();
        return random.nextInt((maximo - minimo) + 1) + minimo;
    } 
	public int Coluna(Botao matriz[][],Botao referencia) {
		int coluna=0;
		for(int i=0;i<9;i++) {
			for(int j=0;j<17;j++) {
				if(matriz[i][j]==referencia) {
					coluna=j;
				}
			}
		}
		return coluna;
	}
	public int Linha(Botao matriz[][],Botao referencia) {
		int linha=0;
		for(int i=0;i<9;i++) {
			for(int j=0;j<17;j++) {
				if(matriz[i][j]==referencia) {
					linha=i;
				}
			}
		}
	
		return linha;
	}
	



}
