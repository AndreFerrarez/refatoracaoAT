# Projeto de Refatoração em Java

Este projeto reúne exemplos de boas práticas de refatoração de código em Java, focando em clareza, modularidade, encapsulamento e uso de padrões de projeto. Cada módulo demonstra uma técnica específica de refatoração aplicada a trechos de código legados.

## Conteúdo

1. **ClassificationService**

    * Refatoração de código de classificação de valores.
    * Uso de nomes semânticos, extração de métodos e testes automatizados.
2. **Invoice**

    * Eliminação de *primitive obsession* usando `enum`.
    * Encapsulamento de lógica de negócios e extração de responsabilidades.
3. **PriceCalculator**

    * Melhorias de legibilidade com `enum` para tipos de cliente.
    * Separação de lógica em métodos auxiliares.
4. **User & Address**

    * Aplicação de encapsulamento de campos.
    * Introdução de objeto de domínio `Address`.
    * Controle de acesso à coleção de endereços.
5. **NotificationService**

    * Substituição de condicionais encadeadas por polimorfismo.
    * Interface `Notifier` e implementações específicas para cada canal.
6. **Document Hierarchy**

    * Substituição de códigos de tipo por hierarquia de classes.
    * Demonstração de polimorfismo com `Document` abstrata e subclasses.

## Tecnologias e Ferramentas

* **Java 11+**
* **Maven** (ou Gradle) para gerenciamento de dependências e build
* **JUnit 5** para testes automatizados
* **IntelliJ IDEA** no Windows para desenvolvimento
* **Git & GitHub** para versionamento e colaboração

refatoracaoAT/
├── .gitignore
├── pom.xml
├── README.md
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com.refactoring/
│   │           ├── Etapa1/
│   │           │   └── ClassificationService.java
│   │           ├── Etapa2/
│   │           │   ├── EmailSender.java
│   │           │   ├── Invoice.java
│   │           │   └── InvoiceType.java
│   │           ├── Etapa3/
│   │           │   ├── CustomerType.java
│   │           │   └── PriceCalculator.java
│   │           ├── Etapa4/
│   │           │   ├── Address.java
│   │           │   └── User.java
│   │           ├── Etapa5/
│   │           │   ├── Notifier.java
│   │           │   ├── EmailNotifier.java
│   │           │   ├── SmsNotifier.java
│   │           │   ├── PushNotifier.java
│   │           │   └── NotificationService.java
│   │           └── Etapa6/
│   │               ├── Document.java
│   │               ├── DocumentDemo.java
│   │               ├── HtmlDocument.java
│   │               ├── PdfDocument.java
│   │               └── TextDocument.java
│   └── test/
│       └── java/
│           └── com.refactoring.Etapa1/
│               └── ClassificationServiceTest.java
└── target/
└── ...

## Como Executar

1. Clone este repositório:

   ```bash
   git clone https://github.com/AndreFerrarez/refatoracaoAT.git
   
2. Compile e execute testes:

   ```bash
   mvn clean test
   ```
3. Importe o projeto no IntelliJ IDEA e explore os módulos.


