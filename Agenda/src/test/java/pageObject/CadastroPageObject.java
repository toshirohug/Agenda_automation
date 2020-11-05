package pageObject;

import org.junit.Assert;

import elements.CadastroElement;

public class CadastroPageObject extends CadastroElement{

	public void cadastraContato() {
		btnNovoContato.click();
	}	
	
	public void adicionaNovoContato(String nome, String telefone) {

		contato.sendKeys(nome);
		telContato.sendKeys(telefone);

		btnSalvaContato.click();
	}
	
	public void aguarda() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void verificaAlertDuplicidade() {

		String msgAlerta = nomeDuplicado.getText();
		String msgEsperada = "pessoa já existe.";
		Assert.assertEquals(msgAlerta.toLowerCase(), msgEsperada.toLowerCase());;
	}
}
