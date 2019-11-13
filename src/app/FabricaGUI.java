package app;

import fabricas.InterfaceFactory;
import fabricas.InterfaceLinuxFactory;
import fabricas.InterfaceWindowsFactory;

public class FabricaGUI {

	public static appGUI criaGUI (String tipo) {
		appGUI app;
		InterfaceFactory fabrica = null;
		
		if(tipo.equals("Linux")) {
			fabrica = new InterfaceLinuxFactory();
		}
		if(tipo.equals("Windows")){
			fabrica = new InterfaceWindowsFactory();
		}
		
		app = new appGUI(fabrica);
			
		return app;
	}

}