package controller;

public class ArraySumController extends Thread {
    final int[] arr;

    public ArraySumController(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        Sum(arr);
    }

    public void Sum(int[] arr) {
        int soma = 0;
        for (int value : arr) {
            soma += value;
        }
        System.out.println("Thread-ID #" + getId() + " Soma: " + soma);
    }
}
