package ArrayQue;

public class twoDArray {
    public static void main(String[] args) {
        int[][] a = new int[][]{{10,20,90},{20,30,80}};
        for(int i = 0 ; i<a.length;i++)
        {
            for(int j = 0 ; j<a[i].length;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
