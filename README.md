# exercicio-listatercA

Exercicio A:

1º: Gerar as Filas Prim e Sec, conforme dito no exercicio

2º: Criar a fila Terc

3º: Enquanto a lista Prim não estiver vazia (while(!Prim.isEmpty());), realizar a seguinte operação

- Adicionar o valor de Prim(indice 0) no Terc, e em uma posição monitorada por uma variavel auxiliar (variavel tamanho, inicializada em 0)

- Remover o primeiro nó da lista Prim

- Somar mais um a variavel auxiliar (tamanho++;)

4º: Após a operação estiver finalizada, repetir a operação acima usando a lista Sec

5º: Ao fim das operações, a lista Terc deve estar composta pelos valores de Prim, e em sequencia, Sec




Exercicio B:




1º: Gerar um vetor auxiliar

2º: Enquanto a lista Terc não estiver vazia (assumindo que a lista Terc recebeu as listas Prim e Sec, conforme o exercicio A), realizar a seguinte operação

(reutilizar a variavel tamanho, com seu valor novamente inicalizado em 0)

- Vetor auxiliar de indice (tamanho) recebe Terc no nó de indice 0

- Remove o primeiro nó de Terc

- Somar mais um a variavel tamanho (tamanho++;)

3º: Realizar uma operação de ordenação do vetor Auxiliar, do menor ao maior(algoritmo utilizado no exercício: Bubble Sort)

4º: Reinicializar a variavel tamanho a 0;

5º: Para inserir o vetor ordenado novamente a lista Terc, realizar a seguinte operação:

- Para cada (int indice) em auxiliar(vetor):

- Adicionar o valor de (int indice) em Terc, na posição monitorada pela variavel tamanho

- Somar mais um a variavel auxiliar

6º: Para verificar a lista ordenada a partir do console, realizar a seguinte operação:

- Enquanto a lista Terc não estiver vazia...

- Fazer o print de Terc, no indice 0

- Remover o primeiro nó de Terc



