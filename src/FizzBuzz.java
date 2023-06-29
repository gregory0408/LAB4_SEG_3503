/*
 * FIzzbuzz est un jeu ou si l'utilisateur entre un chifre/nombre divisible par 3
 * il recoit le message fizz, s'il recoit un nombre divisiblpar 5 il recoit le message buzz
 * et s'il recoit un chiffre/nombre divisible par 3 et par 5, il recoit un message fizzbuzz
 *
 */

public class FizzBuzz {
    public FizzBuzz(){

    }

    public static String run(int nombre) {
        if (nombre % 3 == 0) {
            return "Fizz";
        }
        if (nombre % 5 == 0) {
            return "Buzz";
        }
        return null;
    }
}
