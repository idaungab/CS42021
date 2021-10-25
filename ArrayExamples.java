
public class ArrayExamples
{
	public static void main(String[] args) {
      //Three-dimensional arrays
	    int[][][] myNumbers = {
    	                             { {1,2,3}, {4,5,6}, {7,8,9} },
    	                             { {10,11}, {13,14,15}, {16} }
	                          };
	                
        System.out.printf("myNumbers[0][2][1]: %d\n\n",myNumbers[0][2][1] )	 ;  
        
	    for(int a=0; a < myNumbers.length; a++){
	        for(int r=0;r < myNumbers[a].length; r++){
	            for(int c=0; c < myNumbers[a][r].length; c++){
	                System.out.printf("%5d", myNumbers[a][r][c]);
	            }
	            System.out.println();
	        }
	        System.out.println("---------------------");
	    }
    
	    //Two-Dimensional Arrays
// 		int[][] myNumbers = {{1,2,3},{4,5,6,7},{8,9}};
		
// 		for(int row=0; row < myNumbers.length; row++){
// 		    for(int col = 0; col < myNumbers[row].length; col++){
// 		        System.out.printf("%d\t", myNumbers[row][col]);
// 		    }
// 		    System.out.println();
// 		}
	}
}
