package t2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class IniciarFinalizar extends JPanel implements ActionListener {
	private static final ActionListener AçãoFinalizar = null;
	public JButton inicia=new JButton();
	public JButton limpar=new JButton();
	public JButton finalizar=new JButton();
	public Mapeamento m=new Mapeamento();
	public PainelJogador pj=new PainelJogador();
	

	public IniciarFinalizar(Mapeamento m,PainelJogador pj){
	this.m=m;
	this.pj=pj;
		setLayout(new GridLayout(1,3));
		
		inicia.setBackground(Color.BLUE);
		inicia.setForeground(Color.PINK);
		inicia.setPreferredSize(new Dimension(100,100));
		 inicia.setText("INICIAR");
		 inicia.setFont(new Font("arial black", Font.BOLD,12 ));
		 inicia.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
				
				for(Botao b : m.getBotoes())	{				
					b.setIdentificador(true);
					}
				
				}
			
				
			});
		 add(inicia);
		 
		 
		 
		 limpar.setBackground(Color.PINK);
			limpar.setForeground(Color.BLUE);
			limpar.setPreferredSize(new Dimension(110,110));
			 limpar.setText("LIMPAR");
			 limpar.setFont(new Font("arial black", Font.BOLD,12 ));
			 limpar.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
					for(Botao b : m.getBotoes())	{				
						if(b.getText()=="f" ) {
							ImageIcon grass=new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagem/grass.png")));
							b.setIcon(grass);
							b.setBackground(Color.GREEN);
						}
						if(b.getText()=="d") {
							b.setBackground(Color.GRAY);
							b.setIcon(null);
						}
						if(b.getText()=="t" ) {
							b.setBackground(Color.WHITE);
							b.setIcon(null);
						}
					}
					
					}
				});
			 add(limpar);
			 	finalizar.setBackground(Color.PINK);
			 	finalizar.setForeground(Color.BLUE);
				finalizar.setPreferredSize(new Dimension(110,110));
				finalizar.setText("FINALIZAR");
				finalizar.setFont(new Font("arial black", Font.BOLD,12 ));
				this.finalizar.addActionListener(this);
				add(finalizar);
				
				
				
			 
			 
	

}
	


@Override
public void actionPerformed(ActionEvent e) {
	for(Botao b : m.getBotoes())	{				
		b.setIdentificador(false);
		if(b.getText()=="f" ) {
			ImageIcon grass=new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagem/grass.png")));
			b.setIcon(grass);
			b.setBackground(Color.GREEN);
		}
		if(b.getText()=="d") {
			b.setBackground(Color.GRAY);
			b.setIcon(null);
		}
		if(b.getText()=="t" ) {
			b.setBackground(Color.WHITE);
			b.setIcon(null);
		}
	}
	pj.getPontos().setText(" "+m.Somatorio(m.getPontuaçãoAdversario()));
	pj.getPontosJogador().setText(" "+m.Somatorio(m.getPontuaçãoJogador()));
	
	
}}
	