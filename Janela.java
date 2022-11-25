package t2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.util.Objects;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Janela extends JFrame{
		public Janela() {
			setSize(600,600);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			organizar();
			setTitle("Foi para os penaltis");
			setVisible(true);
			
		}
		public void organizar() {
			NomeJogador nj=new NomeJogador();
			 setLayout(new BorderLayout());
			 PainelJogador j=new PainelJogador();
			 j.getNome().setText(nj.texto.getText());
			 Mapeamento x=new Mapeamento();
			 IniciarFinalizar i=new IniciarFinalizar(x,j);
			add(x,BorderLayout.NORTH);
			add(j,BorderLayout.CENTER);
			add(i,BorderLayout.SOUTH);
		}
		
	}
	
