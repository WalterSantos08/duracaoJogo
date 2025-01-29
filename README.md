# Cálculo da Duração de um Jogo em Java ⏳

Este programa em Java calcula a duração de um jogo com base na hora de início e na hora de término fornecidas pelo usuário.

## 📝 Descrição

O programa:

1. Solicita ao usuário:
   - A hora de início do jogo.
   - A hora de término do jogo.
2. Calcula a duração do jogo considerando as seguintes regras:
   - Se o jogo começou e terminou no mesmo dia, a duração é `fim - início`.
   - Se o jogo passou da meia-noite, a duração é calculada corretamente para refletir o tempo total jogado.
3. Exibe a duração total do jogo em horas.

## 🚀 Como executar

1. Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) instalado em sua máquina.
2. Clone este repositório ou copie o código.
3. Compile o arquivo Java:
   ```bash
   javac duracaoJogo.java
   ```
4. Execute o programa:
   ```bash
   java duracaoJogo
   ```

## 🎮 Como usar

1. Ao executar o programa, insira a hora de início e a hora de término do jogo.
2. O programa calculará e exibirá a duração total do jogo.

### Exemplo

Entrada:
```
digite a hora do inicio:
14
digite a hora do fim:
18
```

Saída:
```
o jogo durou 4 hora(s).
```

Entrada:
```
digite a hora do inicio:
22
digite a hora do fim:
4
```

Saída:
```
o jogo durou 6 hora(s).
```

## 📂 Estrutura do código

O código é composto por:

- **Leitura da entrada do usuário**: Utiliza `Scanner` para capturar os valores de início e fim.
- **Cálculo da duração do jogo**: Se o jogo começou e terminou no mesmo dia, faz `fim - início`; se passou da meia-noite, ajusta o cálculo.
- **Exibição do resultado**: Informa a duração total do jogo.


---


