package Codigo;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VistaFicheroIni extends JFrame implements Vista{

	private JPanel contentPane;
	private ControladorWB controlador;
	private Modelo modelo;
	private ModeloBBDD modelo2;
	private ModeloFicheroIni modeloFich;
	private Container contenedor;
	private JTextField txtfBaseDatos;
	private JTextField txtfPassword;
	private JTextField txtfLogin;
	private JLabel lbl;
	private JTextField txtfURL;
	private JButton btnModificar;
	private JButton btnOk;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public VistaFicheroIni() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 398, 232);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		txtfBaseDatos = new JTextField();
		txtfBaseDatos.setBounds(168, 23, 210, 20);
		txtfBaseDatos.setEnabled(false);
		txtfBaseDatos.setColumns(10);

		JLabel lblBaseDeDatos = new JLabel("Base de Datos");
		lblBaseDeDatos.setBounds(15, 26, 189, 14);

		JLabel lblLogin = new JLabel("Usuario base de datos");
		lblLogin.setBounds(15, 57, 189, 14);

		txtfLogin = new JTextField();
		txtfLogin.setBounds(168, 54, 210, 20);
		txtfLogin.setEnabled(false);
		txtfLogin.setColumns(10);

		JLabel lblPassword = new JLabel("Password base de datos");
		lblPassword.setBounds(15, 88, 189, 14);

		txtfPassword = new JTextField();
		txtfPassword.setBounds(168, 85, 210, 20);
		txtfPassword.setEnabled(false);
		txtfPassword.setColumns(10);

		lbl = new JLabel("URL");
		lbl.setBounds(15, 119, 189, 14);

		txtfURL = new JTextField();
		txtfURL.setBounds(168, 116, 210, 20);
		txtfURL.setEnabled(false);
		txtfURL.setColumns(10);
		
		btnOk = new JButton("Guardar");
		btnOk.setBounds(287, 169, 91, 23);
		btnOk.setEnabled(false);
		
		btnModificar = new JButton("Habilitar edicion");
		btnModificar.setBounds(144, 169, 125, 23);
		contentPane.setLayout(null);
		contentPane.add(lblPassword);
		contentPane.add(txtfURL);
		contentPane.add(txtfPassword);
		contentPane.add(btnOk);
		contentPane.add(btnModificar);
		contentPane.add(lblBaseDeDatos);
		contentPane.add(txtfBaseDatos);
		contentPane.add(lblLogin);
		contentPane.add(txtfLogin);
		contentPane.add(lbl);
		btnModificar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				controlador.Modificar();
				
			}
		});
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlador.GuardarDatos();
				dispose();
			}
		});
	}
	
	public void  txtEnable(){
		txtfLogin = modeloFich.getLogjt();
		txtfBaseDatos = modeloFich.getBdjt();
		txtfPassword = modeloFich.getPassjt();
		txtfURL = modeloFich.getUrljt();
		btnOk = modeloFich.getOk();
	}
	
	public String getTxtfBaseDatos() {
		return txtfBaseDatos.getText();
	}

	public void setTxtfBaseDatos(String txtfBaseDatos) {
		this.txtfBaseDatos.setText(txtfBaseDatos);
		
	}

	public String getTxtfPassword() {
		return txtfPassword.getText();
	}

	public void setTxtfPassword(String txtfPassword) {
		this.txtfPassword.setText(txtfPassword);
	}

	public String getTxtfLogin() {
		return txtfLogin.getText();
	}

	public void setTxtfLogin(String txtfLogin) {
		this.txtfLogin.setText(txtfLogin);
	}

	public String getTxtfURL() {
		return txtfURL.getText();
	}

	public void setTxtfURL(String txtfURL) {
		this.txtfURL.setText(txtfURL);
	}

	public void setControlador(Controlador controlador) {
		this.controlador = (ControladorWB) controlador;
	}

	public Container getContenedor() {

		return contenedor;
	}

	public void setModeloBBDD(Modelo modelo) {
		this.modelo = (ModeloBBDD) modelo;
	}
	public void setModeloFich(Modelo modeloFich) {
		this.modeloFich = (ModeloFicheroIni)modeloFich;
	}
	public JButton getBtnOk() {
		return btnOk;
	}
	public JTextField getTxtfPasswordEnb() {
		return txtfPassword;
	}
	public JTextField getTxtfBaseDatosEnb() {
		return txtfBaseDatos;
	}
	public JTextField getTxtfLoginEnb() {
		return txtfLogin;
	}
	public JTextField getTxtfURLEnb() {
		return txtfURL;
	}
	@Override
	public void setModelo(Modelo modelo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adirArr() {
		// TODO Auto-generated method stub
		
	}
}
