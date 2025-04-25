package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
// Categoria: Warmup
// Linguagem: Java

public class JavaLoops2 {


    public static void main(String[] args) throws Exception {
        ArrayList<Values> valuesArrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> resultado = new ArrayList<>();
        int q = sc.nextInt();
        int a;
        int b;
        int n;

        for (int j = 0; j < q; j++) {
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            valuesArrayList.add(new Values(a, b, n));
        }

        for (int i = 0; i < valuesArrayList.size(); i++) {
            Double result = Double.valueOf(valuesArrayList.get(i).getA());
            int bfinal = valuesArrayList.get(i).getB();
            int nFinal = valuesArrayList.get(i).getN();

            resultado.clear();
            for (int x = 0; x <= nFinal - 1; x++) {
                result += (Math.pow(2, x) * bfinal);
                resultado.add(result.intValue());
            }
            resultado.forEach(value -> System.out.print(value + " "));
            System.out.println();
        }
    }

    public static class Values {
        int a;
        int b;
        int n;

        public Values(int a, int b, int n) {
            this.a = a;
            this.b = b;
            this.n = n;
        }

        public Values() {

        }

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }

        public int getN() {
            return n;
        }

        public void setN(int n) {
            this.n = n;
        }
    }
}