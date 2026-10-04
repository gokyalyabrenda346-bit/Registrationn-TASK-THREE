public class candidate {
    static int examYear;
    static double registrationFee;
    String studentName;
    String registrationStatus;
    String examCentre;
    // STATIC INITIALIZATION BLOCK
    static {
        System.out.println("[STATIC BLOCK]");
        examYear = 2026;
        registrationFee = 80000;
        System.out.println("-> Exam Year set to: " + examYear);
        System.out.println("-> Registration Fee set to: UGX " + registrationFee);
    }
    // INSTANCE INITIALIZATION BLOCK (IIB)
    {
        System.out.println("[INSTANCE BLOCK] ");
        this.registrationStatus = "Approved";
        this.examCentre = "CENTRE-001 (Main Campus)";
    }
    // CONSTRUCTOR  BLOCK
     public  void Candidate(String studentName) {
        System.out.println("[CONSTRUCTOR] Executing student constructor: " + studentName);
        this.studentName = studentName;
    }
    public void displayDetails() {
    }
}
