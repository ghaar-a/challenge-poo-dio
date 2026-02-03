# Desafio: Aprendendo na Prática Programação Orientada a Objetos (POO) 🚀

[![Java](https://img.shields.io/badge/Java-11+-orange)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![DIO](https://img.shields.io/badge/DIO-Digital%20Innovation%20One-blue)](https://www.dio.me/)

**Desafio prático de Programação Orientada a Objetos** co-criado com a **Digital Innovation One (DIO)** e oferecido gratuitamente à comunidade Java.

O objetivo principal é aplicar na prática os **4 pilares da POO** (Abstração, Encapsulamento, Herança e Polimorfismo) através de um projeto realista: um sistema de gerenciamento de **Bootcamp** com cursos, mentorias e devs inscritos.

### 🎯 Objetivo do Desafio
Colocar em prática os conceitos fundamentais de Orientação a Objetos através da modelagem e implementação de um **Bootcamp** completo, simulando um domínio real do mercado de tecnologia.

### 🛠️ Pré-requisitos
- Conhecimento básico da sintaxe Java
- Java JDK 11 ou superior
- IDE recomendada: IntelliJ IDEA (Community ou Ultimate)
- Git instalado
- Conta no GitHub (para versionamento e portfólio)

### 👣 Passo a Passo do Projeto
1. Abstrair o domínio **Bootcamp** e modelar seus atributos e métodos principais
2. Criar e relacionar as classes: `Bootcamp`, `Curso`, `Mentoria` e `Dev`
3. Modelar atributos e métodos de cada classe específica
4. Aplicar os pilares da POO para tornar o código mais limpo, reutilizável e manutenível
5. Instanciar objetos e simular o fluxo completo de um bootcamp (inscrição, progresso, cálculo de XP)

### 📚 Paradigma de Programação Orientada a Objetos (POO)

A Orientação a Objetos é um paradigma que modela o mundo real através de **objetos** que interagem entre si, aproximando o código da realidade do problema.

#### Os 4 Pilares da POO

| Pilar          | Descrição                                                                 | Exemplo no Projeto                          |
|----------------|---------------------------------------------------------------------------|---------------------------------------------|
| **Abstração**  | Focar nos aspectos essenciais, ignorando detalhes irrelevantes           | Classe `Conteudo` abstrata com `calcularXp()` |
| **Encapsulamento** | Esconder detalhes de implementação, expondo apenas o necessário       | Atributos privados + getters/setters        |
| **Herança**    | Reutilizar código de uma classe base em classes derivadas                | `Curso` e `Mentoria` herdam de `Conteudo`   |
| **Polimorfismo** | Tratar objetos de classes diferentes de forma uniforme via interface ou superclasse | Lista de `Conteudo` aceita `Curso` e `Mentoria` |

### 🔑 Conceitos Fundamentais Utilizados

- **Domínio**: Camada de negócio (Bootcamp, Conteúdo, Dev)
- **Classe**: Molde para criar objetos (ex.: `Curso`, `Mentoria`)
- **Atributo**: Características do objeto (ex.: `titulo`, `cargaHoraria`)
- **Método**: Comportamentos (ex.: `inscreverDev()`, `calcularXp()`)
- **Objeto**: Instância concreta de uma classe (ex.: `Curso javaBasico = new Curso();`)
- **Instância**: Ato de criar um objeto com `new`

### 🧮 Linguagem de Programação × Paradigma

| Aspecto                  | Linguagem de Programação                          | Paradigma de Programação                     |
|--------------------------|---------------------------------------------------|----------------------------------------------|
| Definição                | Conjunto de instruções para controlar máquina     | Estilo/mentalidade de estruturar o código   |
| Exemplos                 | Java, Python, C++, JavaScript                     | Imperativo, Orientado a Objetos, Funcional   |
| Nível de abstração       | Alto (Java), Baixo (Assembly)                     | OO: classes/objetos; Funcional: funções puras|
| Classificação principal  | Compilada/Híbrida (Java) vs Interpretada (Python) | Imperativo vs Declarativo                    |

### Paradigmas Principais

- **Imperativo** — Descreve o "como" fazer (sequência de comandos)  
  → Subparadigmas: Estruturado, Concorrente, Orientado a Objetos (Java)

- **Declarativo** — Descreve o "o que" fazer (resultado desejado)  
  → Subparadigmas: Funcional (Haskell), Lógico (Prolog)

### Estrutura do Projeto
