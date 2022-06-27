Algoritmo "ATIVIDADE-INDIVIDUAL"

Var
   cadastrado,i,c,qntCliente,item:inteiro
   possuiCa,usuario,naoPossuiCa,cliente:caractere
   //destinos: vetor[1..5] de caractere
   cadClientes: vetor[1..2,1..4] de caractere
   destino:vetor[1..4]de caractere

Inicio
   destino[1] <- "sao paulo"
   destino[2] <- "salvador"
   destino[3] <- "Rio de Janeiro"
   destino[4] <- "Maceio"

   /////


   escreval("----------------------SEJA BEM VINDO AO MM's---------------------")
   escreval("Siga a Ordem para um bom funcionamento do Programa :)")
   escreval("")
   escreval("")
   //cadastro//

   enquanto verdadeiro faca
      escreval("---Menu de opções----")
      escreval("1-para se cadastrar")
      escreval("2-para cadastrar o destino")
      escreval("3-para consultar cadastro")
      escreval("4-para consultar destinos disponiveis")
      escreval("ESC-para Sair")

      leia(item)
      limpatela
      //  opção 1  //
      se item = 1 entao
         escreval("maximo de cadastros : 2")
         escreval("quantos pessoas deseja cadastrar ?")

         leia(qntCliente)
         limpatela

         para i de 1 ate qntCliente faca
            escreval("digite RESPECTIVAMENTE :")
            escreval("")
            escreval("Nome")
            escreval("endereço:")
            para c de 1  ate 2 faca

               leia (cadClientes[i,c])
            fimpara
            limpatela
         fimpara
         se qntCliente = 1 entao
            escreval("cliente cadastrado!")
           senao
            escreval("clientes cadastrados!")
            fimse
         escreval("selecione a opçao 2 para cadastrar o destino")
      senao
       // opção 2 //
         se item = 2 entao
            escreval("Para essa semana temos Apenas 4 destinos :")
            para i <-1 ate 4 faca
               escreval(destino[i])
            fimpara

            para i <- 1 ate qntCliente faca
               para c <-3 ate 3  faca
                  leia(cadClientes[i,c])
               fimpara
            fimpara
            escreval("Destino selecionado!")

         senao
         // opção 3 //
            se item = 3 entao
               escreval("Dados do cliente :")
               para i<-1 ate 2 faca
                  para c <-1 ate 4 faca
                     escreval(cadClientes[i,c])
                  fimpara
               fimpara
               
            senao
            // opção 4 //
               se item = 4 entao
                  escreval("quatro")
               senao
                  escreval("opção incorreta")
               fimse
            fimse
         fimse
      fimse

   fimenquanto


























   //consulta destinos//
   escreval("Para essa semana temos Apenas 4 destinos :")
   escreval("para confirmar um destino digite seu respectivo numero")
   escreval("Qual destino escolhe?")
   escreval("**MENU**")

   para i<-1 ate 4 faca
      escreval("*",i,"-",destinos[i]," ","R$350")
      escreva("")

   fimpara
   leia(lugar)
   se lugar = 1 entao
      escreval("São Paulo ")
   senao
      se lugar = 2 entao
         escreval("salvador")
      senao
         se lugar = 3 entao
            escreval("Rio de Janeiro")
         senao
            se lugar = 4 entao
               escreval("Maceio")

            fimse
         fimse
      fimse
   fimse

















   //para i<-1 ate 4 faca
   //escreval("digite o ",i ,"o. :")
   // leia(n[i])
   //fimpara
   //para i <- 1 ate 4 faca
   //   escreva(n[i])
   //fimpara

Fimalgoritmo