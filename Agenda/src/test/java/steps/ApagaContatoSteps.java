package steps;

import org.openqa.selenium.support.PageFactory;

import elements.Uteis;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pageObject.CadastroPageObject;
import utils.GeradorDriver;

public class ApagaContatoSteps extends GeradorDriver{

	CadastroPageObject usuario = PageFactory.initElements(getDriver(), CadastroPageObject.class);
	Uteis usuariox = PageFactory.initElements(getDriver(), Uteis.class);
	
	@Before
	public void inicio () {
		
		System.out.println("Começando testes");
		
	}
	
	@Dado("que o usuario esteja no {string} e queira excluir um contato")
	public void que_o_usuario_esteja_no_e_queira_excluir_um_contato(String portal) {
		
		getDriver().get(portal);
	    System.out.println("Usuario esta na pagina de agendamento");
	}

	@Entao("ele apaga o (.*) da lista de contatos$")
	public void ele_apaga_o_Contato_da_lista_de_contatos(String contato) {
		
		usuariox.clicarBotaoTabela("Nome", contato, "Apagar", "table");
		
	}
	
	@After
	public void fecharBrowser() {
		
		getChromeDriver().quit();
		System.out.println("Finalizando");
		
	}
	
}
