
 public class Mimirol extends Pokemon {
    public Mimirol(String name){
        super(name);
        int hp = (int)(Math.random() * 100);
    }

    public void attack(Pokemon enemy) {
        System.out.println("Pokemon " + name + " attack " + enemy.getName());
    }
}