package fabricas;

import produtos.Botao;
import produtos.Janela;

public interface InterfaceFactory {
	
	Botao criaBotao();
	Janela criaJanela();

}