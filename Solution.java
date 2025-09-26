import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read N and M
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine(); // consume the rest of the line

        // Read grid
        char[][] grid = new char[N][M];
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < M; j++) {
                grid[i][j] = line.charAt(j);
            }
        }

        String word = sc.nextLine();
        System.out.println("YES");
        // TODO: implement your solution logic
        // Example: System.out.println("YES or NO");
    }
}
