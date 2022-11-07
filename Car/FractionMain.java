public class FractionMain {
    public static void main(String[] args) {
        Fraction a = new Fraction(1, 5);
        System.out.println("Fraction: " + a.toString());
        System.out.println("Numerator: " + a.getNum());
        System.out.println("Denominator: " + a.getDenom());
        System.out.println("Equal: " + a.equals(new Fraction(1, 3)));
        System.out.println("Equal: " + a.equals(new Fraction(1, 5)));
        Fraction b = new Fraction(2, 6);
        Fraction addd = a.add(b);
        System.out.println(a.toString() + " + " + b.toString() + " = " + addd.toString());

    }
}
