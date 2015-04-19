public class exam2{
    public static void main(String[] args){
        int x = 4;
        if(x > 0){
            for(int i = 1; i <= 2; i++){
                if(i==1){
                    for(int j = 1; j <= x; j++){
                        for(int k = 1; k <= j; k++){
                            System.out.print(x);
                        }
                        System.out.println();
                    }
                }
                else{
                    for( int j = x; j >= 1; j--){
                        for( int r = 1; r <= x; r++){
                            System.out.print(" ");
                        }
                        for( int k = j; k >= 1; k--){
                            System.out.print(x);
                        }
                        System.out.println();
                    }
                }
            }
        }
    }
}