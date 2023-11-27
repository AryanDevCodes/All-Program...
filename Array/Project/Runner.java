package Array.Project;

public class Runner {
    public static void main(String[] args) {
        int[] marks = {45,64,78,52,89};
        
        MarksStudent st = new MarksStudent("Aryan",marks);
        int number = st.getNumberOfMarks();
        int sum = st.getTotalSumOfMarks();
        int MaximumMark = st.getMaximumMark();
        int MinimumMark = st.getMinimumMark();
        double average = st.getAverageOfMarks();
        System.out.println("Number of Marks : "+ number +"\nSum : "+ sum +"\nMaximum Mark : " + MaximumMark+"\nMinimum Mark : " +MinimumMark + "\n" +average);
    }
}
