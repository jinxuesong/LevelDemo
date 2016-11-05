/**
 * Created by stephenue on 2016/11/5.
 */
public class StarDemo {
    public static void main(String[] args) {

        for (int j = 1; j < 6; j+=2) {
                for (int k = 0; k < 20-j; k+=2) {
                    System.out.print(" ");
            }for(int i=1;i<=j;i++) {
                System.out.print("*");
            }System.out.println("");
        }
        for(int i=1;i<6;i+=2){
            for (int j=2;j<i+1;j++){
                System.out.print(" ");
            }
            for (int k=1;k<24-2*i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i=1;i<6;i+=2){
            for (int j=1;j<9-i;j+=2){
                System.out.print(" ");
            }for (int k=1;k<8-i;k++){
                System.out.print("*");
            }for (int m=1;m<3*i-1;m++){
                System.out.print(" ");
            }for (int n=1;n<8-i;n++){
                System.out.print("*");
            }
            System.out.println("");

        }
          /*System.out.println("         *       ");
            System.out.println("        ***      ");
            System.out.println("       *****     ");
            System.out.println("*******************");
            System.out.println("  ***************  ");
            System.out.println("    ***********    ");
            System.out.println("   *****   *****    ");
            System.out.println("  ***         ***");
            System.out.println(" *               *");*/

              /*     *
                    ***
                   *****
            *******************
              ***************
                ***********
                ***** *****
                ****   ****
               ***       ***
               *           **/

    }
}
