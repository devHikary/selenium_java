# Selenium: Testes automatizados de aceitação em Java

Curso da plataforma Alura

Instrutor: **Rodrigo Ferreira**

[Selenium com Testes Automatizados em Java nos Cursos da Alura](https://cursos.alura.com.br/course/selenium-testes-automatizados-aceitacao-java)

Neste curso foi desenvolvido testes de aceitação utilizando a API do Selenium WebDriver e o padrão Page Objects para testar uma aplicação Java em Maven.

## 🛠️ Abrir e rodar o projeto

- Clonar o projeto
- Pelo Eclipse, importar o projeto Maven
- Rodar a aplicação → Run as: Java Application
- Para rodar os testes → Run as: JUnit Test

## 🗒️ Tópicos da aula

### Aula 1

- Existem diversos módulos do Selenium, dentre eles o WebDriver;
- Aprendemos como adicionar o Selenium WebDriver no projeto, como um dependendência do Maven;
- Aprendemos a adicionar o Driver do navegador em nosso projeto;
- Aprendemos a escrever um código de teste que abre uma janela do navegador e navega para uma página, utilizando a API do selenium WebDriver.

### Aula 2

- Que é possível recuperar elementos na página utilizando o método `findElement()`;
- Que é possível recuperar o código fonte da página utilizando o método `getPageSource()`;
- Que é possível recuperar o url atual do browser utilizando o método `getCurrentUrl()`;
- Que devemos utilizar o método `sendKeys()` para enviar textos para os `inputs` da página;
- Que uma das maneiras de submeter um formulário é via método `submit()`.

### Aula 3

- O que é o padrão Page Object;
- As vantagens de se utilizar o padrão Page Object;
- Como implementar o padrão Page Object com classes Java.

### Aula 4

- Que o método `findElement()` devolve um objeto do tipo `WebElement`;
- Que não devemos enviar `null` pelo método `sendKeys()` ao testar campos vazios;
- Que um objeto Page Object pode devolver outro Page Object quando ocorre uma navegação entre páginas;
- Que podemos reaproveitar o objeto `WebDriver` entre diferentes objetos Page Object;
- Que podemos recuperar um elemento na página a partir de outro elemento;
- Que podemos utilizar herança, design patterns, dentre outras práticas para organizar os códigos de testes da aplicação.

### Aula 5

- Que alguns testes podem falhar quando a aplicação utilizar códigos JavaScript, como por exemplo em chamadas AJAX;
- Que é possível configurar diferentes Timeouts na API do WebDriver;
- As boas práticas recomendadas no Guideline do Selenium WebDriver.
