package jack.com.questions;

/*
Given: an array of numbers as strings, i.e., {"1", "5", "15", "9", "4"}
Task: sort the numbers
Restriction: the numbers must stay strings - no converting to integers

Edge Cases:
- negative numbers
- leading zeroes
- decimals
- number is spelled out ("nine" instead of "9") <- not sure how to get this one so far, but probably a really thorough regex.....

*/

public class SortStringNumbers {

    Sorting sorting = new Sorting();

    // this works fine before the edge cases, but I need a more custom comparator to account for the edge cases
//    public void sortStringNumbers(String[] input){
//        sorting.bubbleSortGeneric(input);
//        bubbleSortByStringLength(input);
//    }

    // Strategy - use insertion sort this time, but with a custom comparator
    public void sortStringNumbers(String[] values){
        for (int i = 1; i < values.length; i++){
            String current = values[i];                           // current represents the value that is moving
            int j =i-1;                                           // j represents the index of the next value to compare current against
            while(j >= 0 && currentIsLessThanPrevious(current, values[j])) {   // this loop keep going until either current is less than the value at j, or it reaches the start of the array
                values[j+1]= values[j];
                j--;
            }
            values[j+1] = current;                                // this line inserts current into the now empty index of the array
        }
    }

    public boolean currentIsLessThanPrevious(String current, String previous){
        // compare lengths
        if (current.length() > previous.length()) return false;
        else if (current.length() < previous.length()) return true;
        // if the same length, compare values
        if (current.compareTo(previous) < 0) return true;
        else return false;
    }

    public void bubbleSortByStringLength(String[] a){
        boolean sorted = false;
        String temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < a.length -1; i++){
                if (a[i].length() > a[i+1].length()){
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }

}
