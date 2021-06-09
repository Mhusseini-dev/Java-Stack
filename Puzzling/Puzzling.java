import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class Puzzling{
    String alph = "abcdefghijklmnopqrstuvwxyz";
    char[] alphabet = new char[alph.length()]; 
    public Puzzling(){
        for(int i = 0; i<alph.length();i++){
            alphabet[i] = alph.charAt(i);
        }
    }
    public int sum(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
    public ArrayList<Integer> greaterThanTen(int [] arr){
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>10){
                newArr.add(arr[i]);
            }
        }
        return newArr;
    }
    public ArrayList<String> shuffle(String[] arr){
        ArrayList<String> nameArr = new ArrayList<String>();
        List<String> newList = Arrays.asList(arr);
        Collections.shuffle(newList);
        String[] m = new String[newList.size()];
        arr = newList.toArray(m);
        for(int i = 0; i<arr.length ;i++){
            System.out.println(arr[i]);
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i].length()>5){
                nameArr.add(arr[i]);
            }
        }
        return nameArr;
    }
    public String alphabet(){
		Random rand = new Random();
		for (int i = 0; i < alphabet.length; i++) {
			int randomIndexToSwap = rand.nextInt(alphabet.length);
			char temp = alphabet[randomIndexToSwap];
			alphabet[randomIndexToSwap] = alphabet[i];
			alphabet[i] = temp;
		}
        System.out.println(alphabet[0]+" "+alphabet[25]);
        String vowels = "aeiou";
        for(int i = 0;i<vowels.length();i++){
            if(alphabet[0] == vowels.charAt(i));
            return "message";
        }
        return "alph";
    }
    public ArrayList<Integer> random(int min, int max){
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i =0;i<10;i++){
            double randomNum = Math.random() * (max - min + 1) + min;
            Math.round(randomNum);
            int IntValue = (int) randomNum;
            newArr.add(IntValue);
        }
        return newArr;
    }
    public ArrayList<Integer> randomArr(int min, int max){
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i =0;i<10;i++){
            double randomNum = Math.random() * (max - min + 1) + min;
            Math.round(randomNum);
            int IntValue = (int) randomNum;
            newArr.add(IntValue);
        }
        Collections.sort(newArr);
        System.out.println(newArr);
        System.out.println(newArr.get(0));
        System.out.println(newArr.get(newArr.size()-1));
        return newArr;
    }
    public String randomString(){
        String str = "";
        String temp = "";
		Random rand = new Random();
		for (int i = 0; i < 5; i++) {
            int randomIndex = rand.nextInt(alphabet.length);
            temp = Character.toString(alphabet[randomIndex]);
            str += temp;
        }
        return str;
    }
    public ArrayList<String> randomArrOfStrings(){
        String str = "";
        String temp = "";
        ArrayList<String> list = new ArrayList<String>();
        Random rand = new Random();
        for (int i =0;i<10;i++){
            list.add(randomString());
        }
        return list;
    }
}
