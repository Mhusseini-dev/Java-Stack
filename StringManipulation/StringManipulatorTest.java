public class StringManipulatorTest {
    public static void main(String[] args) {
        StringManipulator finalstring = new StringManipulator();
        String result = finalstring.trimAndConcat("         Hello    ", "   World          ");
        System.out.println(result);

        StringManipulator testindex = new StringManipulator();
        Integer finalvalue = testindex.getIndexOrNull("bro do u even lift.", 'u');
        System.out.println(finalvalue);

        StringManipulator findSubString = new StringManipulator();
        Integer finalValue = findSubString.getIndexOrNull("do yyou even lift .", "ev");
        System.out.println(finalValue);

        StringManipulator combineString = new StringManipulator();
        String endResult = combineString.concatSubstring("what the hell is even this.", 2, 12, "yolo");
        System.out.println(endResult);
    }
}