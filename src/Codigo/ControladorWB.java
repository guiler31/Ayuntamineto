package Codigo;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.lang.reflect.Array;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ControladorWB extends JFrame implements Controlador {
	private Modelo modelo;
	private ModeloBBDD modelo2;
	private ModeloFicheroIni modeloFicheroIni;
	private VistaFicheroIni vistaFicheroIni;
	private VistaWB vista;
	private VistaAuxTabla vista2;
	private JPanel contentPane;
	private JPanel ArrVistas[];

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public void setModelo2(Modelo modelo) {
		this.modelo2 = (ModeloBBDD) modelo;
	}

	public void setModelo3(Modelo modelo) {
		this.modeloFicheroIni = (ModeloFicheroIni) modelo;
	}

	public void setVista(Vista vista) {
		this.vista = (VistaWB) vista;
	}

	public void setVistaFichero(Vista vista) {
		this.vistaFicheroIni = (VistaFicheroIni) vista;
	}

	public void setPanels(JPanel[] aux) {
		this.ArrVistas = aux;
	}

	public void cambioPantalla(JPanel pantallaNueva) {
		if (pantallaNueva.isVisible() == false) {
			pantallaNueva.setVisible(true);
			for (int i = 0; i < ArrVistas.length; i++) {
				if (!(ArrVistas[i] == pantallaNueva)) {
					ArrVistas[i].setVisible(false);
				}
			}

		}
	}

	public void nuevaPantalla() {
		VistaAuxTabla vistaTabla = new VistaAuxTabla();
		vistaTabla.setControlador(this);
		vistaTabla.setModelo(modelo);
		vistaTabla.setVisible(true);

	}

	public void GuardarDatos() {

		modeloFicheroIni.GuardarDatos(vistaFicheroIni.getTxtfBaseDatos(), vistaFicheroIni.getTxtfLogin(),
				vistaFicheroIni.getTxtfPassword(), vistaFicheroIni.getTxtfURL());
	}

	public void ventanaConfiguracion() {
		VistaFicheroIni vistaFichero = new VistaFicheroIni();
		vistaFichero.setControlador(this);
		vistaFichero.setModeloFich(modeloFicheroIni);
		vistaFichero.setModeloBBDD(modelo2);
		modeloFicheroIni.setVista(vistaFichero);
		modeloFicheroIni.setDatos();
		setVistaFichero(vistaFichero);
		vistaFichero.setVisible(true);
	}

	public void refrescar() {

		modelo2.refrescar();
	}

	public void Modificar() {
		modeloFicheroIni.Modificar(vistaFicheroIni.getTxtfBaseDatosEnb(), vistaFicheroIni.getTxtfLoginEnb(),
				vistaFicheroIni.getTxtfPasswordEnb(), vistaFicheroIni.getTxtfURLEnb(), vistaFicheroIni.getBtnOk());
	}

}
