package Java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double optimalSpeed = 60; // км/ч
        double maxAcceptableSpeed = optimalSpeed +20;// км/ч
        double criminalSpeed = 180; // км/ч

        int sumFine = 500;
        System.out.println("Введите скорость автомобиля: ");
        double realSpeed = new Scanner(System.in).nextInt();

        if (realSpeed >= criminalSpeed) {
            System.out.println("Ваш штраф состовялет 5000руб и лишение водительских прав!");
        } else if (realSpeed > maxAcceptableSpeed) {
            double differenceSpeed = realSpeed - maxAcceptableSpeed;
            double stepFine = differenceSpeed / 20;
            int roundStepFine = 0;
            if (stepFine % 2 >0) {
                roundStepFine = (int) sumFine;
                roundStepFine++;
            } else if ((int) stepFine == 0) {
                roundStepFine = 1;
            }

            System.out.println("На " + stepFine + "шагов данный автомобиль превысил скорость!");
        } else {
            System.out.println("Скорость не превышена :) ");
        }
    }
}