package pageObject;

import elements.CadastroElement;

public class DesisteCadastroPageObject extends CadastroElement{

	public void cadastraContato() {
		btnNovoContato.click();
	}	
	
	public void cancelaCadastroContato () {
		btnCancelaCadastro.click();
	}
	
	public void aguarda() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void adicionaNovoContato(String nome, String telefone) {

		contato.sendKeys(nome);
		telContato.sendKeys(telefone);
	}
}
