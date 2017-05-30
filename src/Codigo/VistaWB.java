package Codigo;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTable;
import com.toedter.calendar.JDateChooser;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;

public class VistaWB extends JFrame implements Vista {
	private ModeloWB modelo;
	private ControladorWB controlador;
	private ModeloBBDD modelo2;

	private Container contenedor;
	private JPanel contentPane;
	private JPanel ArrVistas[];
	private JTextField NIFBusquedaPJ;
	private JTextField txtfActBusqueda;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_15;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField txtfLocal;
	private JTextField txtfTipo;
	private JTextField txtfCuota;
	private JTextField txtfReferenciaCatastral;
	private JTextField txtfEmplazamiento;

	private JTable table;
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private JButton btnConfiguracion;

	public void setControlador(Controlador controlador) {

		this.controlador = (ControladorWB) controlador;
	}

	public Container getContenedor() {
		return contenedor;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = (ModeloWB) modelo;
	}

	public void setModelo2(Modelo modelo2) {
		this.modelo2 = (ModeloBBDD) modelo2;
	}

	public void adirArr() {
		controlador.setPanels(ArrVistas);
	}

	/**
	 * Create the frame.
	 */
	public VistaWB() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VistaWB.class.getResource("/Codigo/logo50x50.png")));
		setResizable(false);
		this.ArrVistas = new JPanel[3];
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 844, 769);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(25, 166, 794, 529);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));

		btnConfiguracion = new JButton("Configuracion");
		btnConfiguracion.setBounds(572, 706, 247, 23);
		btnConfiguracion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controlador.ventanaConfiguracion();
			}
		});
		btnConfiguracion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

			}
		});

		JLabel lblRutaDeAcceso = new JLabel("");
		lblRutaDeAcceso.setHorizontalAlignment(SwingConstants.CENTER);
		lblRutaDeAcceso.setText("Inscribir Licencia de Actividad");

		JPanel Contenedor = new JPanel();

		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				gl_panel_2.createSequentialGroup()
						.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_2.createSequentialGroup().addGap(10).addComponent(Contenedor,
										GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE))
								.addComponent(lblRutaDeAcceso, GroupLayout.DEFAULT_SIZE, 891, Short.MAX_VALUE))
						.addContainerGap()));
		gl_panel_2.setVerticalGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
						.addComponent(lblRutaDeAcceso, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(Contenedor, GroupLayout.PREFERRED_SIZE, 482, Short.MAX_VALUE).addContainerGap()));
		Contenedor.setLayout(new CardLayout(0, 0));

		JPanel VisualizarLicencias = new JPanel();
		Contenedor.add(VisualizarLicencias, "name_30680022169608");
		ArrVistas[0] = VisualizarLicencias;

		JScrollPane scrollPane_1 = new JScrollPane();
		GroupLayout gl_VisualizarLicencias = new GroupLayout(VisualizarLicencias);
		gl_VisualizarLicencias.setHorizontalGroup(gl_VisualizarLicencias.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE));
		gl_VisualizarLicencias.setVerticalGroup(gl_VisualizarLicencias.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_VisualizarLicencias.createSequentialGroup().addContainerGap()
						.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 474, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		table = new JTable() {
			private static final long serialVersionUID = 9082642090247275215L;

			public boolean isCellEditable(int row, int column) {
				return false;// you can set which column/row can be edited.
			}
		};
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "NºRegistro", "Nombre", "Apellido", "Licencia", "CIF" }));
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					int selectedRowIndex = table.getSelectedRow();
					controlador.nuevaPantalla();
				}
			}
		});

		table.setRowSelectionAllowed(true);
		table.setColumnSelectionAllowed(false);
		scrollPane_1.setViewportView(table);
		VisualizarLicencias.setLayout(gl_VisualizarLicencias);

		JPanel inscActvPers = new JPanel();
		inscActvPers.setBackground(SystemColor.menu);
		Contenedor.add(inscActvPers, "name_25046820143722");
		inscActvPers.setVisible(false);
		ArrVistas[1] = inscActvPers;
		inscActvPers.setLayout(null);

		JLabel lblInteresado = new JLabel("Interesado");
		lblInteresado.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblInteresado.setBounds(76, 11, 77, 14);
		inscActvPers.add(lblInteresado);

		JLabel lblNombre_1 = new JLabel("Nombre");
		lblNombre_1.setBounds(30, 36, 180, 14);
		inscActvPers.add(lblNombre_1);

		textField = new JTextField();
		textField.setBounds(30, 61, 180, 20);
		inscActvPers.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(30, 117, 180, 20);
		inscActvPers.add(textField_1);

		JLabel lblApellidos_1 = new JLabel("Apellidos");
		lblApellidos_1.setBounds(30, 92, 180, 14);
		inscActvPers.add(lblApellidos_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(30, 173, 180, 20);
		inscActvPers.add(textField_2);

		JLabel lblRazonSocial_1 = new JLabel("Razon social");
		lblRazonSocial_1.setBounds(30, 148, 180, 14);
		inscActvPers.add(lblRazonSocial_1);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(30, 229, 180, 20);
		inscActvPers.add(textField_3);

		JLabel lblCif = new JLabel("CIF");
		lblCif.setBounds(30, 204, 180, 14);
		inscActvPers.add(lblCif);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(30, 285, 180, 20);
		inscActvPers.add(textField_4);

		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(30, 260, 180, 14);
		inscActvPers.add(lblDireccion);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(30, 341, 180, 20);
		inscActvPers.add(textField_5);

		JLabel lblCodigoPostal = new JLabel("Codigo postal");
		lblCodigoPostal.setBounds(30, 316, 180, 14);
		inscActvPers.add(lblCodigoPostal);

		JLabel lblTelefonoFijo = new JLabel("Telefono fijo");
		lblTelefonoFijo.setBounds(124, 483, 86, 14);
		inscActvPers.add(lblTelefonoFijo);

		textField_7 = new JTextField();
		textField_7.setEnabled(false);
		textField_7.setColumns(10);
		textField_7.setBounds(447, 508, 86, 20);
		inscActvPers.add(textField_7);

		JLabel lblTelefonoMovil = new JLabel("Telefono movil");
		lblTelefonoMovil.setEnabled(false);
		lblTelefonoMovil.setBounds(353, 483, 84, 14);
		inscActvPers.add(lblTelefonoMovil);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(124, 508, 86, 20);
		inscActvPers.add(textField_10);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(30, 508, 86, 20);
		inscActvPers.add(textField_11);

		JLabel label_2 = new JLabel("Telefono movil");
		label_2.setBounds(30, 483, 84, 14);
		inscActvPers.add(label_2);

		JLabel label_3 = new JLabel("Telefono fijo");
		label_3.setEnabled(false);
		label_3.setBounds(447, 483, 86, 14);
		inscActvPers.add(label_3);

		textField_12 = new JTextField();
		textField_12.setEnabled(false);
		textField_12.setColumns(10);
		textField_12.setBounds(353, 341, 180, 20);
		inscActvPers.add(textField_12);

		JLabel label_4 = new JLabel("Codigo postal");
		label_4.setEnabled(false);
		label_4.setBounds(353, 316, 178, 14);
		inscActvPers.add(label_4);

		textField_13 = new JTextField();
		textField_13.setEnabled(false);
		textField_13.setColumns(10);
		textField_13.setBounds(353, 229, 180, 20);
		inscActvPers.add(textField_13);

		JLabel label_5 = new JLabel("Direccion");
		label_5.setEnabled(false);
		label_5.setBounds(353, 204, 184, 14);
		inscActvPers.add(label_5);

		textField_14 = new JTextField();
		textField_14.setEnabled(false);
		textField_14.setColumns(10);
		textField_14.setBounds(353, 173, 180, 20);
		inscActvPers.add(textField_14);

		JLabel lblDocumentoDeIdentidad = new JLabel("Documento de identidad");
		lblDocumentoDeIdentidad.setEnabled(false);
		lblDocumentoDeIdentidad.setBounds(353, 148, 184, 14);
		inscActvPers.add(lblDocumentoDeIdentidad);

		textField_16 = new JTextField();
		textField_16.setEnabled(false);
		textField_16.setColumns(10);
		textField_16.setBounds(353, 117, 180, 20);
		inscActvPers.add(textField_16);

		JLabel label_9 = new JLabel("Apellidos");
		label_9.setEnabled(false);
		label_9.setBounds(353, 92, 182, 14);
		inscActvPers.add(label_9);

		textField_17 = new JTextField();
		textField_17.setEnabled(false);
		textField_17.setColumns(10);
		textField_17.setBounds(353, 61, 180, 20);
		inscActvPers.add(textField_17);

		JLabel label_10 = new JLabel("Nombre");
		label_10.setEnabled(false);
		label_10.setBounds(353, 36, 182, 14);
		inscActvPers.add(label_10);

		JLabel lblRepresentante = new JLabel("Representante");
		lblRepresentante.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRepresentante.setBounds(394, 10, 102, 17);
		inscActvPers.add(lblRepresentante);

		textField_8 = new JTextField();
		textField_8.setEnabled(false);
		textField_8.setColumns(10);
		textField_8.setBounds(353, 285, 180, 20);
		inscActvPers.add(textField_8);

		JLabel lblMunicipio = new JLabel("Municipio");
		lblMunicipio.setEnabled(false);
		lblMunicipio.setBounds(353, 260, 182, 14);
		inscActvPers.add(lblMunicipio);

		JLabel lblEmailInteresado = new JLabel("Email interesado");
		lblEmailInteresado.setBounds(28, 372, 182, 14);
		inscActvPers.add(lblEmailInteresado);

		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(30, 397, 180, 20);
		inscActvPers.add(textField_9);

		JLabel lblEmailRepresentante = new JLabel("Email representante");
		lblEmailRepresentante.setEnabled(false);
		lblEmailRepresentante.setBounds(353, 372, 182, 14);
		inscActvPers.add(lblEmailRepresentante);

		textField_15 = new JTextField();
		textField_15.setEnabled(false);
		textField_15.setColumns(10);
		textField_15.setBounds(353, 397, 180, 20);
		inscActvPers.add(textField_15);

		JLabel lblFaxInteresado = new JLabel("Fax interesado");
		lblFaxInteresado.setBounds(30, 428, 182, 14);
		inscActvPers.add(lblFaxInteresado);

		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(30, 449, 180, 20);
		inscActvPers.add(textField_18);

		JLabel lblFaxRepresentante = new JLabel("Fax representante");
		lblFaxRepresentante.setEnabled(false);
		lblFaxRepresentante.setBounds(353, 428, 182, 14);
		inscActvPers.add(lblFaxRepresentante);

		textField_19 = new JTextField();
		textField_19.setEnabled(false);
		textField_19.setColumns(10);
		textField_19.setBounds(353, 452, 180, 20);
		inscActvPers.add(textField_19);

		JButton btnAceptarInsPers = new JButton("Aceptar");

		btnAceptarInsPers.setBounds(566, 448, 89, 23);
		inscActvPers.add(btnAceptarInsPers);

		JButton btnCancelarInsPers = new JButton("Cancelar");

		btnCancelarInsPers.setBounds(566, 507, 89, 23);
		inscActvPers.add(btnCancelarInsPers);

		textField_6 = new JTextField();
		textField_6.setEnabled(false);
		textField_6.setBounds(353, 508, 86, 20);
		inscActvPers.add(textField_6);
		textField_6.setColumns(10);

		JSeparator separator = new JSeparator();
		separator.setForeground(Color.LIGHT_GRAY);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(283, 36, 2, 485);
		inscActvPers.add(separator);

		JCheckBox checkRepresentante = new JCheckBox("");
		checkRepresentante.setBounds(502, 11, 21, 14);
		inscActvPers.add(checkRepresentante);

		if (checkRepresentante.isSelected()) {

		}

		JRadioButton rdbtnPersonaFisica = new JRadioButton("Persona Fisica");
		buttonGroup_4.add(rdbtnPersonaFisica);
		rdbtnPersonaFisica.setBounds(28, 546, 109, 23);
		inscActvPers.add(rdbtnPersonaFisica);

		JRadioButton rdbtnPersonaJuridica = new JRadioButton("Persona Juridica");
		buttonGroup_4.add(rdbtnPersonaJuridica);
		rdbtnPersonaJuridica.setBounds(139, 546, 125, 23);
		inscActvPers.add(rdbtnPersonaJuridica);
		panel_2.setLayout(gl_panel_2);

		JPanel inscActv = new JPanel();
		ArrVistas[2] = inscActv;
		Contenedor.add(inscActv, "name_29022094463246");

		JLabel lblNewLabel = new JLabel("Fotocopia de licencia de obra");
		lblNewLabel.setBounds(37, 38, 151, 14);

		JLabel lblNewLabel_1 = new JLabel("Justificante de pago");
		lblNewLabel_1.setBounds(37, 79, 139, 14);

		JLabel lblNewLabel_2 = new JLabel("Fotocopia de Escritura");
		lblNewLabel_2.setBounds(37, 120, 139, 14);

		JLabel lblNewLabel_3 = new JLabel("Fotocopia de modelo 36");
		lblNewLabel_3.setBounds(37, 161, 139, 14);

		JLabel lblNewLabel_4 = new JLabel("Planos");
		lblNewLabel_4.setBounds(37, 202, 139, 14);

		JLabel lblNewLabel_5 = new JLabel("CD");
		lblNewLabel_5.setBounds(37, 243, 139, 14);

		JLabel lblNewLabel_6 = new JLabel("Memoria");
		lblNewLabel_6.setBounds(37, 284, 139, 14);

		JLabel lblNewLabel_7 = new JLabel("Fotograf\u00EDa");
		lblNewLabel_7.setBounds(37, 325, 139, 14);

		JLabel lblNewLabel_8 = new JLabel("Tipo de suelo");
		lblNewLabel_8.setBounds(334, 37, 124, 14);

		JLabel lblNewLabel_9 = new JLabel("Emplazamiento");
		lblNewLabel_9.setBounds(334, 303, 124, 14);

		JLabel lblNewLabel_10 = new JLabel("Fecha de inicio");
		lblNewLabel_10.setBounds(334, 116, 124, 14);

		JLabel lblNewLabel_11 = new JLabel("Fecha de solicitud");
		lblNewLabel_11.setBounds(334, 78, 124, 14);

		JLabel lblNewLabel_12 = new JLabel("Referencia catastral");
		lblNewLabel_12.setBounds(334, 265, 124, 14);

		JLabel lblNewLabel_13 = new JLabel("Local");
		lblNewLabel_13.setBounds(334, 151, 124, 14);

		JLabel lblNewLabel_14 = new JLabel("Tipo");
		lblNewLabel_14.setBounds(334, 189, 124, 14);

		JLabel lblNewLabel_15 = new JLabel("Cuota");
		lblNewLabel_15.setBounds(334, 227, 129, 14);

		JLabel lblNewLabel_16 = new JLabel("Descripci\u00F3n");
		lblNewLabel_16.setBounds(334, 338, 124, 14);

		JLabel lblNewLabel_17 = new JLabel("Certificado del Colegio Oficial");
		lblNewLabel_17.setBounds(37, 489, 166, 14);

		JCheckBox chckFotocopiaLicenciaObra = new JCheckBox("Entregado");
		chckFotocopiaLicenciaObra.setBounds(209, 34, 98, 23);

		JCheckBox chckJustificantePago = new JCheckBox("Entregado");
		chckJustificantePago.setBounds(209, 75, 98, 23);

		JCheckBox chckFotocopiaEscritura = new JCheckBox("Entregado");
		chckFotocopiaEscritura.setBounds(209, 116, 98, 23);

		JCheckBox chckFotocopiaModelo36 = new JCheckBox("Entregado");
		chckFotocopiaModelo36.setBounds(209, 157, 98, 23);

		JCheckBox chckPlanos = new JCheckBox("Entregado");
		chckPlanos.setBounds(209, 198, 98, 23);

		JCheckBox chckCD = new JCheckBox("Entregado");
		chckCD.setBounds(209, 239, 98, 23);

		JCheckBox chckMemoria = new JCheckBox("Entregado");
		chckMemoria.setBounds(209, 280, 98, 23);

		JCheckBox chckFotografia = new JCheckBox("Entregado");
		chckFotografia.setBounds(209, 321, 98, 23);

		JCheckBox chckCertificadoColegio = new JCheckBox("Entregado");
		chckCertificadoColegio.setBounds(209, 485, 98, 23);

		JDateChooser DCFechaSolicitud = new JDateChooser();
		DCFechaSolicitud.setBounds(473, 72, 146, 20);

		JDateChooser DCFechaInicio = new JDateChooser();
		DCFechaInicio.setBounds(473, 110, 146, 20);

		txtfLocal = new JTextField();
		txtfLocal.setBounds(473, 148, 146, 20);
		txtfLocal.setColumns(10);

		txtfTipo = new JTextField();
		txtfTipo.setBounds(473, 186, 146, 20);
		txtfTipo.setText("");
		txtfTipo.setColumns(10);

		txtfCuota = new JTextField();
		txtfCuota.setBounds(473, 224, 146, 20);
		txtfCuota.setText("");
		txtfCuota.setColumns(10);

		txtfReferenciaCatastral = new JTextField();
		txtfReferenciaCatastral.setBounds(473, 262, 146, 20);
		txtfReferenciaCatastral.setColumns(10);

		txtfEmplazamiento = new JTextField();
		txtfEmplazamiento.setBounds(473, 300, 146, 20);
		txtfEmplazamiento.setText("");
		txtfEmplazamiento.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(473, 338, 146, 61);

		JButton btnAceptarInsActv = new JButton("Aceptar");
		btnAceptarInsActv.setBounds(529, 449, 90, 23);

		JButton btnCancelarInsActv = new JButton("Cancelar");
		btnCancelarInsActv.setBounds(334, 449, 95, 23);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(473, 34, 74, 20);
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Urbano", "Rústico" }));

		JLabel lblNewLabel_18 = new JLabel("Fotocopia DNI/CIF/NIE");
		lblNewLabel_18.setBounds(37, 366, 139, 14);

		JCheckBox chckbxEntregado = new JCheckBox("Entregado");
		chckbxEntregado.setBounds(209, 362, 98, 23);

		JLabel lblCertificado = new JLabel("Certificado 1");
		lblCertificado.setBounds(37, 407, 139, 14);

		JCheckBox chckbxEntregado_1 = new JCheckBox("Entregado");
		chckbxEntregado_1.setBounds(209, 403, 98, 23);

		JLabel lblCertificado_1 = new JLabel("Certificado2");
		lblCertificado_1.setBounds(37, 453, 139, 14);

		JCheckBox chckbxEntregado_2 = new JCheckBox("Entregado");
		chckbxEntregado_2.setBounds(209, 449, 98, 23);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(313, 0, 2, 573);
		separator_1.setOrientation(SwingConstants.VERTICAL);

		JTextPane txtDescripcion = new JTextPane();
		scrollPane.setViewportView(txtDescripcion);
		inscActv.setLayout(null);
		inscActv.add(lblNewLabel_17);
		inscActv.add(chckCertificadoColegio);
		inscActv.add(lblNewLabel);
		inscActv.add(lblNewLabel_1);
		inscActv.add(lblNewLabel_2);
		inscActv.add(lblNewLabel_3);
		inscActv.add(lblNewLabel_4);
		inscActv.add(lblNewLabel_5);
		inscActv.add(lblNewLabel_6);
		inscActv.add(lblNewLabel_7);
		inscActv.add(lblNewLabel_18);
		inscActv.add(lblCertificado);
		inscActv.add(chckbxEntregado);
		inscActv.add(chckFotocopiaLicenciaObra);
		inscActv.add(chckJustificantePago);
		inscActv.add(chckFotocopiaEscritura);
		inscActv.add(chckPlanos);
		inscActv.add(chckCD);
		inscActv.add(chckMemoria);
		inscActv.add(chckFotocopiaModelo36);
		inscActv.add(chckFotografia);
		inscActv.add(chckbxEntregado_1);
		inscActv.add(lblCertificado_1);
		inscActv.add(chckbxEntregado_2);
		inscActv.add(separator_1);
		inscActv.add(lblNewLabel_11);
		inscActv.add(lblNewLabel_8);
		inscActv.add(lblNewLabel_10);
		inscActv.add(lblNewLabel_13);
		inscActv.add(lblNewLabel_14);
		inscActv.add(lblNewLabel_15);
		inscActv.add(lblNewLabel_12);
		inscActv.add(lblNewLabel_9);
		inscActv.add(lblNewLabel_16);
		inscActv.add(btnCancelarInsActv);
		inscActv.add(txtfLocal);
		inscActv.add(txtfTipo);
		inscActv.add(txtfCuota);
		inscActv.add(txtfReferenciaCatastral);
		inscActv.add(txtfEmplazamiento);
		inscActv.add(DCFechaInicio);
		inscActv.add(DCFechaSolicitud);
		inscActv.add(btnAceptarInsActv);
		inscActv.add(scrollPane);
		inscActv.add(comboBox);
		contentPane.setLayout(null);
		contentPane.add(btnConfiguracion);
		contentPane.add(panel_2);
		btnAceptarInsPers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblRutaDeAcceso.setText("Inscribir Actividad");
				controlador.cambioPantalla(inscActv);
			}
		});
		btnCancelarInsActv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controlador.cambioPantalla(inscActvPers);
			}
		});

	}

	public void clear_Table() {
		for (int i = 0; i < table.getRowCount(); i++) {
			DefaultTableModel dm = (DefaultTableModel) table.getModel();
			dm.removeRow(i);
			i -= 1;
		}
	}

	public String getNIFBusquedaPJ() {
		return NIFBusquedaPJ.getText();
	}

	public String getTxtfActBusqueda() {
		return txtfActBusqueda.getText();
	}

	public void RellenarTabla(Object[][] aaa) {
		Object[][] resultados = (Object[][]) aaa;
		table.setModel(new DefaultTableModel(resultados,
				new String[] { "NºRegistro", "Nombre", "Apellido", "Licencia", "CIF" }));
	}

	public void setDatosTabla() {
		Object[][] tabla = modelo2.getTabla();
		this.RellenarTabla(tabla);

	}
}
