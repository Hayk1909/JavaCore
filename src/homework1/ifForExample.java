package homework1;

public class ifForExample {
    public static void main(String[] args) {
        for (int tox = 1; tox <= 10; tox++) {
            for (int j = 1; j < tox; j++) {
                System.out.print("");
            }
            for (int k = 1; k <= tox; k++) {
                System.out.print("*");
                for (int k1 = 1; k1 < k; k1 = k1 + k) {
                    System.out.print("");
                }

            }
            System.out.println();
        }
    }
}

