package HackerRank;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Double valor = sc.nextDouble();

        NumberFormat currencyInstanceUS = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat currencyInstanceIndia = NumberFormat.getNumberInstance(new Locale("en", "IN"));
        currencyInstanceIndia.setMinimumFractionDigits(2);
        currencyInstanceIndia.setMaximumFractionDigits(2);
        NumberFormat currencyInstanceChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat currencyInstanceFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + currencyInstanceUS.format(valor));
        System.out.println("India: Rs." + currencyInstanceIndia.format(valor));
        System.out.println("China: " + currencyInstanceChina.format(valor));
        System.out.println("France: " + currencyInstanceFrance.format(valor));
    }
}
