package com.company.task3;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public Phone() {
    }
    public Phone(String number, String model) {
        this();
        this.number = number;
        this.model = model;
    }
    public Phone(String number, String model, int weight) {
        this(number, model);
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }
    public void receiveCall(String name, String number){
        System.out.println("Звонит " + name + ", номер телефона: " + number);
    }
    public void sendMessage(String ... number){
        System.out.println("Список номеров телефонов, которым будет отправлено сообщение:");
        for (String s : number) {
            System.out.println(s);
        }
    }

}
