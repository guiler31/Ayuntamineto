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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_17;
	private JTextField textField_23;

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
		lblInteresado.setBounds(10, 322, 389, 24);
		contentPane.add(lblInteresado);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setBounds(10, 360, 74, 14);
		contentPane.add(lblNewLabel_2);
		
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
		
		textField_13 = new JTextField();
		textField_13.setEnabled(false);
		textField_13.setColumns(10);
		textField_13.setBounds(789, 357, 150, 20);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setEnabled(false);
		textField_14.setColumns(10);
		textField_14.setBounds(789, 382, 150, 20);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setEnabled(false);
		textField_15.setColumns(10);
		textField_15.setBounds(789, 407, 150, 20);
		contentPane.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setEnabled(false);
		textField_16.setColumns(10);
		textField_16.setBounds(789, 432, 150, 20);
		contentPane.add(textField_16);
		
		JLabel lblFax_1 = new JLabel("Fax");
		lblFax_1.setEnabled(false);
		lblFax_1.setBounds(689, 435, 90, 14);
		contentPane.add(lblFax_1);
		
		JLabel lblTlfMovil_1 = new JLabel("Tlf Movil");
		lblTlfMovil_1.setEnabled(false);
		lblTlfMovil_1.setBounds(689, 410, 90, 14);
		contentPane.add(lblTlfMovil_1);
		
		JLabel lblTlfFijo_1 = new JLabel("Tlf Fijo");
		lblTlfFijo_1.setEnabled(false);
		lblTlfFijo_1.setBounds(689, 385, 90, 14);
		contentPane.add(lblTlfFijo_1);
		
		JLabel lblCodigoPostal_1 = new JLabel("Codigo Postal");
		lblCodigoPostal_1.setEnabled(false);
		lblCodigoPostal_1.setBounds(689, 360, 90, 14);
		contentPane.add(lblCodigoPostal_1);
		
		textField_18 = new JTextField();
		textField_18.setEnabled(false);
		textField_18.setColumns(10);
		textField_18.setBounds(525, 357, 154, 20);
		contentPane.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setEnabled(false);
		textField_19.setColumns(10);
		textField_19.setBounds(525, 382, 154, 20);
		contentPane.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setEnabled(false);
		textField_20.setColumns(10);
		textField_20.setBounds(525, 407, 154, 20);
		contentPane.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setEnabled(false);
		textField_21.setColumns(10);
		textField_21.setBounds(525, 432, 154, 20);
		contentPane.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setEnabled(false);
		textField_22.setColumns(10);
		textField_22.setBounds(525, 457, 154, 20);
		contentPane.add(textField_22);
		
		JLabel lblMunicipio_1 = new JLabel("Municipio");
		lblMunicipio_1.setEnabled(false);
		lblMunicipio_1.setBounds(465, 460, 70, 14);
		contentPane.add(lblMunicipio_1);
		
		JLabel lblDireccion_1 = new JLabel("Direccion");
		lblDireccion_1.setEnabled(false);
		lblDireccion_1.setBounds(465, 435, 70, 14);
		contentPane.add(lblDireccion_1);
		
		JLabel lblDocumentoIdentidad = new JLabel("DNI");
		lblDocumentoIdentidad.setEnabled(false);
		lblDocumentoIdentidad.setBounds(465, 410, 70, 14);
		contentPane.add(lblDocumentoIdentidad);
		
		JLabel lblApellidos_1 = new JLabel("Apellidos");
		lblApellidos_1.setEnabled(false);
		lblApellidos_1.setBounds(465, 385, 70, 14);
		contentPane.add(lblApellidos_1);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setEnabled(false);
		lblNombre.setBounds(465, 360, 70, 14);
		contentPane.add(lblNombre);
		
		JCheckBox chckbxRepresentante = new JCheckBox("REPRESENTANTE");
		chckbxRepresentante.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxRepresentante.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxRepresentante.setBounds(465, 322, 478, 24);
		contentPane.add(chckbxRepresentante);
		
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
