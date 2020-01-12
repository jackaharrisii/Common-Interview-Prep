package main.jack.com.questions;

public class Sorting {

    public static void bubbleSort(Integer[] a){
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < a.length -1; i++){
                if (a[i] > a[i+1]){
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public static void bubbleSort(String[] a){
        boolean sorted = false;
        String temp;
        while(!sorted){
            sorted = true;
            for(int i = 0; i < a.length - 1; i++){
                if (a[i].compareTo(a[i+1]) > 0){
                    temp = a[i+1];
                    a[i+1] = a[i];
                    a[i] = temp;
                    sorted  = false;
                }
            }
        }
    }

    public <T extends Comparable<T>> void bubbleSortGeneric(T[] values){
        boolean sorted = false;
        T temp;
        while(!sorted){
            sorted = true;
            for(int i = 0; i < values.length - 1; i++){
                if (values[i].compareTo(values[i+1]) > 0){
                    temp = values[i+1];
                    values[i+1] = values[i];
                    values[i] = temp;
                    sorted  = false;
                }
            }
        }

    }

}
