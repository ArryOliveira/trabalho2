package t2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Objects;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Botao extends JButton  {
	private Boolean identificador=false;
	
	
	public Botao() {
		this.setPreferredSize(new Dimension(50,50));
		
		
		
		
	}

	public Boolean getIdentificador() {
		return identificador;
	}
	public void setIdentificador(Boolean identificador) {
		this.identificador = identificador;
	}
	


	


	
	


}
