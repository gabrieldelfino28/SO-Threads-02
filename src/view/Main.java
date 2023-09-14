package view;

import controller.ArraySumController;

public class Main {

    public static void main(String[] args) {

        int[][] Mat = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                Mat[i][j] = (int) (Math.random() * 100 + 1);
            }
        }

        for (int i = 0; i < 3; i++){
            Thread t = new ArraySumController(Mat[i]);
            t.start();
        }
    }
}
