// Kaylynn Johnson
// CSE 2 lab09 story
// the purpose of this lab is to use methods and the random class to
//      generate a story

import java.util.Random;

public class Story{
    
    public static String adjective( Random random ){
        int num = random.nextInt(10);
        String adj = "";
        switch( num ){
            case 0:
                adj = "hairy";
                break;
            case 1:
                adj = "funky";
                break;
            case 2:
                adj = "skinny";
                break;
            case 3:
                adj = "tall";
                break;
            case 4:
                adj = "intelligent";
                break;
            case 5:
                adj = "worthless";
                break;
            case 6:
                adj = "soft";
                break;
            case 7:
                adj = "purple";
                break;
            case 8:
                adj = "quick";
                break;
            case 9:
                adj = "loud";
                break;
        }
        return adj;
            
    }
    
    public static String subject( Random random ){
        int num = random.nextInt(10);
        String subject = "";
        switch( num ){
            case 0:
                subject  = "girl";
                break;
            case 1:
                subject  = "cow";
                break;
            case 2:
                subject  = "calf";
                break;
            case 3:
                subject  = "squirrel";
                break;
            case 4:
               subject  = "basset hound";
                break;
            case 5:
                subject = "cat";
                break;
            case 6:
                subject  = "turtle";
                break;
            case 7:
                subject  = "shark";
                break;
            case 8:
                subject = "dolphin";
                break;
            case 9:
                subject  = "car";
                break;
        }
        return subject;
    }
    
    public static String verb( Random random ){
        int num = random.nextInt(10);
        String verb = "";
        switch( num ){
            case 0:
                verb  = "runs";
                break;
            case 1:
                verb  = "jumps";
                break;
            case 2:
                verb  = "yells";
                break;
            case 3:
                verb  = "high fives";
                break;
            case 4:
               verb  = "sleeps";
                break;
            case 5:
                verb = "eats";
                break;
            case 6:
                verb  = "chomps";
                break;
            case 7:
                verb  = "plays";
                break;
            case 8:
                verb = "bits";
                break;
            case 9:
                verb  = "pukes";
                break;
        }
        return verb;
    }
    
    public static String object( Random random ){
        int num = random.nextInt(10);
        String object = "";
        switch( num ){
            case 0:
                object  = "girl";
                break;
            case 1:
                object  = "cow";
                break;
            case 2:
                object  = "calf";
                break;
            case 3:
                object  = "squirrel";
                break;
            case 4:
               object  = "basset hound";
                break;
            case 5:
                object = "cat";
                break;
            case 6:
                object  = "turtle";
                break;
            case 7:
                object  = "shark";
                break;
            case 8:
                object = "dolphin";
                break;
            case 9:
                object = "car";
                break;
        }
        return object;
    }
    
    public static void main(String[] args){
        
        Random randomGenerator = new Random();
        String story = "The ";
        
        for( int i = 1; i <= 8; i++ ){
            if( i == 1 || i == 2 || i == 6 ){
                story = story + adjective(randomGenerator) + " ";
            }
            else if( i == 3 ){
                story = story + subject(randomGenerator) + " ";
            }
            else if( i == 7 ){
                story = story + object(randomGenerator);
            }
            else if( i == 4 ){
                story = story + verb(randomGenerator) + " ";
            }
            else if( i == 5 ){
                story += "the ";
            }
            else{
                story += ".";
            }
        }
        
        System.out.println(story);
        
    }
    
    
}