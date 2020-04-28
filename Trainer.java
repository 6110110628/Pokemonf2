import java.util.*;

public class Trainer {
    private ArrayList<Pokemon> bag;
    private Scanner sc;
    public Trainer(){
        bag = new ArrayList<Pokemon>();
        bag.add(new Mimirol("Mimirol of Alee"));
        sc = new Scanner(System.in);
    }

    public void play(){
        String cmd = "";

        do{
            System.out.print("Enter command: ");
            cmd = sc.nextLine();

            if(cmd.equals("show")){
                showPokemon();
            }
            else if(cmd.equals("chase")){
                chasePokemon();
            }
        }while(!cmd.equals("q"));
    }

    public void chasePokemon(){
        System.out.println("Chase Pokemons!");
        ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
        int pokemonNum = (int)(Math.random() * 3);
        for(int i=0 ; i<pokemonNum ; i++){
            int type = (int)(Math.random() * 2);
            if(type == 0)
               pokemons.add(new Mimirol("mimirol"));
            else if(type == 1)
                pokemons.add(new Togepi("togepi"));
        }

        System.out.println("OMG! Found it!!");
        int num = 0;
        for(Pokemon p: pokemons){
            System.out.println("No. " + num + " " + p.getName());
            num++;
        }

        System.out.print("You  catch: ");
        num = sc.nextInt();

        bag.add(pokemons.get(num));

    }

    public void showPokemon(){
        System.out.println("Pokemon in bag");
        for(Pokemon p: bag) {
            System.out.println(p);
        }
    }
}