# Java part4

## Boxing e unboxing

Em Java, os termos "boxing" e "unboxing" referem-se à conversão entre tipos primitivos e seus equivalentes de classes (tipos wrapper). Os tipos primitivos em Java são aqueles que representam valores simples, como int, float, double, etc. Os tipos wrapper são classes que fornecem uma forma de representar esses tipos primitivos como objetos. Os tipos wrapper correspondentes para alguns dos tipos primitivos incluem Integer, Float, Double, etc.

1. **Boxing:**
   - Boxing refere-se ao processo de converter um tipo primitivo em seu equivalente de classe (wrapper).
   - Isso é feito automaticamente pelo Java quando é necessário tratar um tipo primitivo como um objeto. Por exemplo, ao adicionar um valor int a uma coleção como uma ArrayList, o Java automaticamente "empacota" o valor int em um objeto Integer.

   Exemplo de boxing:
   ```java
   int primitiveInt = 42;
   Integer boxedInt = primitiveInt; // Boxing automático
   ```

2. **Unboxing:**
   - Unboxing é o processo inverso de boxing, onde um objeto wrapper é convertido de volta para seu tipo primitivo correspondente.
   - Isso também é feito automaticamente pelo Java quando um valor de wrapper é usado em um contexto que requer um tipo primitivo.

   Exemplo de unboxing:
   ```java
   Integer boxedInt = 42;
   int primitiveInt = boxedInt; // Unboxing automático
   ```

3. **Wrapper Classes:**
   - As classes wrapper são classes que encapsulam tipos primitivos em objetos. Elas fornecem métodos úteis para trabalhar com esses tipos primitivos como objetos.
   - Algumas das classes wrapper em Java incluem Integer, Float, Double, Boolean, etc.

   Exemplo de uso de wrapper class:
   ```java
   Integer num = 10; // Boxing automático
   int value = num.intValue(); // Unboxing manual
   ```

Em resumo, boxing e unboxing em Java referem-se à conversão automática entre tipos primitivos e suas classes wrapper correspondentes. Isso ajuda a simplificar o código quando você precisa trabalhar com tipos primitivos em contextos que requerem objetos, como coleções e APIs que aceitam apenas objetos.

## `for each`

O laço "for-each" em Java é uma construção de loop que facilita a iteração por elementos de uma coleção (como arrays, listas ou conjuntos) sem a necessidade de acompanhar explicitamente o índice ou o tamanho da coleção. Esse tipo de loop é especialmente útil quando você precisa percorrer todos os elementos de uma estrutura de dados.

A sintaxe do laço for-each é a seguinte:

```java
for (tipo elemento : colecao) {
    // Bloco de código a ser executado para cada elemento
}
```

Aqui estão os componentes do laço for-each:

- **tipo:** O tipo de dado dos elementos na coleção.
- **elemento:** Uma variável que representa o elemento atual durante a iteração.
- **colecao:** A coleção (array, lista, conjunto, etc.) através da qual você deseja iterar.

O laço for-each itera automaticamente sobre todos os elementos da coleção, um por vez, e executa o bloco de código associado a cada elemento.

Exemplo com um array de inteiros:

```java
int[] numeros = {1, 2, 3, 4, 5};

for (int numero : numeros) {
    System.out.println(numero);
}
```

Neste exemplo, a variável `numero` assume cada valor presente no array `numeros` a cada iteração do loop, eliminando a necessidade de gerenciar índices manualmente.

O laço for-each é mais conciso, legível e menos propenso a erros em comparação com o loop "for" tradicional ao iterar sobre coleções. Entretanto, ele não é apropriado quando você precisa modificar os elementos da coleção durante a iteração ou quando precisa acessar elementos usando índices específicos. Além disso, funciona apenas em coleções que implementam a interface `Iterable` (como arrays, listas e conjuntos).
