
//Fuad Hassan
// Date: 08/29/2022
//CIS 1068, Section 2
//Assignment 2. Get You A Cat
//This program prints out verses from an old American folk song by using static methods/functions to capture the verses that are repeated multiple times.   

public class GetYouACat {
    public static void main(String[] args) {
        Cat();
        catGoes();
        System.out.println();
        Hen();
        HenGoes();
        catGoes();
        System.out.println();
        Duck();
        DuckGoes();
        HenGoes();
        catGoes();
        System.out.println();
        Goose();
        GooseGoes();
        DuckGoes();
        HenGoes();
        catGoes();
        System.out.println();
        Sheep();
        SheepGoes();
        GooseGoes();
        DuckGoes();
        HenGoes();
        catGoes();
        System.out.println();
        Pig();
        PigGoes();
        SheepGoes();
        GooseGoes();
        DuckGoes();
        HenGoes();
        catGoes();
    }

    public static void Cat() {
        System.out.println("Bought me a cat and the cat pleased me,");
        System.out.println("I fed my cat under yonder tree.");
    }

    public static void catGoes() {
        System.out.println("Cat goes fiddle-i-fee.");
    }

    public static void Hen() {
        System.out.println("Bought me a hen and the hen pleased me,");
        System.out.println("I fed my hen under yonder tree.");
    }

    public static void HenGoes() {
        System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
    }

    public static void Duck() {
        System.out.println("Bought me a duck and the duck pleased me,");
        System.out.println("I fed my duck under yonder tree.");
    }

    public static void DuckGoes() {
        System.out.println("Duck goes quack, quack,");
    }

    public static void Goose() {
        System.out.println("Bought me a goose and the goose pleased me,\nI fed my goose under yonder tree.");
    }

    public static void GooseGoes() {
        System.out.println("Goose goes hissy, hissy,");
    }

    public static void Sheep() {
        System.out.println("Bought me a sheep and the sheep pleased me,\nI fed my sheep under yonder tree.");
    }

    public static void SheepGoes() {
        System.out.println("Sheep goes baa, baa,");
    }

    public static void Pig() {
        System.out.println("Bought me a pig and the pig pleased me,\nI fed my pig under yonder tree.");
    }

    public static void PigGoes() {
        System.out.println("Pig goes oink, oink,");
    }
}