package ru.mirea.task2;

public class Author {
    private String name; // Имя
    private String email; // Эл. почта
    private char gender; // Пол

    public Author(String n, String e, char g){ // Конструктор
        name = n;
        email = e;
        gender = g;
    }

    public String getName() { // Получение имени
        return name;
    }

    public String getEmail() { // Получение эл. почты
        return email;
    }

    public void setEmail(String email) { // Ввод эл. почты
        this.email = email;
    }

    public char getGender() { // Получить пол
        return gender;
    }

    public String toString(){ // Вывод информации об объекте
        return this.name + "(" + this.gender + ") at " + this.email;
    }
}
