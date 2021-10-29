public class Primes {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) //проверка, является ли число простым
                System.out.print(i + " ");
        }
    }

    public static boolean isPrime(int n) { //метод для определения простого числа
        for (int i = 2; i < n; i++) {
            if (n % i == 0) //если число делится без остатка, то оно не является простым
                return false;
        }
        return true; //возврат простых чисел, не прошедших проверку
    }
}
