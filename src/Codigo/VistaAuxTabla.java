package Codigo;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import com.toedter.calendar.JMonthChooser;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.SwingConstants;

public class VistaAuxTabla extends JFrame {
	private Controlador controlador;
	private Modelo modelo;
	private Container contenedor;
	private JPanel contentPane;
	private JTextField txtfRefCastral;
	private JTextField txtfLocal;
	private JTextField txtfTipo;
	private JTextField txtfEmplazamiento;
	private JTextField txtfCuota;
	private JTextField txtfIntNombre;
	private JTextField txtfIntApellidos;
	private JTextField txtfIntCif;
	private JTextField txtfIntDireccion;
	private JTextField txtfIntMunicipio;
	private JTextField txtfIntEmail;
	private JTextField txtfIntTlfMovil;
	private JTextField txtfIntTlfFijo;
	private JTextField txtfIntFax;
	private JTextField txtfIntCP;
	private JTextField txtfRepCP;
	private JTextField txtfRepTlfFijo;
	private JTextField txtfRepTlfMovil;
	private JTextField txtfRepFax;
	private JTextField txtfRepNombre;
	private JTextField txtfRepApellidos;
	private JTextField txtfRepDNI;
	private JTextField txtfRepDireccion;
	private JTextField txtfRepMunicipio;
	private JTextField txtfFechaInicio;
	private JTextField txtfFechaSol;
	private JTextField txtfTipoSuelo;
	private JCheckBox chckbxEscritura;
	private JCheckBox chckbxModelo;
	private JCheckBox chckbxPlanos;
	private JCheckBox chckbxCd;
	private JCheckBox chckbxMemoria;
	private JCheckBox chckbxFotografia;
	private JCheckBox chckbxFotocopiaDni;
	private JCheckBox chckbxCertCol;
	private JCheckBox chckbxJustifacanteDePago;
	private JCheckBox chckbxCertModelo;
	private JCheckBox chckbxCertModelo_1;
	private JCheckBox chckbxLicenciaObra;
	private JCheckBox chckbxOtrasAutorizaciones;
	private JTextPane txtPDescripcion;
	
	


	public String getTxtfRefCastral() {
		return txtfRefCastral.getText();
	}

	public void setTxtfRefCastral(JTextField txtfRefCastral) {
		this.txtfRefCastral = txtfRefCastral;
	}

	public String getTxtfLocal() {
		return txtfLocal.getText();
	}

	public void setTxtfLocal(JTextField txtfLocal) {
		this.txtfLocal = txtfLocal;
	}

	public String getTxtfTipo() {
		return txtfTipo.getText();
	}

	public void setTxtfTipo(JTextField txtfTipo) {
		this.txtfTipo = txtfTipo;
	}

	public String getTxtfEmplazamiento() {
		return txtfEmplazamiento.getText();
	}

	public void setTxtfEmplazamiento(JTextField txtfEmplazamiento) {
		this.txtfEmplazamiento = txtfEmplazamiento;
	}

	public String getTxtfCuota() {
		return txtfCuota.getText();
	}

	public void setTxtfCuota(JTextField txtfCuota) {
		this.txtfCuota = txtfCuota;
	}

	public String getTxtfIntNombre() {
		return txtfIntNombre.getText();
	}

	public void setTxtfIntNombre(JTextField txtfIntNombre) {
		this.txtfIntNombre = txtfIntNombre;
	}

	public String getTxtfIntApellidos() {
		return txtfIntApellidos.getText();
	}

	public void setTxtfIntApellidos(JTextField txtfIntApellidos) {
		this.txtfIntApellidos = txtfIntApellidos;
	}

	public String getTxtfIntCif() {
		return txtfIntCif.getText();
	}

	public void setTxtfIntCif(JTextField txtfIntCif) {
		this.txtfIntCif = txtfIntCif;
	}

	public String getTxtfIntDireccion() {
		return txtfIntDireccion.getText();
	}

	public void setTxtfIntDireccion(JTextField txtfIntDireccion) {
		this.txtfIntDireccion = txtfIntDireccion;
	}

	public String getTxtfIntMunicipio() {
		return txtfIntMunicipio.getText();
	}

	public void setTxtfIntMunicipio(JTextField txtfIntMunicipio) {
		this.txtfIntMunicipio = txtfIntMunicipio;
	}

	public String getTxtfIntEmail() {
		return txtfIntEmail.getText();
	}

