package Array.Project;

public class MarksStudent {
    private String name;
    private int[] marks;

     MarksStudent(String name,int marks[]) {
        this.name = name;
        this.marks = marks;
    }
        public MarksStudent() {
    }
        public int getNumberOfMarks(){
                
            return marks.length ;
        }
         
        public int getTotalSumOfMarks(){
            int sum = 0;
            for(int i=0; i<marks.length; i++){
                sum = sum+marks[i];
            }
            return sum;
        }

        public int getMaximumMark(){
            int maximumMark = 0;
            for(int i=0; i<marks.length; i++){
                if(marks[i]>maximumMark)
                {
                    maximumMark = marks[i];
                }
            }
            return maximumMark;
        }
        public int getMinimumMark(){
            int minimum = 0;
            for(int i=0; i<marks.length; i++){
                if(marks[i]>minimum){
                    minimum = marks[i];
                }
            }
            return minimum;
        }
        public double getAverageOfMarks(){
            double average = 0.0,sum=0.0;
            for(int i=0; i<marks.length; i++){
                sum =sum+marks[i];
                average = sum/marks.length;
            }
            return average;
        }
    public static void main(String[] args) {
        MarksStudent st = new MarksStudent();
        int number = st.getNumberOfMarks();
        int sum = st.getTotalSumOfMarks();
        int maximumMark = st.getMaximumMark();
        int MinimumMark = st.getMinimumMark();
        double average = st.getAverageOfMarks();
    }

}

