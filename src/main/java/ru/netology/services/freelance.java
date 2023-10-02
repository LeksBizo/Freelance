package ru.netology.services;

public class freelance {

    public int calculate (int income,int expenses,int threshold) {
    int money = 0;
    int counter = 0;
    for (int i = 0; i < 12; i++) {
        if (money >= threshold){
            //Фрилансер ушел в отпуск
            money = money - expenses;
            money = money / 3;
            counter = counter +1;
        }else{
            //Фрилансер работает
            money = money + income;
            money = money - expenses;
        }
    }
    return counter;
    }

}
