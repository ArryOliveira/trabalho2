package t2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NomeJogador extends JFrame implements ActionListener{
	public JTextField texto=new JTextField();
	public JButton b=new JButton();
	public JLabel label=new JLabel();
	public NomeJogador() {
		this.texto.setColumns(16);
		this.b.setText("ENVIAR");
		this.b.addActionListener(this);
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Digite o seu nome");
		organizar();
		setVisible(true);
	}
	public void organizar() {
		setLayout(new FlowLayout());
		add(texto);
		add(label);
		add(b);
	}
	public void actionPerformed(ActionEvent e) {
		label.setText(texto.getText());
		
	}
}
