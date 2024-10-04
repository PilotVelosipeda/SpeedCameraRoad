package Java;

import java.util.Scanner;

public class MainTwo {
    public static void main(String[] args) {
        double optimalSpeed = 60; // км/ч
        double maxAcceptableSpeed = optimalSpeed + 20;// км/ч
        double criminalSpeed = 180; // км/ч

        int sumFine = 500;
        System.out.println("Введите скорость автомобиля: ");
        double realSpeed = new Scanner(System.in).nextInt();

        if (realSpeed >= criminalSpeed) {
            System.out.println("Ваш штраф состовялет 5000руб и лишение водительских прав!");

        } else if (realSpeed >= 60 && realSpeed <= 80) {
            System.out.println("Скорость не превышена :).");
        } else if (realSpeed >= 81 && realSpeed <= 100) {
            System.out.println("Вы привысели скорость, штраф 500руб.");
        } else if (realSpeed >= 101 && realSpeed <= 120) {
            System.out.println("Вы привысели скорость, штраф 1000руб.");
        }
    }
}