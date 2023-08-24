import java.util.Scanner;

public class MangoTreeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int treeNumber = scanner.nextInt();

        boolean isMangoTree = checkMangoTree(rows, columns, treeNumber);
        System.out.println(isMangoTree);

        scanner.close();
    }

    public static boolean checkMangoTree(int rows, int columns, int treeNumber) {
        int lastRow = rows;
        int firstColumn = 1;
        int lastColumn = columns;


        if (treeNumber <= columns ||
                treeNumber % columns == 1 ||
                treeNumber % columns == 0) {
            return true;
        }

        return false;
    }
}
