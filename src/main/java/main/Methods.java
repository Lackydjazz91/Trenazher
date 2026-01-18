package main;

public class Methods {
    public Methods(String str) {
    }

    public static int[] add(int[] arr, int[] ins, int pos) {


        int[] result = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            result[pos + i] = ins[i];
        }

        for (int i = pos; i < arr.length; i++) {
            result[i + ins.length] = arr[i];
        }
        return result;
    }
}
