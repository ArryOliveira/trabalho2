package t2;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelJogador extends JPanel {
	private JLabel nome=new JLabel();
	private JLabel pontos=new JLabel();
	private JLabel pontosJogador=new JLabel();
	public PainelJogador() {
		setLayout(new GridLayout(4,2));
		JLabel organizador1=new JLabel();
		JLabel organizador4=new JLabel();
		organizador1.setFont(new Font("arial black", Font.BOLD,20));
		organizador1.setText("[Dados do Jogador]");
		JLabel organizador2=new JLabel();
		organizador2.setFont(new Font("arial black", Font.BOLD,20));
		organizador2.setText("Nome:");
		organizador2.setForeground(Color.MAGENTA);
		JLabel organizador3=new JLabel();
		organizador3.setFont(new Font("arial black", Font.BOLD,20));
		organizador3.setForeground(Color.MAGENTA);
		organizador3.setText("Pontuação do adversário:");
		JLabel organizador5=new JLabel();
		organizador5.setFont(new Font("arial black", Font.BOLD,20));
		organizador5.setForeground(Color.MAGENTA);
		organizador5.setText("pontuação do jogador:");
		pontos.setFont(new Font("arial black", Font.BOLD,20));
		pontosJogador.setFont(new Font("arial black", Font.BOLD,20));
		add(organizador1);
		add(nome);
		add(organizador3);
		add(pontos);
		add(organizador5);
		add(pontosJogador);
		
		
		
		
		
	
		
		
	}

	public JLabel getPontosJogador() {
		return pontosJogador;
	}

	public void setPontosJogador(JLabel pontosJogador) {
		this.pontosJogador = pontosJogador;
	}

	public JLabel getNome() {
		return nome;
	}

	public void setNome(JLabel nome) {
		this.nome = nome;
	}

	public JLabel getPontos() {
		return pontos;
	}

	public void setPontos(JLabel pontos) {
		this.pontos = pontos;
	}
	
}
