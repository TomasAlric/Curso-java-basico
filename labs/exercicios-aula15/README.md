# Exercícios da aula 14 - 15

1. Faça um programa que peça dois números e imprima o maior deles.

2. Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

3. Faça um programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: 

        F - Feminino, M - Masculino, Sexo Inválido.

4. Faça um programa que verifique se uma letra digitada é vogal ou consoante.

5. Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
 
        A mensagem "Aprovado", se a média alcançada for maior ou igual a sete

        A mensagem "Reprovado", se a média for menor do que sete
        
        A mensagem "Aprovado com Distinção", se a média for igual a dez
        
6. Faça um programa que leia três números e mostre o maior deles.

7. Faça um programa que leia três números e mostre o maior e o menor deles.

8. Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.

9. Faça um programa que leia três números e mostre-os em ordem decrescente.

10. Faça um programa que pergunte em que turno você estuda. Peça para digitar:

        M - Matutino, V - Vespertino ou N - Noturno
        
    Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme caso.

11. As organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver o programa que calculará os reajustes. Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:


        Salários até R$ 280,00 (incluindo) : aumento de 20%

        Salários entre R$ 280,00 e R$ 700,00 : aumento de 15%

        Salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
        
        Salários de R$ 1500,00 em diante : aumento de 5%
        
    Após o aumento ser realizado, informe na tela: 

        O salário antes do reajuste
        
        O percentual de aumento aplicado
        
        O valor do aumento
        
        O novo salário, após o aumento
        
12. Faça um programa para cálculo de uma folha de pagamento, sabendo que os descontos são do imposto de renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o sindicato e que o FGTS corresponde a 11% do salário bruto, mas não é descontado (é a empresa que deposita). O salário líquido corresponde ao salário bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.

        Desconto do IR
        Salário Bruto até 900 (inclusive) - isento
        Salário Bruto até 1500 (inclusive) - desconto de 5%
        Salário Bruto até 2500 (inclusive) - desconto de 10%
        Salário Bruto acima de 2500 - desconto de 20%
        
    O imprima na tela as informações dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.

        Salário Bruto: ( 5 * 20 ) : R$ 1100,00
        (-) IR (5%)               : R$ 55,00
        (-) INSS (10%)            : R$ 110,00
        FGTS (11%)                : R$ 121,00
        Total de descontos        : R$ 165,00
        Salário Líquido           : R$ 935,00
        

13. Faça um programa que leia um número e exiba o dia correspondente da semana.

        (1 - Domingo, 2 - Segunda, etc)

    Se digitar outro valor deve aparecer valor inválido.

14. Faça um programa que lê as duas notas parciais, obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:

        Média de Aproveitamento            Conceito
        Entre 9.0 e 10.0                      A
        Entre 7.5 e 9.0                       B
        Entre 6.0 e 7.5                       C
        Entre 4.0 e 6.0                       D
        Entre 4.0 e zero                      E
        
    O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem "APROVADO" se o conceito for A, B, C ou "REPROVADO", se o conceito for D ou E.

15. Faça um programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: 

        Equilátero, Isósceles ou Escaleno
        
16. Faça um programa que calcule as raizes de uma equação do segundo grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a, b, c e fazer as consistências, informando ao usuário nas seguintes situações:

        a. Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve pedir os demais valores, sendo encerrado
        
        b. Se o delta calculado for negativo, a equação não possui raízes reais. Informe ao usuário e encerre o programa
        
        c. Se o delta calculado for igual a zero a equação possui apenas uma raiz real, informe-a ao usuário
        
        d. Se o delta for positivo, a equação possui duas raízes reais, informe-as ao usuário
        
17. Faça um programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto.

18. Faça um programa que peça um número inteiro e determine se ele é par ou ímpar.

19. Faça um programa que leia 2 números e em seguida pergunte ao usuário qual operação realizar. O resultado da operação deve ser acompanhado de uma frase que diga se o número é:

        par ou ímpar
        
        positivo ou negativo
        
20. Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:

        a. "Telefonou para a vítima?"
        b. "Esteve no local do crime?"
        c. "Mora perto da vítima?"
        d. Devia para a vítima?"
        e. "Já trabalhou com a vítima?"
        
    O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve ser classificada como     "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".

21. Um posto está vendendo combustíveis com a seguinte tabela de descontos:

        Álcool:
        a. até 20 litros, desconto de 3% por litro
        b. acima de 20 litros, desconto de 5% por litro
        
        Gasolina:
        c. até 20 litros, desconto de 4% por litro
        d. acima de 20 litros, desconto de 6% por litro.
        
    Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A = álcool, G - Gasolina), calcule e imprima o valor a ser     pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.

22. Uma fruteira está vendendo frutas com a seguinte tabela de preços:

                     Até 5 Kg                Acima de 5 Kg
        Morango      R$ 2,50 por Kg          R$ 2,20 por Kg
        Maçã         R$ 1,80 por Kg          R$ 1,50 por Kg
        
    Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00 receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para     ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maçãs adquiridas e escreva o valor a ser pago pelo cliente.

23. O Hipermercado Tabajara está com uma promoção de carne que é imperdível. Confira:

                        
                    Até 5 Kg                Acima de 5 Kg
        Maminha     R$ 4,90 por Kg          R$ 5,80 por Kg
        Alcatra     R$ 5,90 por Kg          R$ 6,80 por Kg
        Picanha     R$ 6,90 por Kg          R$ 7,80 por Kg
                
    Para atender a todos os clientes, cada cliente poderá levar um dos tipos de carne da promoção, porém não há limites para a quantidade de carne por cliente. Se compra for     no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total da compra. Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e     gere um cupom fiscal, contendo as informações da compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar.        
        
        
        
