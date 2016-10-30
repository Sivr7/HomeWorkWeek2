package week2.homework.guess_number;

import java.util.Scanner;

/**
 * Created by Andriy on 23.09.2016.
 *
 * 6. Игра "Угадай число":
 Програма генерирует случайное, целое число в диапазоне от 25 до 125 (включительно).
 Пользователь пытается его угадать.
 Число попыток ограничено 5.
 Если пользователь ввел неверное число, программа дает подсказу (больше/меньше).
 Придумать разные варианты ответов, при отгадывании с первой попытки, нескольких попыток, в случае проигрыша.
 */
public class GuessNumber {
    public static void main(String[] args){

        int num = (int)(25 + Math.random() * (125 - 25 + 1));

        Scanner sc = new Scanner(System.in);

        System.out.println("Try to guess a number from 25 to 125.");
        System.out.println("Enter you number here:");

        int userNumber = sc.nextInt();
        int count = 1;
        while(userNumber != num && count < 5){
            if(userNumber < num){
                System.out.println("It's low. Try higher!");
            } else {System.out.println("It's high. Try lower!");}
            if(5 - count == 1) System.out.println(5 - count + " shot left.");
                else System.out.println(5 - count + " shots left.");
            userNumber = sc.nextInt();
            count++;
        }

        if(userNumber == num)
            switch(count){
                case 1: System.out.println("Bingo!!! You guessed!!! Perfect guess! One try and on target! :)");
                    break;
                case 2: System.out.println("Bingo!!! You guessed!!! Very Good! Second-try guess!");
                    break;
                case 3: System.out.println("Bingo!!! You guessed!!! Third try, not bad!");
                    break;
                case 4: System.out.println("Bingo!!! You guessed!!! Fourth try, not bad!");
                    break;
                case 5: System.out.println("Bingo!!! You guessed!!! Near to defeat but win! ;)");
                    break;
            }


        else System.out.println("Didn't guess! You used all your tries. Better luck next time!");

        System.out.println("And here is the number you tried to guess: " + num + " :)");




    }

}
