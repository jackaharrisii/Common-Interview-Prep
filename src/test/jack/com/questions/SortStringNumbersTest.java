package jack.com.questions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortStringNumbersTest {

    SortStringNumbers sort = new SortStringNumbers();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /*
     NORMAL CASES
     */

    @Test
    public void sort_single_digit_numbers(){
        // Given
        String[] testArray = new String[]{"1", "5", "9", "4"};
        String[] expected = new String[]{"1", "4", "5", "9"};
        // When
        sort.sortStringNumbers(testArray);
        // Then
        assertArrayEquals(expected,testArray);
    }

    @Test
    // no edge cases
    public void sort_a_normal_list(){
        // Given
        String[] testArray = new String[]{"1", "5", "15", "9", "4"};
        String[] expected = new String[]{"1", "4", "5", "9", "15"};
        // When
        sort.sortStringNumbers(testArray);
        // Then
        assertArrayEquals(expected,testArray);
    }



    /*
    EDGE CASES
     */

    @Test
    public void sort_a_list_that_includes_leading_zeroes(){
        // Given
        String[] testArray = new String[]{"001", "5", "15", "09", "4"};
        String[] expected = new String[]{"001", "4", "5", "09", "15"};
        // When
        sort.sortStringNumbers(testArray);
        // Then
        assertArrayEquals(expected,testArray);
    }

    @Test
    public void sort_a_list_that_includes_negative_numbers(){
        // Given
        String[] testArray = new String[]{"1", "-5", "15", "-9", "4"};
        String[] expected = new String[]{"-9", "-5", "1", "4", "15"};
        // When
        sort.sortStringNumbers(testArray);
        // Then
        assertArrayEquals(expected,testArray);
    }

    @Test
    public void sort_a_list_that_includes_decimals(){
        // Given
        String[] testArray = new String[]{"1", "5.0", "15", "9", "5.0001"};
        String[] expected = new String[]{"1", "5.0", "5.0001", "9", "15"};
        // When
        sort.sortStringNumbers(testArray);
        // Then
        assertArrayEquals(expected,testArray);
    }

    @Test
    public void sort_a_list_that_includes_spelled_out_numbers(){
        // Given
        String[] testArray = new String[]{"1", "ten thousand", "5", "11,000", "nine thousand nine hundred and ninety nine", "15", "nine", "4", "a million"};
        String[] expected = new String[]{"1", "4", "5", "nine", "15", "nine thousand nine hundred and ninety nine", "ten thousand", "11,000", "a million"};
        // When
        sort.sortStringNumbers(testArray);
        // Then
        assertArrayEquals(expected,testArray);
    }




    /*
     SUB-METHOD TESTS:
     */

    @Test
    public void bubbleSortByStringLength_Test(){
        // Given
        String[] testArray = new String[]{"a", "aaaa", "aaa", "aaaaa", "aa"};
        String[] expected = new String[]{"a", "aa", "aaa", "aaaa", "aaaaa"};
        // When
        sort.bubbleSortByStringLength(testArray);
        // Then
        assertArrayEquals(expected,testArray);
    }

}