import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Created by stephenue on 2016/11/4.
 */
public class ExchangeDemo {
    public static void main(String []args) {
        System.out.println("请输入一个小写字母");
        Scanner scanner= new Scanner(System.in);
        String word=scanner.next();
        System.out.println("将"+word+"转化为大写字母:  "+word.toUpperCase());

        System.out.println("请输入一个大写字母");
        Scanner scanner1= new Scanner(System.in);
        String word1=scanner.next();
        System.out.println("将"+word1+"转化为小写字母:  "+word1.toLowerCase());

    }

}