	public void setTxtfIntEmail(JTextField txtfIntEmail) {
		this.txtfIntEmail = txtfIntEmail;
	}

	public String getTxtfIntTlfMovil() {
		return txtfIntTlfMovil.getText();
	}

	public void setTxtfIntTlfMovil(JTextField txtfIntTlfMovil) {
		this.txtfIntTlfMovil = txtfIntTlfMovil;
	}

	public String getTxtfIntTlfFijo() {
		return txtfIntTlfFijo.getText();
	}

	public void setTxtfIntTlfFijo(JTextField txtfIntTlfFijo) {
		this.txtfIntTlfFijo = txtfIntTlfFijo;
	}

	public String getTxtfIntFax() {
		return txtfIntFax.getText();
	}

	public void setTxtfIntFax(JTextField txtfIntFax) {
		this.txtfIntFax = txtfIntFax;
	}

	public String getTxtfIntCP() {
		return txtfIntCP.getText();
	}

	public void setTxtfIntCP(JTextField txtfIntCP) {
		this.txtfIntCP = txtfIntCP;
	}

	public String getTxtfRepCP() {
		return txtfRepCP.getText();
	}

	public void setTxtfRepCP(JTextField txtfRepCP) {
		this.txtfRepCP = txtfRepCP;
	}

	public String getTxtfRepTlfFijo() {
		return txtfRepTlfFijo.getText();
	}

	public void setTxtfRepTlfFijo(JTextField txtfRepTlfFijo) {
		this.txtfRepTlfFijo = txtfRepTlfFijo;
	}

	public String getTxtfRepTlfMovil() {
		return txtfRepTlfMovil.getText();
	}

	public void setTxtfRepTlfMovil(JTextField txtfRepTlfMovil) {
		this.txtfRepTlfMovil = txtfRepTlfMovil;
	}

	public String getTxtfRepFax() {
		return txtfRepFax.getText();
	}

	public void setTxtfRepFax(JTextField txtfRepFax) {
		this.txtfRepFax = txtfRepFax;
	}

	public String getTxtfRepNombre() {
		return txtfRepNombre.getText();
	}

	public void setTxtfRepNombre(JTextField txtfRepNombre) {
		this.txtfRepNombre = txtfRepNombre;
	}

	public String getTxtfRepApellidos() {
		return txtfRepApellidos.getText();
	}

	public void setTxtfRepApellidos(JTextField txtfRepApellidos) {
		this.txtfRepApellidos = txtfRepApellidos;
	}

	public String getTxtfRepDNI() {
		return txtfRepDNI.getText();
	}

	public void setTxtfRepDNI(JTextField txtfRepDNI) {
		this.txtfRepDNI = txtfRepDNI;
	}

	public String getTxtfRepDireccion() {
		return txtfRepDireccion.getText();
	}

	public void setTxtfRepDireccion(JTextField txtfRepDireccion) {
		this.txtfRepDireccion = txtfRepDireccion;
	}

	public String getTxtfRepMunicipio() {
		return txtfRepMunicipio.getText();
	}

	public void setTxtfRepMunicipio(JTextField txtfRepMunicipio) {
		this.txtfRepMunicipio = txtfRepMunicipio;
	}

	public String getTxtfFechaInicio() {
		return txtfFechaInicio.getText();
	}

	public void setTxtfFechaInicio(JTextField txtfFechaInicio) {
		this.txtfFechaInicio = txtfFechaInicio;
	}

	public String getTxtfFechaSol() {
		return txtfFechaSol.getText();
	}

	public void setTxtfFechaSol(JTextField txtfFechaSol) {
		this.txtfFechaSol = txtfFechaSol;
	}

	public String getTxtfTipoSuelo() {
		return txtfTipoSuelo.getText();
	}

	public void setTxtfTipoSuelo(JTextField txtfTipoSuelo) {
		this.txtfTipoSuelo = txtfTipoSuelo;
	}

	public boolean getChckbxEscritura() {
		if(chckbxEscritura.isSelected()){
			return true;
		}else{
			return false;
		}
	}

	public void setChckbxEscritura(JCheckBox chckbxEscritura) {
		this.chckbxEscritura = chckbxEscritura;
	}

	public boolean getChckbxModelo() {
		if(chckbxModelo.isSelected()){
			return true;
		}else{
			return false;
		}	}

