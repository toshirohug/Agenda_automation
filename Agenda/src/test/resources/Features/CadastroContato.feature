#language: pt
#autor: hugotoshirosato@gmail.com


Funcionalidade: Incluir um novo agendamento

  	@smoke
  	Esquema do Cenario: O usuario e capaz de realizar o cadastro de um agendamento
  	
    Dado que o usuario esteja no "http://localhost:8080/"
    Quando usuario faz o cadastro do agendamento
    Entao ele ira cadastrar com <Nome> e <Telefone>
				
		Exemplos: 	
      | Nome    | Telefone    |
      | Toshiro | 31992001080 |
		
		
    @dup
    Esquema do Cenario: Contato duplicado
  	
    Dado que o usuario esteja no "http://localhost:8080/"
    Quando usuario faz o cadastro do agendamento
    Entao ele ira cadastrar com <Nome> e <Telefone>
    Mas so pode existir um contato dessa pessoa em questao
    
    Exemplos: 	
      | Nome    | Telefone    |
      | Toshiro | 31992001080 |
