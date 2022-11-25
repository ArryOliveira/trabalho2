package t2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Mapeamento extends JPanel  {
	public Botao b[][]=new Botao[9][17];
	private ArrayList<Botao> botoes=new ArrayList<Botao>();
	private String lugar[][]=new String[9][17];
	private ArrayList<Botao>lista=new ArrayList<Botao>();
	private ArrayList<Integer> pontuaçãoAdversario=new ArrayList<Integer>();
	private ArrayList<Integer> pontuaçãoJogador=new ArrayList<Integer>();
	
	public Mapeamento() {
		int i;
		int j;
		for( i=0;i<9;i++) {
			for( j=0;j<17;j++) {
				b[i][j]=new Botao();
				botoes.add(b[i][j]);
				
			}
		}
	
		for(Botao x : botoes) {
			x.addActionListener(new ActionListener() {			
				public void actionPerformed(ActionEvent e) {
					if(x.getIdentificador()==true) {
						Goleiro goleiro=new Goleiro();
						
						    ImageIcon ball=new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagem/salvei.png.png")));
						    ImageIcon body =new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagem/adversario.png")));
						    ImageIcon left =new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagem/MaoEsquerda.png")));
						    ImageIcon right =new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagem/MaoDireita.png")));
							x.setIcon(ball);
							int j=goleiro.sortear(2,15);
							goleiro.setCorpo(b[8][j]);
							goleiro.getCorpo().setIcon(body);
							goleiro.setMãoEsquerda(goleiro.MaoEsquerda(b, goleiro.getCorpo(),j));
							goleiro.getMãoEsquerda().setIcon(left);
							goleiro.setMãoDireita(goleiro.MaoDireita(b, goleiro.getCorpo(),j));
							goleiro.getMãoDireita().setIcon(right);
							goleiro.MostraArea(goleiro.AreaDeAtuacao(b, goleiro.getMãoEsquerda(), goleiro.getMãoDireita()), b);
							pontuaçãoAdversario.add(goleiro.Defesa(ball,goleiro.AreaDeAtuacao(b, goleiro.getMãoEsquerda(), goleiro.getMãoDireita())));
							if(goleiro.Defesa(ball, goleiro.AreaDeAtuacao(b, goleiro.getMãoEsquerda(), goleiro.getMãoDireita()))==0) {
							pontuaçãoJogador.add(1);
						
					}
						
				}}
			});
		}
		setLayout(new GridLayout(9,17));
		for(i=0;i<9;i++) {
			for( j=0;j<17;j++) {
				if(i==1 && j>=1 && j<=15 || i>=1 && i<=8 && j==1 || i>=1 && i<=8 && j==15) {
					b[i][j].setText("t");
					b[i][j].setBackground(Color.WHITE);
					lugar[i][j]="t";
					

					add(b[i][j]);
				
			}
				else if(i==0 && j>=0 && j<=16 || i>=1 && i<=8 && j==0 || i>=0 && i<=8 && j==16) {
					b[i][j].setText("f");
					b[i][j].setBackground(Color.GREEN);
					lugar[i][j]="f";
					ImageIcon grass=new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagem/grass.png")));
					b[i][j].setIcon(grass);
					add(b[i][j]);

				}
				
				else if(lugar[i][j]==null) {
					b[i][j].setText("d");
					lugar[i][j]="d";
					b[i][j].setBackground(Color.GRAY);
					add(b[i][j]);

				
			}
	
		}}
		
		}

	public Botao procuraBotao(Botao matriz[][],int i,int j) {
		return matriz[i][j];
		
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
					linha=j;
				}
			}
		}
		return linha;
	}
	
	public int Somatorio(ArrayList<Integer>lista) {
		int soma=0;
		for(Integer i:lista) {
			soma=soma+i;
		}
		return soma;
	}
	
	
	public ArrayList<Integer> getPontuaçãoJogador() {
		return pontuaçãoJogador;
	}
	public void setPontuaçãoJogador(ArrayList<Integer> pontuaçãoJogador) {
		this.pontuaçãoJogador = pontuaçãoJogador;
	}
	public ArrayList<Integer> getPontuaçãoAdversario() {
		return pontuaçãoAdversario;
	}
	public void setPontuaçãoAdversario(ArrayList<Integer> pontuação) {
		this.pontuaçãoAdversario = pontuação;
	}
	public String[][] getLugar() {
		return lugar;
	}
	public void setLugar(String[][] lugar) {
		this.lugar = lugar;
	}
	
	
	public ArrayList<Botao> getBotoes() {
		return botoes;
	}
	public void setBotoes(ArrayList<Botao> botoes) {
		this.botoes = botoes;
	}
	}
	