	public void setChckbxModelo(JCheckBox chckbxModelo) {
		this.chckbxModelo = chckbxModelo;
	}

	public boolean getChckbxPlanos() {
		if(chckbxPlanos.isSelected()){
			return true;
		}else{
			return false;
		}	}

	public void setChckbxPlanos(JCheckBox chckbxPlanos) {
		this.chckbxPlanos = chckbxPlanos;
	}

	public boolean getChckbxCd() {
		if(chckbxCd.isSelected()){
			return true;
		}else{
			return false;
		}	}

	public void setChckbxCd(JCheckBox chckbxCd) {
		this.chckbxCd = chckbxCd;
	}

	public boolean getChckbxMemoria() {
		if(chckbxMemoria.isSelected()){
			return true;
		}else{
			return false;
		}	}

	public void setChckbxMemoria(JCheckBox chckbxMemoria) {
		this.chckbxMemoria = chckbxMemoria;
	}

	public boolean getChckbxFotografia() {
		if(chckbxFotografia.isSelected()){
			return true;
		}else{
			return false;
		}	}

	public void setChckbxFotografia(JCheckBox chckbxFotografia) {
		this.chckbxFotografia = chckbxFotografia;
	}

	public boolean getChckbxFotocopiaDni() {
		if(chckbxFotocopiaDni.isSelected()){
			return true;
		}else{
			return false;
		}	}

	public void setChckbxFotocopiaDni(JCheckBox chckbxFotocopiaDni) {
		this.chckbxFotocopiaDni = chckbxFotocopiaDni;
	}

	public boolean getChckbxCertCol() {
		if(chckbxCertCol.isSelected()){
			return true;
		}else{
			return false;
		}	}

	public void setChckbxCertCol(JCheckBox chckbxCertCol) {
		this.chckbxCertCol = chckbxCertCol;
	}

	public boolean getChckbxJustifacanteDePago() {
		if(chckbxJustifacanteDePago.isSelected()){
			return true;
		}else{
			return false;
		}	}

	public void setChckbxJustifacanteDePago(JCheckBox chckbxJustifacanteDePago) {
		this.chckbxJustifacanteDePago = chckbxJustifacanteDePago;
	}

	public boolean getChckbxCertModelo() {
		if(chckbxCertModelo.isSelected()){
			return true;
		}else{
			return false;
		}	}

	public void setChckbxCertModelo(JCheckBox chckbxCertModelo) {
		this.chckbxCertModelo = chckbxCertModelo;
	}

	public boolean getChckbxCertModelo_1() {
		if(chckbxCertModelo_1.isSelected()){
			return true;
		}else{
			return false;
		}	}

	public void setChckbxCertModelo_1(JCheckBox chckbxCertModelo_1) {
		this.chckbxCertModelo_1 = chckbxCertModelo_1;
	}

	public boolean getChckbxLicenciaObra() {
		if(chckbxLicenciaObra.isSelected()){
			return true;
		}else{
			return false;
		}	}

	public void setChckbxLicenciaObra(JCheckBox chckbxLicenciaObra) {
		this.chckbxLicenciaObra = chckbxLicenciaObra;
	}

	public boolean getChckbxOtrasAutorizaciones() {
		if(chckbxOtrasAutorizaciones.isSelected()){
			return true;
		}else{
			return false;
		}	}

	public void setChckbxOtrasAutorizaciones(JCheckBox chckbxOtrasAutorizaciones) {
		this.chckbxOtrasAutorizaciones = chckbxOtrasAutorizaciones;
	}

	public String getTxtPDescripcion() {
		return txtPDescripcion.getText();
	}

	public void setTxtPDescripcion(JTextPane txtPDescripcion) {
		this.txtPDescripcion = txtPDescripcion;
	}


