package ru.job4j.loop;


public class CheckPrimeNumber {


    public static boolean check(int number) {

        boolean natNum = number > 1;
        for (int index = 2; index < number; index++) {
            if ((number % index) == 0) {
                natNum = false;
                break;
            }
        }
    return natNum;
    }
}
/*
public class CheckPrimeNumber {


    public static boolean check(int number) {

        boolean natNum = false;
        for (int index = 2; index <= number; index++) {


            if ((number % index) == 0) {
                if (number == index) {
                    natNum = true;
                    break;
                } else {
//                    natNum = false;
                    break;
                }

            }


        }
    return natNum;
    }
}
*/
