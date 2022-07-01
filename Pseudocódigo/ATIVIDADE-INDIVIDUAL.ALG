Algoritmo "ATIVIDADE-INDIVIDUAL"

Var
   i,c,qntCliente,item,lugar:inteiro
   cadClientes: vetor[1..2,1..4] de caractere
   destino:vetor[1..4]de caractere

Inicio
   destino[1] <- "saoo paulo"
   destino[2] <- "salvador"
   destino[3] <- "Rio de Janeiro"
   destino[4] <- "Maceio"
   /////
   escreval("----------------------SEJA BEM VINDO AO MM's---------------------")
   escreval("Siga a Ordem para um bom funcionamento do Programa :)")
   escreval("")
   escreval("")
   //Menu de cadastro//
   enquanto verdadeiro faca
      escreval("*** Menu ***")
      escreval("1-para consultar destinos disponiveis")
      escreval("2-para se cadastrar")
      escreval("3-para cadastrar o destino")
      escreval("4-para consultar cadastro")
      escreval("ESC-para Sair")

      leia(item)
      limpatela
      // op 1 -Mostra destinos disponiveis//
      se item = 1 entao
         para i <-1 ate 4 faca
            escreval(destino[i])
         fimpara
         //  op 2  -Captura a quantidade e dados de usuarios//
      senao
         se item = 2 entao
            escreval("maximo de cadastros : 2")
            escreval("quantos pessoas deseja cadastrar ?")
            leia(qntCliente)
            limpatela
            se qntCliente = 1 entao
               para i <- 1 ate qntCliente faca
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
               escreval("selecione a opcao 3 para cadastrar o destino")
            senao
               se qntCliente = 2 entao
                  para i <- 1 ate qntCliente faca
                     escreval("digite RESPECTIVAMENTE :")
                     escreval("dados do ",i,"o, Cliente")
                     escreval("")
                     escreval("Nome")
                     escreval("CPF:")
                     escreval("Data de Nascimento :  dd/mm/yyyy")
                     para c de 1  ate 3 faca
                        leia (cadClientes[i,c])
                     fimpara
                  fimpara
                  limpatela
                  escreval("selecione a opcao 2 para cadastrar o destino")
                  escreval("")
               senao
                  escreval("Permitido somente o cadastro de 2 pessoas")
                  escreval("")
               fimse
            fimse
            se qntCliente = 1 entao
               escreval("cliente cadastrado!")
            senao
               se qntCliente = 2 entao
                  escreval("clientes cadastrados!")
               fimse
            fimse
         senao
            // op 3 -Captura o destino//
            se item = 3 entao
               escreval("Para essa semana temos Apenas 4 destinos :")
               escreval("digite seu respectivo numero ")
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
               limpatela
               escreval("Destino selecionado!")
            senao
               // op 4 -Mostra todos os dados do cliente//
               se item = 4 entao
                  para i<-1 ate qntCliente faca
                     escreval("Dados do",i,"o. cliente :")
                     para c <-1 ate 4 faca
                        escreval(cadClientes[i,c])
                     fimpara
                     escreval("")
                  fimpara
               fimse
            fimse
         fimse
      fimse
   fimenquanto
Fimalgoritmo