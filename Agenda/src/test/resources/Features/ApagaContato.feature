#language: pt
#autor: hugotoshirosato@gmail.com


Funcionalidade: Apagar um contato da agenda
		
		@Before @After
  	Esquema do Cenario: O usuario deseja apagar um contato da agenda
  	
    Dado que o usuario esteja no "http://localhost:8080/" e queira excluir um contato
    Entao ele apaga o <Contato> da lista de contatos
    
    Exemplos: 	
      | Contato    |
      | Toshiro 	 |