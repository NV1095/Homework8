import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nЗадача 1");

        int[] anInteger = new int[3];
        anInteger[0] = 1;
        anInteger[1] = 2;
        anInteger[2] = 3;

        double[] fractionalNumber = {1.57, 7.654, 9.986};

        int[] any = {50, 35, 24, 12, 85};


        System.out.println("\nЗадача 2");
        for (int i = 0; i < anInteger.length - 1; i++) {
            if (anInteger[i] != anInteger.length) {
                System.out.print(anInteger[i]+", ");
            }
        }
        System.out.print(anInteger.length);

        System.out.println();
        System.out.println(Arrays.toString(fractionalNumber));
        System.out.println(Arrays.toString(any));


        System.out.println("\nЗадача 3");
        for (int i = anInteger.length - 1; i >= 0; i--) {
            System.out.print(anInteger[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = fractionalNumber.length - 1; i >= 0; i--) {
            System.out.print(fractionalNumber[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        for (int i = any.length - 1; i >= 0; i--) {
            System.out.print(any[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println("\nЗадача 4");
        for (int i = 0; i < anInteger.length; i++) {
            if (anInteger[i] % 2 != 0) {
                anInteger[i]++;
            }
        }
        System.out.println(Arrays.toString(anInteger));


    }
}