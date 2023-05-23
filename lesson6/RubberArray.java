package newPro.lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Java. Homework #3
 * @author Yehor Zhornik
 * @version 23 May 2023
 */

public class RubberArray {
        private int[] array;

        public RubberArray() {
            array = new int[0];
        }

        public void add(int value) {
            int[] newArray = new int[array.length + 1];
            System.arraycopy(array, 0, newArray, 0, array.length);
            newArray[array.length] = value;
            array = newArray;
        }

        public int get(int index) {
            return array[index];
        }

    public void addByIndex(int index, int value) {
            int[] newArray = new int[array.length + 1];
            System.arraycopy(array, 0, newArray, 0, index);
            System.arraycopy(array, index, newArray, index + 1, array.length - index);
            newArray[index] = value;
            array = newArray;
        }

        public void addAll(int[] addingArray) {
            int[] newArray = new int[array.length + addingArray.length];
            System.arraycopy(array, 0, newArray, 0, array.length);
            System.arraycopy(addingArray, 0, newArray, newArray.length, addingArray.length);
            array = newArray;
       }

       public void indexOf (int value) {
           int j = 0;
           for (int i = 0; i < array.length; i++) {

               if (array[i] == value) {
                   System.out.println("Индекс числа: " + value + " = " + i);
               }

               if (array[i] != value) {
                   j++;
               }

               if (j == array.length) {
                   System.out.println("Числа не существует! -1");
               }
           }
        }

        public boolean isEmpty () {
            if (array.length == 0) {
                return true;
            }
            return false;
        }

        public void clear () {
            int [] newArray = new int[0];
            array = newArray;
        }


    public int size() {
            int count = 0;
        for (int numbers:array) {
            count++;
        }
        return count;
    }


       public boolean contains(int value) {
            for (int findingNumber:array) {
               if (findingNumber == value) {
                   return true;
               }
           } return false;
       }

        public void remove(int index) {
            int[] newArray = new int[array.length - 1];
            System.arraycopy(array, 0, newArray, 0, index);
            System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
            array = newArray;
        }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        return sb.append("]").toString();
     }
}