/**
 * Created by stephenue on 2016/11/5.
 */
import java.math.BigInteger;
import java.util.Scanner;
public class JudgeDemo {
  public static void main(String []args){
      Scanner in = new Scanner(System.in);
      System.out.print("请输入一个整数N=：");
      long input=in.nextLong();
      long i,m=0,num=input;
      while(true){
          i = input%10;
          m =m*10+i;
          input /= 10;
          if(input==0) break;
      }
      if(m==num)System.out.println("是回文数字");
      else System.out.println("不是回文数字");
  }

}

