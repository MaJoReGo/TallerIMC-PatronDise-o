package controlador;

import clases.Logica;
import gui.VentanaPrincipal;


public class Controlador {

	private Logica miLogica;
	private VentanaPrincipal miVentanaPrincipal;
	
	public VentanaPrincipal getMiVentanaPrincipal() {
		return miVentanaPrincipal;
	}
	public void setMiVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {
		this.miVentanaPrincipal = miVentanaPrincipal;
	}
	public Logica getMiLogica() {
		return miLogica;
	}
	public void setMiLogica(Logica miLogica) {
		this.miLogica = miLogica;
	}


}

