public class Player {
    private Weapon[] weaponSlots;


    public Player() {
        weaponSlots = new Weapon[]{
                new Pistolet(),
                new Avtomat(),
                new Rpg(),
                new Rogatka(),
                new WPistolet()
        };

    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
         if(slot>4){
             System.out.println("Некорректный значение");
         }
        Weapon weapon = weaponSlots[slot];
        weapon.shot();
    }
}
