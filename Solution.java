import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int N = in.nextInt();

        int leftBorder = in.nextInt();
        int rightBorder = leftBorder;

        for (int i = 1; i < N; i++) {
            int b = in.nextInt();
            leftBorder = Math.min(leftBorder, b);
            rightBorder = Math.max(rightBorder, b);
        }
        int result = L - leftBorder;
        if (result < rightBorder) {
            result = rightBorder;
        }
        System.out.println(result);
    }
}
