import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz : ");
        heat = input.nextInt();

        if(heat<5){
            System.out.println("kayak yapabilirsin");
        }else if(5<heat && 15>heat){
            System.out.println("sinemaya gidebilirsin");
        }else if(15<heat && 25>heat){
            System.out.println("pikniğe gidebilirsin");
        }else if(heat>25){
            System.out.println("yüzmeye gidebilirsin");
        }


    }
}
