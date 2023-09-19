import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        boolean errorCheck = true;//while'a giriş bileti
        int base = 1;
        int exponent = 1; //base ve exponent'e ilk değer ataması yapmadığımda hata alırım.
        while (errorCheck) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number that will be the base for exponentiation: ");
            base = input.nextInt();

            if (base <= 0) {
                System.out.println("You can only enter positive integers!");
            } else {
                while (errorCheck) {
                    System.out.print("Enter the number that will be the exponent in exponentiation: ");
                    exponent = input.nextInt();

                    if (exponent <= 0) {
                        System.out.println("You can only enter positive integers for the exponent!");
                    } else {
                        errorCheck = false; //While'dan çıkış biletimiz.
                    }

                }

            }

        }

        //İstediğim girdiler pozitif tam sayı olmadığı sürece kod bu noktaya gelmeyecek!
        calculate(base, exponent); //fonkiyon çağırıldı chain reaction başladı :)
        System.out.println("Result: " + calculate(base, exponent));
    }

    //exponent 0 a eşitlenene kadar bellekte tutulan çarpma işlemine
    //base değeri eklenerek devam edecektir base*base....
    //exponent=0 olduğunda bellekteki işleme 1 eklenerek işlem sonucu döndürülür.
    //base*base*.....*1 şeklinde.
    public static int calculate(int base, int exponent) {
        if (exponent != 0) {
            //exponent-1=0 olana kadar burası dönecek
            return base * calculate(base, exponent - 1);
        } else
            //exponent=0 olduğu anda buraya girildi ve 1 döndü
            return 1;
    }
}
