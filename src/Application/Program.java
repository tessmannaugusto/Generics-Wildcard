package Application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(1,2,3,4);
        List<Double> myDoubles = Arrays.asList(3.2,4.5);
        List<Object> myObjs = new ArrayList<>();

        copy(myInts,myObjs);
        printList(myObjs);
        copy(myDoubles,myObjs);
        printList(myObjs);

    }
    /*Create a method to add one list to another. The destiny list has to be more generic (object list can take all
    types). Source list has wildcard type Number, can receive ints, doubles, floats...
    */
    public static void copy(List<? extends Number> source, List<? super Number> destiny){
        for (Number number : source){
            destiny.add(number);
        }
    }
    //Method to print lists with different types in it.
    public static void printList(List<?> list){
        for (Object obj : list){
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
