import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class PuzzlingTest{
    public static void main(String[] args){
        Puzzling test = new Puzzling();
        int[] arr = {3,5,1,2,7,9,8,13,25,32};
        String[] arrName = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        System.out.println(test.sum(arr));
        System.out.println(test.greaterThanTen(arr));
        System.out.println(test.shuffle(arrName));
        System.out.println(test.alphabet());
        System.out.println(test.random(55,100));
        System.out.println(test.randomArr(55,100));
        System.out.println(test.randomString());
        System.out.println(test.randomArrOfStrings());
    }
}
