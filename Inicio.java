import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class Inicio extends JFrame implements ActionListener{
	private JLabel label1, label2, label3;
	private JTextField textfield1;
	private JButton boton1;

	public Inicio(){
		setLayout(null);
		setTitle("Bienvenido");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(234,56,95));

		label1 = new JLabel("Ingrese Cantidad de Números: ");
		label1.setBounds(55,85,450,150);
		label1.setFont(new Font("Brownie The Bear", 3,25));
		label1.setForeground(new Color(255,255,255));
		add(label1);


		textfield1 = new JTextField();
		textfield1.setBounds(105,186,350,37);
		textfield1.setFont(new Font("Andale Mono", 3, 18));
		textfield1.setForeground(new Color(255,255,255));
		textfield1.setBorder(BorderFactory.createLineBorder(new Color(255,99,71)));
		textfield1.requestFocus();
		textfield1.setCaretColor(Color.white);
		textfield1.setBackground(new Color(255,99,71));
		add(textfield1);

		label2 = new JLabel("Numero Ganador: ");
		label2.setBounds(165,310,250,30);
		label2.setFont(new Font("Brownie The Bear", 3,21));
		label2.setForeground(new Color(255,255,255));
		add(label2);

		label3 = new JLabel();
		label3.setBounds(255,345,250,30);
		label3.setFont(new Font("Brownie The Bear", 3,21));
		label3.setForeground(new Color(255,255,255));
		add(label3);



		boton1 = new JButton("Sortear");
		boton1.setBounds(196,250,150,35);
		boton1.setFont(new Font("Andale Mono", 3, 18));
		boton1.setForeground(new Color(255,255,255));
		boton1.setBorder(BorderFactory.createLineBorder(new Color(255,99,71)));
		boton1.setBackground(new Color(255,99,71));
		add(boton1);
		boton1.addActionListener(this);


	}

	public void actionPerformed(ActionEvent e){
		int num1, aleatorio = 1;
		if(e.getSource()==boton1){
			num1 = Integer.parseInt(textfield1.getText());
			aleatorio = (int)(Math.random() * num1);
			label3.setText("" + aleatorio);

		}
	}

	public static void main(String args[]){
		Inicio inicio1 = new Inicio();
		inicio1.setBounds(0,0,550,650);
		inicio1.setVisible(true);
		inicio1.setLocationRelativeTo(null);
		inicio1.setResizable(false);
	}
}