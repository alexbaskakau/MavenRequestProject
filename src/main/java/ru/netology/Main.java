package ru.netology;


public class Main {
    public static void main(String[] args) {
        Post data = new Post();

        data.name = "Семён";
        data.surname = "Семёнов";
        data.patronymic = "Семёнович";
        data.phone = "+7(333)333-33-33";
        data.passport = "4444 N 4444444";
        data.subscription = true;
        data.birthday = new FormDate();
        data.birthday.day = 13;
        data.birthday.month = 12;
        data.birthday.year = 1999;


        System.out.println(data.birthday.day);
    }
}

