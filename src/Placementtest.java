public class Placementtest {

    static int runningProduct(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            if (a <= b) {
                result *= a;
                a++;
            }
        }
        return result;
    }

    static char findMostCommon123(String text) {
        int z1 = 0;
        int z2 = 0;
        int z3 = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '1') {
                z1++;
            } else if (text.charAt(i) == '2') {
                z2++;          
            } else if (text.charAt(i) == '3') {
                z3++;
            }
        }
        if (z1 > z2 && z1 > z3 || z1 == z2 && z1 == z3) {
            return '1';
        } else if (z2 > z1 && z2 > z3 || z2 == z3) {
            return '2';
        } else {
            return '3';
        }
    }

    static String repeatChar(String text, char character) {
        String result = "";
        int x = 2;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == character) {
                for (int j = 0; j < x; j++) {
                    result += character;
                }
                x++;
            } else {
                result += text.charAt(i);
            }
        }
        return result;
    }

    static void printPattern(int m, int n, char evenChar) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0 || j % 2 == 0) {
                    System.out.print('x');
                } else {
                    System.out.print(evenChar);
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        short result;
        String test = "ottomotor";

        result = (short) runningProduct(4, 8);
        System.out.println(result);

        System.out.println(runningProduct(1, 5));
        System.out.println(runningProduct(10, 11));

        System.out.println(findMostCommon123("22+3=25"));
        System.out.println(findMostCommon123("33+22=55"));
        System.out.println(findMostCommon123(test));

        System.out.println(repeatChar(test, 'o'));
        System.out.println(repeatChar(test, 'm'));
        System.out.println(repeatChar(test, 'a'));

        printPattern(5, 5, '0');
        printPattern(2, 4, '*');
    }
}