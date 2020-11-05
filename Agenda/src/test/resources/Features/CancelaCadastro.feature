#language: pt
#autor: hugotoshirosato@gmail.com


Funcionalidade: Cancelar o cadastro iniciado de um contato na agenda

  	Cenario: O usuario desiste de realizar a inclusao de um agendamento e cancela o cadastro antes de salvar
  	
    Dado que o usuario esteja no "http://localhost:8080/"
    Quando usuario faz o cadastro do agendamento
    Entao ele ira digitar o Eduardo e 3198774563
    Mas ele resolve cancelar o cadastro sem ter os dados salvos na lista