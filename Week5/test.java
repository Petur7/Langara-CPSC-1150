public class test {
    public static void main(String[] args) {
        int num = 13;
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j <= num-i; j++) {
                System.out.print("   "); // 3 spaces
            }
            for (int j = i; j > 0; j--) {
                if (j >= 10) System.out.print(j + " ");
                else System.out.print(" " + j + " ");
            }
            for (int j = 2; j <= i; j++) {
                if (j >= 10) System.out.print(j + " ");
                else System.out.print(" " + j + " ");
            }
            System.out.println();
        }
    }
}
