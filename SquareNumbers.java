import java,util.scanner;

public class FindSquareNumbers {
     
    int static startingNum , endingNum , result ;
    
    public static void findNumbers(int startingNum , int endingNum){
        for(int i= startingNum ; i<=endingNum ; i++){
            result = i*i ;
            System.out.println("Square number of "+i+" is "+result) ;
        }
        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        
        startingNum = scan.nextInt() ;
        endingNum = scan.nextInt() ;
        
        findNumbers( startingNum , endingNum ) ;
    }
     
}
