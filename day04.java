import java.io.*;
import java.util.*;

public class day04 {

    public day04() {

    }

}

class Person {
    private int age;

	public Person(final int initialAge) {
        // Add some more code to run some checks on initialAge
        if (initialAge < 0) {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        } else {
            this.age = initialAge;
        }
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct
        // statement:
        if (age < 13) {
            System.out.println("You are young.");
        } else if ((age >= 13) && (age < 18)) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
        // System.out.println(/*Insert correct print statement here*/);
    }

    public void yearPasses() {
        // Increment this person's age.
        age += 1;
    }

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            final int age = sc.nextInt();
            final Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}
