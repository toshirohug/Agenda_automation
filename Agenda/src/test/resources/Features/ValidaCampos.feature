#language: pt
#autor: hugotoshirosato@gmail.com


Funcionalidade: Validar as regras dos campos do contato adicionado a agenda
		
		
  	Esquema do Cenario: O usuario deseja validar os campos do contato da agenda
  	
    Dado que o usuario esteja no "http://localhost:8080/" e queira excluir um contato
    Quando usuario faz o cadastro do agendamento
    Entao ele ira cadastrar com <Nome> e <Telefone>
		E validara os campos <Nome> e <Telefone>
		
				
		Exemplos: 	
      | Nome    | Telefone    |
      | Alberto | 88944556647 |
  