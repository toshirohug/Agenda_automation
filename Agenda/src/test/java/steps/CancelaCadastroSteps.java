package steps;

import io.cucumber.java.pt.Entao;

import org.openqa.selenium.support.PageFactory;
import pageObject.DesisteCadastroPageObject;
import elements.Uteis;
import utils.GeradorDriver;


public class CancelaCadastroSteps extends GeradorDriver{

	DesisteCadastroPageObject usuario = PageFactory.initElements(getDriver(), DesisteCadastroPageObject.class);
	Uteis usuariox = PageFactory.initElements(getDriver(), Uteis.class);
	
	@Entao("ele ira digitar o (.*) e (.*)$")
	public void ele_ira_digitar_o_Eduardo_e(String nome, String telefone) {
		usuario.aguarda();
		usuario.adicionaNovoContato(nome, telefone);
	}

	@Entao("ele resolve cancelar o cadastro sem ter os dados salvos na lista")
	public void ele_resolve_cancelar_o_cadastro_sem_ter_os_dados_salvos_na_lista() {
		usuario.aguarda();
		usuario.cancelaCadastroContato();
	}
}