	public VistaAuxTabla() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 955 , 558);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tipo de suelo");
		lblNewLabel.setBounds(10, 69, 135, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblReferenciaCatastral = new JLabel("Referencia catastral");
		lblReferenciaCatastral.setBounds(10, 99, 135, 14);
		contentPane.add(lblReferenciaCatastral);
		
		JLabel lblLocal = new JLabel("Local");
		lblLocal.setBounds(10, 127, 135, 14);
		contentPane.add(lblLocal);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(10, 155, 135, 14);
		contentPane.add(lblTipo);
		
		JLabel lblEmplazamiento = new JLabel("Emplazamiento");
		lblEmplazamiento.setBounds(10, 183, 135, 14);
		contentPane.add(lblEmplazamiento);
		
		JLabel lblFechaInicio = new JLabel("Fecha inicio");
		lblFechaInicio.setBounds(10, 211, 135, 14);
		contentPane.add(lblFechaInicio);
		
		JLabel lblFechaSolicitud = new JLabel("Fecha Solicitud");
		lblFechaSolicitud.setBounds(10, 239, 135, 14);
		contentPane.add(lblFechaSolicitud);
		
		JLabel lblCuota = new JLabel("Cuota");
		lblCuota.setBounds(10, 267, 135, 14);
		contentPane.add(lblCuota);
		
		JLabel lblDescripcion = new JLabel("Descripcion ");
		lblDescripcion.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion.setBounds(630, 99, 313, 14);
		contentPane.add(lblDescripcion);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Urbano", "Rustico"}));
		comboBox.setBounds(155, 63, 145, 20);
		contentPane.add(comboBox);
		
		txtfRefCastral = new JTextField();
		txtfRefCastral.setBounds(155, 96, 145, 20);
		contentPane.add(txtfRefCastral);
		txtfRefCastral.setColumns(10);
		
		txtfLocal = new JTextField();
		txtfLocal.setColumns(10);
		txtfLocal.setBounds(155, 124, 145, 20);
		contentPane.add(txtfLocal);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(155, 152, 145, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(155, 180, 145, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(155, 264, 145, 20);
		contentPane.add(textField_2);
		
		JCheckBox chckbxEntregado = new JCheckBox("Certificado colegio oficial");
		chckbxEntregado.setBounds(465, 95, 199, 23);
		contentPane.add(chckbxEntregado);
		
		JCheckBox chckbxCertificadoModelo = new JCheckBox("Certificado Modelo 1");
		chckbxCertificadoModelo.setBounds(465, 151, 159, 23);
		contentPane.add(chckbxCertificadoModelo);
		
		JCheckBox chckbxCertificadoModelo_1 = new JCheckBox("Certificado Modelo 2");
		chckbxCertificadoModelo_1.setBounds(465, 179, 159, 23);
		contentPane.add(chckbxCertificadoModelo_1);
		
		JCheckBox chckbxLicenciaObra = new JCheckBox("Licencia obra");
		chckbxLicenciaObra.setBounds(465, 207, 159, 23);
		contentPane.add(chckbxLicenciaObra);
		
		JCheckBox chckbxOtrasAutorizaciones = new JCheckBox("Otras autorizaciones");
		chckbxOtrasAutorizaciones.setBounds(465, 235, 159, 23);
		contentPane.add(chckbxOtrasAutorizaciones);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(634, 127, 309, 154);
		contentPane.add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		
		JCheckBox chckbxJustifacanteDePago = new JCheckBox("Justifacante de pago");
		chckbxJustifacanteDePago.setBounds(465, 123, 159, 23);
		contentPane.add(chckbxJustifacanteDePago);
		
		JCheckBox chckbxEscritura = new JCheckBox("Escritura");
		chckbxEscritura.setBounds(334, 95, 129, 23);
		contentPane.add(chckbxEscritura);
		
		JCheckBox chckbxModelo = new JCheckBox("Modelo 36");
		chckbxModelo.setBounds(334, 123, 129, 23);
		contentPane.add(chckbxModelo);
		
		JCheckBox chckbxPlanos = new JCheckBox("Planos");
		chckbxPlanos.setBounds(334, 151, 129, 23);
		contentPane.add(chckbxPlanos);
		
		JCheckBox chckbxCd = new JCheckBox("CD");
		chckbxCd.setBounds(334, 179, 129, 23);
		contentPane.add(chckbxCd);
		
		JCheckBox chckbxMemoria = new JCheckBox("Memoria");
		chckbxMemoria.setBounds(334, 207, 129, 23);
		contentPane.add(chckbxMemoria);
		
		JCheckBox chckbxFotografia = new JCheckBox("Fotografia");
		chckbxFotografia.setBounds(334, 235, 129, 23);
		contentPane.add(chckbxFotografia);
		
		JLabel lblNewLabel_1 = new JLabel("ACTIVIDAD");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 22, 929, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblInteresado = new JLabel("INTERESADO");
		lblInteresado.setHorizontalAlignment(SwingConstants.CENTER);
		lblInteresado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblInteresado.setBounds(10, 309, 437, 24);
		contentPane.add(lblInteresado);
		
		JLabel lblName1 = new JLabel("Nombre");
		lblName1.setBounds(10, 360, 74, 14);
		contentPane.add(lblName1);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(10, 385, 74, 14);
		contentPane.add(lblApellidos);
		
		JLabel lblCif = new JLabel("CIF");
		lblCif.setBounds(10, 410, 74, 14);
		contentPane.add(lblCif);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(10, 435, 74, 14);
		contentPane.add(lblDireccion);
		
		JLabel lblMunicipio = new JLabel("Municipio");
		lblMunicipio.setBounds(10, 460, 74, 14);
		contentPane.add(lblMunicipio);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(75, 357, 152, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(75, 382, 152, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(75, 407, 152, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(75, 432, 152, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(75, 457, 152, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(327, 457, 120, 20);
		contentPane.add(textField_8);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(237, 460, 79, 14);
		contentPane.add(lblEmail);
		
		JLabel lblFax = new JLabel("Fax");
		lblFax.setBounds(237, 435, 79, 14);
		contentPane.add(lblFax);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(327, 407, 120, 20);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(327, 382, 120, 20);
		contentPane.add(textField_10);
		
		JLabel lblTlfMovil = new JLabel("Tlf Movil");
		lblTlfMovil.setBounds(237, 410, 79, 14);
		contentPane.add(lblTlfMovil);
		
		JLabel lblCodigoPostal = new JLabel("Codigo postal");
		lblCodigoPostal.setBounds(237, 360, 79, 14);
		contentPane.add(lblCodigoPostal);
		
		JLabel lblTlfFijo = new JLabel("Tlf Fijo");
		lblTlfFijo.setBounds(237, 385, 79, 14);
		contentPane.add(lblTlfFijo);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(327, 432, 120, 20);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(327, 357, 120, 20);
		contentPane.add(textField_12);
		
		txtfCp2 = new JTextField();
		txtfCp2.setColumns(10);
		txtfCp2.setBounds(789, 357, 150, 20);
		contentPane.add(txtfCp2);
		
		txtfTelFijo2 = new JTextField();
		txtfTelFijo2.setColumns(10);
		txtfTelFijo2.setBounds(789, 382, 150, 20);
		contentPane.add(txtfTelFijo2);
		
		txtfTelMovil2 = new JTextField();
		txtfTelMovil2.setColumns(10);
		txtfTelMovil2.setBounds(789, 407, 150, 20);
		contentPane.add(txtfTelMovil2);
		
		txtfFax = new JTextField();
		txtfFax.setColumns(10);
		txtfFax.setBounds(789, 432, 150, 20);
		contentPane.add(txtfFax);
		
		lblFax_1 = new JLabel("Fax");
		lblFax_1.setBounds(689, 435, 90, 14);
		contentPane.add(lblFax_1);
		
		lblTlfMovil_1 = new JLabel("Tlf Movil");
		lblTlfMovil_1.setBounds(689, 410, 90, 14);
		contentPane.add(lblTlfMovil_1);
		
		lblTlfFijo_1 = new JLabel("Tlf Fijo");
		lblTlfFijo_1.setBounds(689, 385, 90, 14);
		contentPane.add(lblTlfFijo_1);
		
		lblCodigoPostal_1 = new JLabel("Codigo Postal");
		lblCodigoPostal_1.setBounds(689, 360, 90, 14);
		contentPane.add(lblCodigoPostal_1);
		
		txtfNombre2 = new JTextField();
		txtfNombre2.setColumns(10);
		txtfNombre2.setBounds(525, 357, 154, 20);
		contentPane.add(txtfNombre2);
		
		txtfApellidos2 = new JTextField();
		txtfApellidos2.setColumns(10);
		txtfApellidos2.setBounds(525, 382, 154, 20);
		contentPane.add(txtfApellidos2);
		
		txtfDni2 = new JTextField();
		txtfDni2.setColumns(10);
		txtfDni2.setBounds(525, 407, 154, 20);
		contentPane.add(txtfDni2);
		
		txtfDireccion2 = new JTextField();
		txtfDireccion2.setColumns(10);
		txtfDireccion2.setBounds(525, 432, 154, 20);
		contentPane.add(txtfDireccion2);
		
		txtfMunicipio2 = new JTextField();
		txtfMunicipio2.setColumns(10);
		txtfMunicipio2.setBounds(525, 457, 154, 20);
		contentPane.add(txtfMunicipio2);
		
		lblMunicipio_1 = new JLabel("Municipio");
		lblMunicipio_1.setBounds(465, 460, 70, 14);
		contentPane.add(lblMunicipio_1);
		
		lblDireccion_1 = new JLabel("Direccion");
		lblDireccion_1.setBounds(465, 435, 70, 14);
		contentPane.add(lblDireccion_1);
		
		lblDocumentoIdentidad = new JLabel("DNI");
		lblDocumentoIdentidad.setBounds(465, 410, 70, 14);
		contentPane.add(lblDocumentoIdentidad);
		
		lblApellidos2 = new JLabel("Apellidos");
		lblApellidos2.setBounds(465, 385, 70, 14);
		contentPane.add(lblApellidos2);
		
		lblNombre2 = new JLabel("Nombre");
		lblNombre2.setBounds(465, 360, 70, 14);
		contentPane.add(lblNombre2);

		JSeparator separator = new JSeparator();
		separator.setForeground(Color.LIGHT_GRAY);
		separator.setBounds(14, 309, 929, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(457, 309, 2, 176);
		contentPane.add(separator_1);
		
		JCheckBox chckbxFotocopiaDni = new JCheckBox("Fotocopia DNI");
		chckbxFotocopiaDni.setBounds(334, 263, 290, 23);
		contentPane.add(chckbxFotocopiaDni);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnCancelar.setBounds(752, 495, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnModificar = new JButton("Modificar");
		
		btnModificar.setBounds(854, 495, 89, 23);
		contentPane.add(btnModificar);
		
		textField_17 = new JTextField();
		textField_17.setBounds(155, 208, 145, 20);
		contentPane.add(textField_17);
		textField_17.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setBounds(155, 236, 145, 20);
		contentPane.add(textField_23);
		textField_23.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.LIGHT_GRAY);
		separator_2.setBounds(14, 485, 929, 2);
		contentPane.add(separator_2);
		
		chckbxRepresentate = new JCheckBox("REPRESENTATE");
		chckbxRepresentate.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxRepresentate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxRepresentate.setSelected(true);
		chckbxRepresentate.setBounds(465, 309, 478, 23);
		contentPane.add(chckbxRepresentate);
		
		chckbxRepresentate.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				if (e.getStateChange() == ItemEvent.SELECTED){
					
					System.err.println("1");
					
					lblNombre2.setEnabled(true);
					lblApellidos2.setEnabled(true);
					lblDocumentoIdentidad.setEnabled(true);
					lblDireccion_1.setEnabled(true);
					lblMunicipio_1.setEnabled(true);
					lblCodigoPostal_1.setEnabled(true);
					lblTlfFijo_1.setEnabled(true);
					lblTlfMovil_1.setEnabled(true);
					lblFax_1.setEnabled(true);
					
					txtfNombre2.setEnabled(true);
					txtfApellidos2.setEnabled(true);
					txtfCp2.setEnabled(true);
					txtfDni2.setEnabled(true);
					txtfDireccion2.setEnabled(true);
					txtfMunicipio2.setEnabled(true);
					txtfFax.setEnabled(true);
					txtfTelFijo2.setEnabled(true);
					txtfTelMovil2.setEnabled(true);
					
				} else {
					
					System.err.println("2");
					
					lblNombre2.setEnabled(false);
					lblApellidos2.setEnabled(false);
					lblDocumentoIdentidad.setEnabled(false);
					lblDireccion_1.setEnabled(false);
					lblMunicipio_1.setEnabled(false);
					lblCodigoPostal_1.setEnabled(false);
					lblTlfFijo_1.setEnabled(false);
					lblTlfMovil_1.setEnabled(false);
					lblFax_1.setEnabled(false);
					
					txtfNombre2.setEnabled(false);
					txtfApellidos2.setEnabled(false);
					txtfCp2.setEnabled(false);
					txtfDni2.setEnabled(false);
					txtfDireccion2.setEnabled(false);
					txtfMunicipio2.setEnabled(false);
					txtfFax.setEnabled(false);
					txtfTelFijo2.setEnabled(false);
					txtfTelMovil2.setEnabled(false);
					
				}
				
			}
		});
		
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	public Container getContenedor() {

		return contenedor;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public void adirArr() {

	}
}

