package review.array;

public class Array02 {
    static void main() {
        //2차원 배열
        int[][] array = new int[3][2];
        array[0][0] = 10;
        array[0][1] = 20;
        array[1][0] = 30;
        array[1][1] = 40;
        array[2][0] = 50;
        array[2][1] = 60;
        int[][] array02 = {{10, 20, 100}, {30, 40}, {50, 60, 200}};
        for (int i = 0; i < array02.length; i++) {
            for (int j = 0; j < array02[i].length; j++) {
                System.out.print(array02[i][j]+",");
            }
            System.out.println();
        }
    }
}
