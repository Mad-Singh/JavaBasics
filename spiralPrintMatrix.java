import java.util.*;
 
public class Main {
   public static void main(String args[]) {
       Scanner sc= new Scanner(System.in);
       int row = sc.nextInt();
       int col = sc.nextInt();
       int[][] mat = new int[row][col];
 
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        
        int rs=0,re=row-1,cs=0,ce=col-1;
    
        do{
            for(int i=cs;i<=ce;i++){
                System.out.print(mat[rs][i]+" ");
            }
            rs++;
            for(int i=rs;i<=re;i++){
                System.out.print(mat[i][ce]+" ");
            }
            ce--;
            for(int i=ce;i>=cs;i--){
                System.out.print(mat[re][i]+" ");
            }
            re--;
            for(int i=re;i>=rs;i--){
                System.out.print(mat[i][cs]+" ");
            }
            cs++;
        }while(rs<=re && cs<=ce);  
   }
}

