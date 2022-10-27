public class Main {
    public static void main(String[] args) {
        BankAccount sb = new BankAccount("Spongebob", 1111, 200000.0);
        // 1. What's in sb?
        // Ans: sb is a class object
        // 2. Describe what we would see if we ran the line of code:
        // Ans: Address of the class
        // System.out.println(sb);
        // 3. Is it legal to write:
        // sb.balance += 1000000;
        // Ans: No is not legal becasue balance is a var in a class that can be only
        // assess thought functions

        // 4. How, specifically, can we change the BankAccount class so that balance
        // cannot be modified except by calling its constructor, deposit, and withdraw.
        // Ans: Make the class private.

        // Add a toString() method to BankAccount.
        System.out.println();
        System.out.println("added toString()");

        System.out.println(sb.toString());
        // Modify BankAccount's deposit method so that it does nothing when amount <= 0.
        System.out.println();
        System.out.println("Modify BankAccount's deposit method so that it does nothing when amount <= 0.");
        sb.deposit(-10);
        System.out.println(sb);
        // Modify BankAccount's withdraw method so that it does nothing if amount is
        // larger than balance.
        System.out.println();
        System.out.println(
                "Modify BankAccount's withdraw method so that it does nothing if amount is larger than balance.");
        sb.withdrawal(300000);
        System.out.println(sb);

        // Write the name of each of the people you worked with as well as their
        // favorite place.
        // Omar Shakir : Dubai
    }
}