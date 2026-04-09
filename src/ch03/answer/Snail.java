package ch03.answer;

//  1  2  3  4  5
//  16 17 18 19 6
//  15 24 25 20 7
//  14 23 22 21 8
//  13 12 11 10 9
public class Snail {
    static void main() {
        int size = 15;
        int[][] array = new int[size][size];
        int num = 1;
        int top = 0;
        int bottom = size - 1;  //배열은 0부터 시작
        int left = 0;
        int right = size - 1;
        while (num <= size * size) {
            // left -> right  (top fix)
            for (int i = left; i <= right; i++) {
                array[top][i] = num++;   //{1,2,3,4,5}  [0][0]/[0][1]/[0][2]/[0][3]/[0][4]
            }                            //             [0][0]/[0][1]/[0][2]/[0][3]/[0][4]
            top++;
            // top -> bottom  (right fix)
            for (int i = top; i <= bottom; i++) {
                array[i][right] = num++;
            }
            right--;
            //right -> left  (bottom fix)
            for(int i=right;i>=left;i--) {
                array[bottom][i] = num++;
            }
            bottom--;
            //bottom -> top (left fix)
            for(int i=bottom;i>=top;i--) {
                array[i][left] = num++;
            }
            left++;
        }
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                System.out.printf("%4d",array[i][j]);
            }
            System.out.println();
        }
    }
}
