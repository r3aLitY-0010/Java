import java.util.Scanner;
public class NumToMmWord {
    static String[] chan1 = {"", " တစ်", " နှစ်", " သုံး", " လေး", " ငါး", " ခြောက်", " ခုနှစ်", " ရှစ်", " ကိုး"};
    static String[] chan2 = {"", " ဆယ့်", " ရာ", " ထောင်", " သောင်း", " သိန်း"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        do {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num >= 0 && num <= 1000000) {
                String numberText = changeM(num);
                System.out.println("In Myanmar words: " + numberText + " ကျပ်");
            } else {
                System.out.println("Invalid Number,Pls type again.");
            }

            System.out.print("Try again (y/n): ");
            input = sc.next();
        } while (input.equalsIgnoreCase("y"));

        sc.close();
        System.out.println("Thanks for using our app see ya!");
    }
    
    static String changeM(int num) {
        if (num < 10) {
            return chan1[num];
        } else if (num < 100) {
            int a = num / 10;
            int b = num % 10;
            return chan1[a] + chan2[1] + changeM(b);
        } else if (num < 1000) {
            int c = num / 100;
            int d = num % 100;
            return chan1[c] + chan2[2] + changeM(d);
        } else if (num < 10000) {
            int e = num / 1000;
            int f = num % 1000;
            return chan1[e] + chan2[3] + changeM(f);
        } else if (num < 100000) {
            int g = num / 10000;
            int h = num % 10000;
            return chan1[g] + chan2[4] + changeM(h);
        } else {
            int i = num / 100000;
            int j = num % 100000;
            return chan1[i] + chan2[5] + changeM(j);
        }
    }

}