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
}
