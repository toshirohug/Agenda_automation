package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObject.CadastroPageObject;
import org.openqa.selenium.support.PageFactory;
import elements.Uteis;
import utils.GeradorDriver;

public class CadastroContatoSteps extends GeradorDriver{

	CadastroPageObject usuario = PageFactory.initElements(getDriver(), CadastroPageObject.class);
	Uteis usuariox = PageFactory.initElements(getDriver(), Uteis.class);
	
	@Before
	public void inicio () {
		
		System.out.println("Começando testes");
		
	}
	
	@Dado("que o usuario esteja no {string}")
	public void que_o_usuario_esteja_no(String portal) {
	    getDriver().get(portal);
	    
	    System.out.println("Usuario esta na pagina de agendamento");
	}

	@Quando("usuario faz o cadastro do agendamento")
	public void eu_faco_o_cadastro_do_agendamento() {
		
		usuario.cadastraContato();
	}

	@Entao("ele ira cadastrar com (.*) e (.*)$")
	public void ele_ira_cadastrar_com_toshiro_e(String nome, String telefone) {

		usuario.aguarda();
		usuario.adicionaNovoContato(nome, telefone);
	}
	
	/*@E("o sistema tera o (.*) cadastrado na lista$")
	public void o_sistema_exibira_o_toshiro_cadastrado_na_lista(String nome){
		
		usuario.aguarda();
		usuariox.validaNomeEmLista(nome, null);
	}*/
	
	@Entao("so pode existir um contato dessa pessoa em questao")
	public void so_pode_existir_um_contato_dessa_pessoa_em_questao() {
	    
		usuario.aguarda();
		usuario.verificaAlertDuplicidade();
		
	}
		
	@After
	public void fecharBrowser() {
		
		getChromeDriver().quit();
		
	}
	
}
