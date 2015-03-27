

public class practice{
    public static void main(String[] args){
        
        for(int i=2; i<=4;i++){
            for(int j=1; j<=i; j++){
                for(int k=1; k<=j; k++){
                    System.out.print("b");
                }
                System.out.println();
            }
        }
        
        int y=3;
        do{
            System.out.println("["+y+"]");
            y-=1;
        }while(y>0);
        
        for(int i=9; i>=0; i--){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            System.out.println(i);
        }
        
    }
}