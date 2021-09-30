package br.senai.sp.jandira.app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tela {
	
	public Tela() {
		
		JFrame j = new JFrame();
		j.setSize(600, 400);
		j.setTitle("Turma DS1T");
		
		j.setLayout(null);
		
		JButton botao = new JButton();
		botao.setText("Clique-me");
		
		botao.setBounds(50, 50, 100, 30);
		
		j.getContentPane().add(botao);
		
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Olá turma!!");				
			}
		});
		
		j.setVisible(true);
		
	}
	

}
