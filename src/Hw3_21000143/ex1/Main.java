package Hw3_21000143.ex1;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            Complex[] cs = new Complex[n];
            for (int i = 0; i < cs.length; i++) {
                System.out.println("Enter the real part of the " + (i + 1) + "th complex number:");
                float real = scanner.nextFloat();
                System.out.println("Enter the image part of the " + (i + 1) + "th complex number:");
                float image = scanner.nextFloat();
                cs[i] = new Complex(real, image);
            }

            Complex sum=cs[0];
            for (int i = 1; i < cs.length; i++) {
                sum=sum.add(cs[i]);
            }
            System.out.println("sum of all complex number:"+sum);

            Complex product=cs[0];
            for (int i = 1; i < cs.length; i++) {
                product=product.time(cs[i]);
            }
            System.out.println("product of all complex number:"+product);

        }

}
