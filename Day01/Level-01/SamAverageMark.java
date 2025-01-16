class SamAverageMark{
    public static void main(String [] args){
        // create variable and assign Sam Math mark        
        int markInMath= 94;
        // create variable and assign Sam Physics mark
        int markInPhysics = 95;
        // create variable and assign Sam Chemistry mark
        int markInChemistry = 96;
        // PCM Total Marks
        double totalMark = 100 * 3;
        // Sam Obtain Total marks in PCM
        double obtainMark = markInMath + markInPhysics + markInChemistry ;
        //Sam AverageMarks in PCM
        double averageMark = (obtainMark / totalMark) * 100;        
        System.out.println("Sam's average mark in PCM is   : " + averageMark + "%.");
    }
} 