import java.util.Scanner;

public class Proje15 {

    public static void main(String[] args){
        int heat;
        System.out.print("Hava sıcaklığı giriniz :");

        Scanner input = new Scanner(System.in);

        heat = input.nextInt();

        if(heat < 5 ) {
            System.out.print("Kayak yapabilirsiniz.");
        }else if( heat >= 5 && heat < 10) {
            System.out.print("Sinemaya gidebilirsiniz.");
        }else if(heat >= 10 && heat <15) {
            System.out.println("Sinemaya gidebilirsiniz.");
            System.out.print("Pikniğe gidebilirsiniz.");
        }else if(heat >=15 && heat <26){
            System.out.print("Pikniğe gidebilirsiniz.");
        }else if(heat >=26 && heat < 50){
            System.out.print("Yüzmeye gidebilirsiniz.");
        }else{
            System.out.print("Lütfen geçerli bir sıcaklık değeri giriniz.");
        }



    }

}
