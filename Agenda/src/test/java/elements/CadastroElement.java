package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastroElement {

	@FindBy(css = ".btn")
	protected WebElement btnNovoContato;

	@FindBy(css = "input[placeholder='Nome']")
	protected WebElement contato; 
	
	@FindBy(css = "input[placeholder='Telefone']")
	protected WebElement telContato;
	
	@FindBy(xpath = "//*[@slot='modal-footer']/button[1]")
	protected WebElement btnSalvaContato;
	
	@FindBy(xpath = "//*[@slot='modal-footer']/button[2]")
	protected WebElement btnCancelaCadastro;
	
	@FindBy(xpath = "//*[@slot='modal-body']/span[1]")
	protected WebElement nomeDuplicado;
	
}
