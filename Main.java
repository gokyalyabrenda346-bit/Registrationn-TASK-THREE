public class Main {
    public static void main(String[] args) {
        System.out.println("Application process begins");
        // Creating the first student object
        candidate student1 = new candidate("Brenda Kitara");
        student1.displayDetails();
        // Creating the second student object
        candidate student2 = new candidate("Kent Maya");
        student2.displayDetails();
    }
}