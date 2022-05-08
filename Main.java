package com.company;

public class Main {

    public static void main(String[] args) {
        again(39,20);
        again(20,10);
        again(15,-5);
        again(70,25);
        again(40,-20);
    }
    public static int again(int ageOfMan,int temperature) {

        if (ageOfMan > 20 && ageOfMan < 45 && temperature > -20 && temperature < 30) {
            System.out.println("You can go out");
        } else if (ageOfMan < 20 && temperature > 0 && temperature < 28) {
            System.out.println("You can go out");
        } else if (ageOfMan > 45 && temperature > -10 && temperature < 25) {
            System.out.println("You can go out");
        }
        else {
            System.out.println("Stay at home");}
        return ageOfMan;
    }
    }

