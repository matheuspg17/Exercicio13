# Exercicio13

## Descrição do problema e solução
A prefeitura de Florianópolis abriu uma linha de crédito para os funcionários
estatutários. O valor máximo da prestação não poderá ultrapassar 30% do salário bruto.
Sabendo disso foi escrito um algoritmo que permita entrar com o salário bruto e o
valor da prestação e informar se o empréstimo pode ou não ser concedido.

## Como Funciona
1. O usuário digita o **salário bruto** e o **valor da prestação**.
2. O código calcula 30% do valor do salário (`salário * 0.3`).
3. Uma estrutura condicional (`if/else`) verifica o limite:
   - Se for menor ou igual a 30%: **Empréstimo concedido**.
   - Se for maior: **Empréstimo não concedido**.
