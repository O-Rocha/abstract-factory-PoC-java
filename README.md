# abstract-factory-PoC-java

A ideia desse repositório é fornecer uma prova de conceito do padrão Abstract Factory (Fábrica Abstrata)


# Download
Faça o clone do repositório para uma pasta no seu PC Usando CMD no Windows ou terminal do Linux/macOS execute o comando:

>git clone https://github.com/O-Rocha/abstract-factory-PoC-java.git

importe o projeto na sua IDE favorita

# O padrão

## intenção

Fornecer uma interface para criação de famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.

## Modelo de classes

![](/Images/Modelo.png)

## Aplicabilidade

- Um sistema deve ser independente de como seus produtos são criados compostos ou representados.
- Um sistema deve ser configurado como um produto de uma família de múltiplos produtos.
- Uma família de objetos-produto for projetada para ser necessáriamente usada em conjunto.
- Você quer fornecer uma biblioteca de classes de produtos e quer revelar somente suas interfaces, não suas implementações. 

## Consequências

- isola as classes concretas.
- torna fácil a troca de famílias de produtos.
- promove a harmonia entre os produtos.
- torna difícil de suportar novos tipos de produtos.

