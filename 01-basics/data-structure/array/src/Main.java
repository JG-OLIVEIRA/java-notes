import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        String[] fruits = {"apple", "orange", "banana", "coconut"};

        int numOfFruits = fruits.length;

        System.out.println(numOfFruits);

        for(int i = 0; i < fruits.length; i++){
            System.out.print(fruits[i] + " ");
        }

        System.out.println();

        Arrays.sort(fruits);
        Arrays.fill(fruits, "pineapple");

        for(String fruit:fruits){
            System.out.print(fruit + " ");
        }
    }
}
