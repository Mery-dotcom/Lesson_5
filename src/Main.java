public class Main {
    public static void main(String[] args) {
        Boss dark = new Boss();
        dark.setHealth(600);
        dark.setDamage(80);
        dark.setDefence("Armour");
        System.out.println(dark);
        System.out.println("Health: " + dark.getHealth() + " Damage: " + dark.getDamage() +
                " Defense: " + dark.getDefence());

        Hero[] heroes = createHeroes();
        for (Hero hero : heroes) {
            System.out.println("Hero - Health: " + hero.getHealth() + " Damage: " + hero.getDamage() +
            " Defense: " + hero.getSuperpower());
        }
    }

    public static Hero[] createHeroes() {
        Hero heroGambit = new Hero(300, 100, "Kinetic");
        Hero heroRogue = new Hero(200, 400);
        Hero heroStorm = new Hero(250, 150, "Magical");

        return new Hero[]{heroGambit, heroRogue, heroStorm};
    }
}