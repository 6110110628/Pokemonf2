import java.util.Scanner;

public class PokemonGame{

    public static void main(String [] args){           
        String options;
        Pokemon p = new Pokemon();
        p.pageIndex();
        
        options = p.pageOption();

        if(options.equals("1")){
            p.pageStart();
            p.pageStatus();  
 
         }
         else if(options.equals("2")){
            p.pageQuit();

         }
    }
}