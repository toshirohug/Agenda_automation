package elements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import utils.GeradorDriver;

public class Uteis extends GeradorDriver {
	
	/************** Valida após cadastrar contato *********************/
	
	public void validaNomeEmLista(String nomeSelecionavel, WebElement valorCss) {
		getDriver().findElement(By.cssSelector("table tbody"));
		List<WebElement> tabela = getDriver().findElements(By.linkText("Toshiro"));
	
		for (WebElement itemLista : tabela) {
			if (itemLista.getText().toLowerCase().equals(nomeSelecionavel.toLowerCase())) {
				
				break;
			}
			System.out.println("O contato"+ nomeSelecionavel + "foi adicionado a sua agenda com sucesso!");
		}
	}
	
	/************** Fluxo excluir contato *********************/
	
	public void clicarBotaoTabela(String colunaBusca, String valorNome, String colunaBotao, String tableClass){
		//procurar coluna do registro
		WebElement tabela = getDriver().findElement(By.cssSelector("table tbody"));
		int idColuna = obterIndiceColuna(colunaBusca, tabela);
		
		//encontrar a linha do registro
		int idLinha = obterIndiceLinha(valorNome, tabela, idColuna);
		
		//procurar coluna do botao
		int idColunaBotao = obterIndiceColuna(colunaBotao, tabela);
		
		//clicar no botao da celula encontrada
		int idLinhaComHeader = idLinha +1;
		WebElement celula = tabela.findElement(By.xpath(".//tr["+idLinhaComHeader+"]/td["+idColunaBotao+"]"));
		celula.click();
		//findElement(By.linkText("X")).click();
	}

	/*public void deveClicarBotaoTabela(){
		(String colunaBusca, String valor, String colunaBotao, String idTabela)
		dsl.clicarBotaoTabela("Nome", "Hugo", "Apagar", "table");
	}*/
	
	protected int obterIndiceLinha(String valor, WebElement tabela, int idColuna) {
		List<WebElement> linhas = tabela.findElements(By.xpath(".//tr/td["+idColuna+"]"));
		int idLinha = -1;
		for(int i = 0; i < linhas.size(); i++) {
			if(linhas.get(i).getText().equalsIgnoreCase(valor)) {
				idLinha = i+1;
				break;
			}
		}
		return idLinha;
	}

	protected int obterIndiceColuna(String coluna, WebElement tabela) {
		List<WebElement> colunas = tabela.findElements(By.xpath(".//th"));
		int idColuna = -1;
		for(int i = 0; i < colunas.size(); i++) {
			if(colunas.get(i).getText().equalsIgnoreCase(coluna)) {
				idColuna = i+1;
				break;
			}
		}
		return idColuna;
	}	
	

	
}