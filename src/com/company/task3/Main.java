package com.company.task3;

public class Main {
    public static void main(String[] args) {
        Phone phoneOne = new Phone();
        Phone phoneTwo = new Phone("8-917-326-32-14","Honor");
        Phone phoneThree = new Phone("8-981-012-48-91","Apple",700);

        System.out.println(phoneOne.getNumber() + " " + phoneOne.getModel() +
                " " + phoneOne.getWeight());
        System.out.println(phoneTwo.getNumber() + " " + phoneTwo.getModel() +
                " " + phoneTwo.getWeight());
        System.out.println(phoneThree.getNumber() + " " + phoneThree.getModel() +
                " " + phoneThree.getWeight());

        phoneOne.receiveCall("Влад");
        phoneTwo.receiveCall("Стас");
        phoneThree.receiveCall("Паша");

        phoneOne.receiveCall("Саша","8-987-654-32-10");

        phoneOne.sendMessage("8-987-654-32-10");
        phoneOne.sendMessage("9-876-543-21-09", "1-234-567-89-01","8-921-294-24-58");

    }
}
