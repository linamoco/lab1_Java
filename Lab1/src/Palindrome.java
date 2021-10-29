import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Введите слово:"); //запрос на ввод слова
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine(); //считывание строки
        String delimiter = " "; //разделитель
        String [] str = s.split(delimiter); //разделение строки и запись в массив
        for (int i = 0; i < str.length; i++) {
            if (isPalindrome(str[i])) //проверка, является ли слово палиндромом
                System.out.println(str[i] + " " + "является палиндромом");
            else
                System.out.println(str[i] + " " + "не является палиндромом");
        }
    }

    public static String reverseString(String str) { //метод для изменения символов в строке
        String revstr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            revstr += str.charAt(i); //перестановка символа по указанному индексу
        }
        return revstr;
    }

    public static boolean isPalindrome(String str) {
        return str.equals(reverseString(str)); //сравнение первоначального и измененного слова
    }
}
