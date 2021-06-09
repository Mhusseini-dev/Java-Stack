public class Pythagorean {
    public double calculateHypotenuse(Double legA, Double legB) {
        // the hypotenuse is the side across from the right angle.
        // calculate the value of c given legA and legB
        Double a = Math.pow(legA, 2);
        Double b = Math.pow(legB, 2);
        Double sum = a + b;
        Double c = Math.sqrt(sum);
        return (c);
    }
}