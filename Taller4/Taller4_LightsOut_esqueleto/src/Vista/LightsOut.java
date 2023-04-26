package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;





public class LightsOut implements ActionListener,MouseListener {
	private PanelEste PanelJava2D;

	private JFrame frame;
	private JTextField txtJugadas;
	private JTextField textField_1;
	private JTextField txtJugador;
	private JTextField textField_3;
	private JRadioButton rdbtnNewRadioButton; 
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_1_1;
	private JButton btnNewButton_1_1_1;
	JComboBox comboBox = new JComboBox();
	JPanel panel = new JPanel();
	JPanel panel_1 = new JPanel();
	Matriz Matrizp= new Matriz(5,5);
	


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LightsOut window = new LightsOut();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



	public LightsOut() {
		
		
		initialize();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
//Realizo todos los botones, no me gusta borderLayout limita el espacio por ende lo deje como null
	
	

	private void initialize() {
		
		
	
		frame = new JFrame();
		frame.setBounds(100, 100, 878, 652);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		
		panel.setBounds(0, 0, 862, 33);
		panel.setBackground(new Color(0, 128, 255));
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Tama\u00F1o :");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Cooper Black", Font.PLAIN, 18));
		panel.add(lblNewLabel);
		
		
		
		panel.add(comboBox);
		comboBox.addItem("5x5");
		comboBox.addItem("10x10");
		
		
		
		
				
		
		JLabel lblDificultad = new JLabel("Dificultad :");
		lblDificultad.setForeground(Color.WHITE);
		lblDificultad.setFont(new Font("Cooper Black", Font.PLAIN, 18));
		panel.add(lblDificultad);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("F\u00E1cil");
		rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setBackground(new Color(0, 128, 255));
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnMedia = new JRadioButton("Media");
		rdbtnMedia.setForeground(new Color(255, 255, 255));
		rdbtnMedia.setBackground(new Color(0, 128, 255));
		panel.add(rdbtnMedia);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("D\u00EDficil");
		rdbtnNewRadioButton_1_1.setForeground(new Color(255, 255, 255));
		rdbtnNewRadioButton_1_1.setBackground(new Color(0, 128, 255));
		panel.add(rdbtnNewRadioButton_1_1);
		
		btnNewButton = new JButton("Nuevo ");
		btnNewButton.addActionListener(this);
		btnNewButton.setFont(new Font("Cooper Black", Font.PLAIN, 14));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.setBounds(581, 195, 259, 33);
		
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Reiniciar");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Cooper Black", Font.PLAIN, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(581, 239, 259, 33);
		btnNewButton_1.setBackground(new Color(0, 128, 255));
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_1_1 = new JButton("TOP 10");
		btnNewButton_1_1.setFont(new Font("Cooper Black", Font.PLAIN, 14));
		btnNewButton_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1.setBackground(new Color(0, 128, 255));
		btnNewButton_1_1.setBounds(581, 283, 259, 33);
		frame.getContentPane().add(btnNewButton_1_1);
		
		btnNewButton_1_1_1 = new JButton("Cambiar Jugador");
		btnNewButton_1_1_1.setFont(new Font("Cooper Black", Font.PLAIN, 14));
		btnNewButton_1_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_1.setBackground(new Color(0, 128, 255));
		btnNewButton_1_1_1.setBounds(581, 326, 259, 33);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		
		panel_1.setBounds(40, 85, 499, 490);
		frame.getContentPane().add(panel_1);
		panel_1.add(Matrizp);
		
		

		
		txtJugadas = new JTextField();
		txtJugadas.setEditable(false);
		txtJugadas.setText("Jugadas:");
		txtJugadas.setBounds(0, 593, 184, 20);
		frame.getContentPane().add(txtJugadas);
		txtJugadas.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setText("0");
		textField_1.setColumns(10);
		textField_1.setBounds(183, 593, 233, 20);
		frame.getContentPane().add(textField_1);
		
		txtJugador = new JTextField();
		txtJugador.setEditable(false);
		txtJugador.setText("Jugador");
		txtJugador.setColumns(10);
		txtJugador.setBounds(414, 593, 250, 20);
		frame.getContentPane().add(txtJugador);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(664, 593, 198, 20);
		frame.getContentPane().add(textField_3);
		frame.addMouseListener(this);
	
	}
	
public void actionPerformed(ActionEvent event)
{ 
	String itemsel= (String)comboBox.getSelectedItem();
	if (event.getSource()== btnNewButton)
	{
		panel_1.remove(Matrizp);
		
		if (itemsel.equals("5x5"))
		{
			Matriz matrizp1= new Matriz(5,5);
			Matrizp=matrizp1;
			panel_1.add(Matrizp);
			
		}
		else if (itemsel.equals("10x10"))
		{
			Matriz matrizp1= new Matriz(10,10);
			Matrizp=matrizp1;
			panel_1.add(Matrizp);
			
		}
		
		
		
		
		
	}

	
}
public void mouseClicked(MouseEvent e)
{
	int x= e.getX();
	int y=e.getY();
	System.out.println(x+" "+y);
	}



@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}



@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}



@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}



@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}
