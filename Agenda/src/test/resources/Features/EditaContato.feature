#language: pt
#autor: hugotoshirosato@gmail.com


Funcionalidade: Editar um contato da agenda
		
		Esquema do Cenario: O usuario deseja apagar um contato da agenda
  	
    Dado que o usuario esteja no "http://localhost:8080/"
    Quando ele seleciona o <Contato> que deseja editar
    Entao ele visualiza os dados disponíveis pra edição
    
    Exemplos: 	
      | Contato    |
      | Toshiro 	 |