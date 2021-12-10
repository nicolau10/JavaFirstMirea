package ru.mirea.task2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Nicolau Oliveira", "nicolauoliveira@mail.ru", 'M'); // Объект author1 класса Author
        Author author2 = new Author("Dominos Jose", "josea@gmail.com", 'M'); // Объект author2 класса Author
        Author author3 = new Author("Sebastiao Pedro","sebastiao@icloud.com", 'F'); // Объект author3 класса Author

        System.out.println(author1); // Вывод информации об объекте author1
        System.out.println(author2); // Вывод информации об объекте author2
        System.out.println(author3); // Вывод информации об объекте author3
    }
}
