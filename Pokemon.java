import java.util.Scanner;


class Pokemon{
    Scanner sc = new Scanner(System.in);
    
    private String option;
    private String name; //name character
    private String nPokemon;
    private int type; 

    public Pokemon(){
        this.type =(int)(((double)Math.random())*4);
    }
    
    public void pageStart() {
        System.out.print("\n\n\t\t Enter Your name : ");
        this.name = sc.nextLine();
        System.out.print("\n\n\t\t Enter Your Buddy Pokemon name : ");
        this.nPokemon = sc.nextLine();
        System.out.print("\n\n\n\n\n");
        
        

    }
    
    public void pageStatus(){
        System.out.print("\n\t   ==========================================================\n"
                           +"\n\t\t  Name = "+this.name
                           +"\n\t\t  My buddy pokemon = "+this.nPokemon
                           +"\n\t\t  type = "+this.type
                           +"\n\n\t  ============================================================\n");
   }

   public void pageIndex(){
       System.out.print("\n\t ===================================================="
                           +"\n\t\t ===== WELLCOM TO POKEMON GAME =====");
   }

   public String pageOption(){
       System.out.print("\n\n\t ----------------------------------------------------------"
                       +"\n\t\t 1.Start"
                       +"\n\t\t 2.Quit");
       System.out.print("\n\n -----------------------------------------------------------\n\n\n\n\n");
       this.option = sc.nextLine();
       System.out.print("\n\n ############################################################\n\n\n\n\n");
       return this.option;

   }

   public void pageQuit(){
       System.out.print("\n\t\t------------------------------------End Game------------------------------------");
   }


}