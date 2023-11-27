package ArrayQue;

public class AnonymousSum {
    public static void main(String[] args) {
        AnonymousSum.sum (new int[]{10,20,30});
        }
        public static void sum(int[] no)
        {
            int sum = 0;
            for(int i:no)
            {
                sum = sum+i;
            }
            System.out.print(sum);
        }   
    }


