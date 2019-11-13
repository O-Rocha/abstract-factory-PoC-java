package fabricas;

import produtos.Botao;
import produtos.BotaoLinux;
import produtos.Janela;
import produtos.JanelaLinux;

public class InterfaceLinuxFactory implements InterfaceFactory{

	public Botao criaBotao() {
		return new BotaoLinux();
		
	}
	
	public Janela criaJanela() {
		return new JanelaLinux();
		
	}

}