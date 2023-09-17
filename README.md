qa_java;

Проект по покрытию unit тестами с использованием параметризации

Описание

Версия Java 11.

Проект использует следующие библиотеки:

JUnit 4

Jacoco

Mockito

Покрытие Unit тестами 100%.

Запуск автотестов

Для запуска автотестов необходимо:

Скачать код

git clone https://github.com/Misteriya89/qa_java.git

Для создания отчета в Jacoco ввести команду

mvn clean verify

Структура проекта

.gitignore

pom.xml

README.md

```
src
-- main
|   |-- java
|   |   |-- com.example
|   |   |   |-- Animal.java
|   |   |   |-- Cat.java
|   |   |   |-- Feline.java
|   |   |   |-- Lion.java
|   |   |   |-- Predator.java
|   |-- resources
|   |   |-- read.me
|-- test
|   |-- java
|   |   |-- AnimalTest.java
|   |   |-- CatTest.java
|   |   |-- FelineTest.java
|   |   |-- LionMockTest.java
|   |   |-- LionParameterizedTest.java
|   |   |-- read.me
```