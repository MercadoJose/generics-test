package behaviors_pkg;

import interfaces_pkg.OperationsInterface;

import java.util.ArrayList;
import java.util.Collections;

public class Operations implements OperationsInterface {

    ArrayList<Integer> listNumbers = new ArrayList<Integer>();

    public Operations() {

        listNumbers.add(4);
        listNumbers.add(5);
        listNumbers.add(7);
        listNumbers.add(40);
        listNumbers.add(25);
    }

    @Override
    public Object product(int index1, int index2) {
        index1 = listNumbers.get(index1);
        index2 = listNumbers.get(index2);
        int result = index1 * index2;
        return result;
    }

    @Override
    public Object maxValue(Object collection) {
        int result = Collections.max(listNumbers);
        return result;
    }

    @Override
    public Object minValue(Object collection) {
        int result = Collections.min(listNumbers);
        return result;
    }

    @Override
    public Object sum(int index1, int index2) {
        index1 = listNumbers.get(index1);
        index2 = listNumbers.get(index2);
        int result = index1 + index2;
        return result;
    }

    public int factorial(int index1){
        int fact = 1;
        for (int i = 1; i <= listNumbers.get(index1); i++){
            fact *= i;
        }
        int result = fact;
        return result;
    }

    public String prime(){

        Integer array[] = new Integer[listNumbers.size()];
        array = listNumbers.toArray(array);
        System.out.println("Prime: ");
        for (int i = 0; i < array.length; i++){
            if (array[i]%2 != 0){
                System.out.println(array[i]);

            }
        }
        return "";
    }

}
