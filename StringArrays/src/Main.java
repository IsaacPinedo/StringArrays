public class Main {

    public static void main(String[] args) {
        // Declare and initialize an array of superhero names
        String[] superheroes = {"Batman", "Superman", "Wonder Woman", "Spider-Man", "Iron Man"};

        // Declare and initialize an array of years
        int[] introductionYears = {1939, 1938, 1941, 1962, 1963};

        // Print the superhero names
        System.out.println("Superhero Names:");
        for (String superhero : superheroes) {
            System.out.println(superhero);
        }

        // Print the introduction years
        System.out.println("Introduction Years:");
        for (int introduction_year : introductionYears) {
            System.out.println(introduction_year);
        }

        // Modifying superhero names and introduction years
        System.out.println("Original superhero name at position 3: " + superheroes[2]);
        superheroes[2] = "Thor";
        System.out.println("Modified superhero name at position 3: " + superheroes[2]);

        System.out.println("Original introduction year for superhero at position 3: " + introductionYears[2]);
        introductionYears[2] = 2011;
        System.out.println("Modified introduction year for superhero at position 3: " + introductionYears[2]);

        // Printing length of both arrays
        System.out.println("Total superheroes names in String array: " + superheroes.length);
        System.out.println("Total superheroes introduction year in int array: " + superheroes.length);

    }
}
