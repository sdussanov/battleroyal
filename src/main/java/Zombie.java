public class Zombie extends Monster {
    public static String scream = "Raaaauuughhhh! ";

    public Zombie(String name) {
        super(name + " the Zombie", 5);

    }

    @Override
    public void growl() {
        System.out.print(scream);
        super.growl();
    }

    public void growl(boolean isLoud) {
        if (!isLoud) {
            this.growl();
        } else {
            System.out.print(scream.toUpperCase());
            super.growl();
        }
    }

    @Override
    public void attack() {
        this.growl();
        super.attack();
    }
}
