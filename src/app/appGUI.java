package app;

import fabricas.InterfaceFactory;
import produtos.Botao;
import produtos.Janela;

public class appGUI {
	
	private Botao botao;
	private Janela janela;
	
	public appGUI (InterfaceFactory fabrica) {
		this.botao = fabrica.criaBotao();
		this.janela = fabrica.criaJanela();
	}
	
	public void print() {
		this.botao.print();
		this.janela.print();
	}
	
	public Botao getBotao() {
		return botao;
	}
	public void setBotao(Botao botao) {
		this.botao = botao;
	}
	public Janela getJanela() {
		return janela;
	}
	public void setJanela(Janela janela) {
		this.janela = janela;
	}
	
	

}