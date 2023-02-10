import java.util.Scanner;
public class String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");
        java.lang.String texto = sc.nextLine();
        for (int i = 0; i < texto.length(); i++) {
            java.lang.String subtext=texto.substring(i,i+1);
            System.out.println("Sue cadena está compuesta por: " + subtext);
        }

    }
}
