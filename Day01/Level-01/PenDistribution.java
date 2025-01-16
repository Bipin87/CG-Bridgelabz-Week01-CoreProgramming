class PenDistribution {
    public static void main(String[] args) {
        // Total pens and number of students
        int totalPens = 14;
        int students = 3;
        // Calculating pens per student and remaining pens
        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;
        // Output result
        System.out.println("The Pen Per Student is " + pensPerStudent +" pen and the remaining pen not distributed is " + remainingPens);
    }
}
