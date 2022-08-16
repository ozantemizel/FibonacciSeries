import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Fibonacci serisinin ilk kaç sayısını görmek istiyorsunz: ");
        int n= input.nextInt();
        int counter=0;
        int fiboNumber=0;
        int n1=0,n2=1;
        do {
            System.out.print(fiboNumber+" ");
            n1=n2;
            n2=fiboNumber;
            fiboNumber=n1+n2;
            counter++;
        }while (counter<=n);
    }
}
