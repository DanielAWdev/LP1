Algoritmo "Media"
Var
   // Seção de Declarações das variáveis
   P1, E1, E2, X, SUB, API, EXF, Base, Media: real
Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva("Nota P1:")
   leia(P1)
   escreval("Nota E1:")
   leia(E1)
   escreval("Nota E2:")
   leia(E2)
   Escreval("Nota X:")
   leia(X)
   se X > 1 entao
   X <- 1
   fimse
   Escreval("Nota da prova substitutiva:")
   leia(SUB)
   Escreval("Nota da API:")
   leia(API)
   Escreval("Nota do Exame final:")
   leia(EXF)
   Base <- (P1 * 0.5) + (E1 * 0.2) + (E2 * 0.3) + (X + SUB * 0.15)
   se Base >= 5.9 entao
      Media <- (Base * 0.5) + (API * 0.5)
      Escreval(Media)
   senao
      se Base >= 4 entao
         Media <- EXF
         escreval(Media)
      senao
         Media <- (Base * 0.5)
         Escreval(Media)
         Escreval("Reprovado")
      fimse
   fimse
Fimalgoritmo
