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
import javax.swing.RowFilter;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
import javax.swing.table.TableRowSorter;
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
	private JTable table;
	private JButton btnConfiguracion;
	private JTextField txtnRegistro;
	private TableRowSorter trOrden;

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
		panel_2.setBounds(25, 11, 794, 684);
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
		lblRutaDeAcceso.setHorizontalAlignment(SwingConstants.LEFT);
		lblRutaDeAcceso.setText("Inscribir Licencia de Actividad");

		JPanel Contenedor = new JPanel();
		
		JButton btnAdd = new JButton("Nueva Solicitud");
		
		JButton btnUpdate = new JButton("Actualizar");

		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addComponent(Contenedor, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(lblRutaDeAcceso, GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnUpdate, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAdd)
						.addComponent(lblRutaDeAcceso, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnUpdate))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(Contenedor, GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		Contenedor.setLayout(new CardLayout(0, 0));

		JPanel VisualizarLicencias = new JPanel();
		Contenedor.add(VisualizarLicencias, "name_30680022169608");
		ArrVistas[0] = VisualizarLicencias;

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 181, 752, 437);

		table = new JTable() {
			private static final long serialVersionUID = 9082642090247275215L;

			public boolean isCellEditable(int row, int column) {
				return false;// you can set which column/row can be edited.
			}
		};
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Numero Registro", "Nombre", "Apellido", "Licencia", "CIF" }));
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					int selectedRowIndex = table.getSelectedRow();
					controlador.nuevaPantalla();
				}
			}
		});
		VisualizarLicencias.setLayout(null);

		table.setRowSelectionAllowed(true);
		table.setColumnSelectionAllowed(false);
		scrollPane_1.setViewportView(table);
		VisualizarLicencias.add(scrollPane_1);
		
		JLabel label = new JLabel("");
		label.setBounds(10, 0, 160, 179);
		VisualizarLicencias.add(label);
		label.setIcon(new ImageIcon(VistaWB.class.getResource("/Codigo/newlogo.png")));
		
		JLabel lblHacerDobleClick = new JLabel("Recuerda: Hacer doble click sobre la tabla para editar datos.");
		lblHacerDobleClick.setBounds(180, 80, 460, 14);
		VisualizarLicencias.add(lblHacerDobleClick);
		
		JLabel lblBuscarPorNumero = new JLabel("Buscar por Numero de Registro");
		lblBuscarPorNumero.setBounds(180, 24, 292, 14);
		VisualizarLicencias.add(lblBuscarPorNumero);
		lblBuscarPorNumero.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		txtnRegistro = new JTextField();
		txtnRegistro.setBounds(180, 49, 292, 20);
		VisualizarLicencias.add(txtnRegistro);
		txtnRegistro.setColumns(10);
		txtnRegistro.addKeyListener(new KeyAdapter() {
	           @Override
	           public void keyTyped(KeyEvent arg0) {
	                  txtnRegistro.addKeyListener(new KeyAdapter() {
	                         public void keyReleased(final KeyEvent arg0) {
	                               filtroRegistro();
	                         }
	                  });
	                  trOrden = new TableRowSorter(table.getModel());
	                  table.setRowSorter(trOrden);
	           }
	    });
		panel_2.setLayout(gl_panel_2);
		contentPane.setLayout(null);
		contentPane.add(btnConfiguracion);
		contentPane.add(panel_2);
	}

	public void clear_Table() {
		for (int i = 0; i < table.getRowCount(); i++) {
			DefaultTableModel dm = (DefaultTableModel) table.getModel();
			dm.removeRow(i);
			i -= 1;
		}
	}

	public void RellenarTabla(Object[][] aaa) {
		Object[][] resultados = (Object[][]) aaa;
		table.setModel(new DefaultTableModel(resultados,
				new String[] { "Numero Registro", "Nombre", "Apellido", "Licencia", "CIF" }));
	}

	public void setDatosTabla() {
		Object[][] tabla = modelo2.getTabla();
		this.RellenarTabla(tabla);
	}
	
	public void filtroRegistro() {
    	trOrden.setRowFilter(RowFilter.regexFilter(txtnRegistro.getText(), 0));

    }
}

