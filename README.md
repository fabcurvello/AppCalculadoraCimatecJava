# App Calculadora (Cimatec, Java)

> Repositório didático: exercício prático de Android nativo com **Java**, desenvolvido e aplicado em sala de aula pelo Prof. Fabricio Curvello.

## Sobre o projeto

Calculadora com as quatro operações básicas, em que o usuário escolhe a operação em uma lista suspensa.

## Contexto acadêmico

Exercício aplicado em sala de aula na turma **Cimatec** de desenvolvimento mobile.

## Versão em Kotlin

Esta mesma aplicação também foi desenvolvida em **Kotlin**: [AppCalculadoraCimatecKotlin](https://github.com/fabcurvello/AppCalculadoraCimatecKotlin). Comparar as duas versões lado a lado ajuda a entender as diferenças de sintaxe entre Java e Kotlin no Android.

## O que o app faz

- Dois campos para digitar os números.
- Um `Spinner` para escolher a operação: adição, subtração, multiplicação ou divisão.
- Botão **Calcular** que mostra o resultado; divisão por zero retorna `NaN`.
- Validação de entrada: avisa quando algum campo está vazio ou inválido.

## Conceitos trabalhados em aula

- Componente `Spinner` (lista de opções)
- Separação da regra de negócio em uma classe própria (`Calculadora`)
- Estrutura de decisão múltipla (`switch` / `when`)
- Validação e conversão de dados de entrada
- Tratamento de exceções (`NumberFormatException`)

## Tecnologias

- **Java**
- **Android SDK** (Android Studio)
- **Gradle**
- `minSdk 27` / `compileSdk 34`

## Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/fabcurvello/AppCalculadoraCimatecJava.git
   ```
2. Abra a pasta no **Android Studio** e aguarde a sincronização do Gradle.
3. Execute em um emulador ou dispositivo físico com Android compatível com a API 27 ou superior.

## Autor

**Fabricio Curvello**: professor de desenvolvimento de software no SENAI-RJ (desde 1997) e em faculdades do grupo Ânima Educação (IBMR e UNA).

- GitHub: [github.com/fabcurvello](https://github.com/fabcurvello)
- LinkedIn: [linkedin.com/in/fabriciocurvello](https://www.linkedin.com/in/fabriciocurvello)
- YouTube: [@fabriciocurvello](https://www.youtube.com/@fabriciocurvello)
