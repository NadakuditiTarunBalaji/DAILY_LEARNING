import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat usFormat =NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat Chinaf =NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat Francef =NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat Indiaf = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        String us =usFormat.format(payment);
        String china =Chinaf.format(payment);
        String france =Francef.format(payment);
        String india =Indiaf.format(payment);
        System.out.println("Us: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
