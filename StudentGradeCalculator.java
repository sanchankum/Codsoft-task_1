import java.util.Scanner;
class NumberGradeCalculator 
{
    public static void main(String[]args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int numSubjects=scan.nextInt();
        double[]marks=new double[numSubjects];
        for(int i=0;i<numSubjects;i++) 
        {
            System.out.println("Enter the marks obtained in subject"+(i+1)+"(out of 100):");
            marks[i]=scan.nextDouble();
        }
        double totalMarks=calculateTotalMarks(marks);
        double averagePercentage=calculateAveragePercentage(totalMarks, numSubjects);
        char grade=calculateGrade(averagePercentage);

        System.out.println("\nTotal Marks:"+totalMarks);
        System.out.println("Average Percentage:"+String.format("%.2f",averagePercentage) + "%");
        System.out.println("Grade:"+grade);
        scan.close();
    }
    public static double calculateTotalMarks(double[] marks) {
        double total=0;
        for (double mark:marks) 
        {
            total += mark;
        }
        return total;
    }
    public static double calculateAveragePercentage(double totalMarks, int numSubjects) {
        return (totalMarks/numSubjects); 
    }
    public static char calculateGrade(double averagePercentage) {
        if(averagePercentage>=90) 
        {
            return 'A';
        } 
        else if(averagePercentage>=80) 
        {
            return 'B';
        } 
        else if(averagePercentage>=70) 
        {
            return 'C';
        } 
        else if(averagePercentage>=60) 
        {
            return 'D';
        } 
        else 
        {
            return 'F';
        }
    }
}
