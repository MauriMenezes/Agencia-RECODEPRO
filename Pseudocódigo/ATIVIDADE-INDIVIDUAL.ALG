Algoritmo "ATIVIDADE-INDIVIDUAL"

Var
   i,c,qntCliente,item,lugar:inteiro
   possuiCa,usuario:caractere
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
      escreval("---Menu de opcoes----")
      escreval("1-para consultar destinos disponiveis")
      escreval("2-para se cadastrar")
      escreval("3-para cadastrar o destino")
      escreval("4-para consultar cadastro")

      escreval("ESC-para Sair")

      leia(item)
      limpatela
      // opcao 1 //
      se item = 1 entao
         para i <-1 ate 4 faca
            escreval(destino[i])
         fimpara

      fimse


      //  opcao 2  //
      se item = 2 entao
         escreval("maximo de cadastros : 2")
         escreval("quantos pessoas deseja cadastrar ?")

         leia(qntCliente)
         limpatela

         para i de 1 ate qntCliente faca
            escreval("digite RESPECTIVAMENTE :")
            escreval("")
            escreval("Nome")
            escreval("CPF:")
            escreval("Data de Nascimento :  dd/mm/yyyy")

            para c de 1  ate 3 faca

               leia (cadClientes[i,c])
            fimpara
         fimpara
         limpatela
         se qntCliente = 1 entao
            escreval("cliente cadastrado!")
         senao
            escreval("clientes cadastrados!")
         fimse
         escreval("selecione a opçao 2 para cadastrar o destino")
      senao
         // opcao 3 //
         se item = 3 entao
            escreval("Para essa semana temos Apenas 4 destinos :")
             escreval("digite seu respectivo número ")
             escreval("")
            para i <-1 ate 4 faca
               escreval(i," . para selecionar ", destino[i])
            fimpara
            leia(lugar)
            para i <- 1 ate qntCliente faca
               para c <-4 ate 4  faca
                  se lugar = 1 entao
                     cadClientes[i,c] <- destino[1]
                  senao
                     se lugar = 2 entao
                        cadClientes[i,c] <- destino[2]
                     senao
                        se lugar = 3 entao
                           cadClientes[i,c] <- destino[3]
                        senao
                           se lugar = 4 entao

                              cadClientes[i,c] <- destino[4]
                           fimse
                        fimse
                     fimse
                  fimse


               fimpara
            fimpara
            escreval("Destino selecionado!")

         senao
            // opcao 4 //
            se item = 4 entao
               escreval("Dados do cliente :")
               para i<-1 ate 2 faca
                  para c <-1 ate 4 faca
                     escreval(cadClientes[i,c])
                  fimpara
               fimpara

            fimse
         fimse
      fimse
   fimenquanto
Fimalgoritmo