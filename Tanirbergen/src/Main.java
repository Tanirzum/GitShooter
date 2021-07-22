import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Player player = new Player();

        System.out.println("У игрока %d слотов с оружием," + " введите номер , чтобы  выстрелить ," + "-1  чтобы выйти%n" + player.getSlotsCount());

        int slot;
        while (true) {
            int num = scanner.nextInt();
            switch (num) {
                case 0:
                    player.shotWithWeapon(0);
                    break;
                case 1:
                    player.shotWithWeapon(1);
                    break;
                case 2:
                    player.shotWithWeapon(2);
                    break;
                case 3:
                    player.shotWithWeapon(3);
                    break;
                case 4:
                    player.shotWithWeapon(4);
                    break;

            }
            if (num == -1) {
                break;
            }

        }
        System.out.println("Game over");


    }
}
