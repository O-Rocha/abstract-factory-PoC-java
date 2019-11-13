package fabricas;

import produtos.Botao;
import produtos.BotaoWindows;
import produtos.Janela;
import produtos.JanelaWindows;

public class InterfaceWindowsFactory implements InterfaceFactory{

	
	public Botao criaBotao() {
		
		return new BotaoWindows();
	}

	
	public Janela criaJanela() {
		
		return new JanelaWindows();
	}

}