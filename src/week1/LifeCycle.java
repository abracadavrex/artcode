package week1;

/**
 * Created by pc on 15.11.2015.
 */
public class LifeCycle {
    public static void main(String[] args) {
        String name = "Nikita";
        int age = 30;
        long money = 10_000;
        int health = 80;
        int healthLimit = 30;
        int tourPriceEgypt = 25-000;
        int tourPriceTurkey = 35-000;
        int tourPricegrandMa = 100;
        boolean isWeatherGood = true;

        if (health > healthLimit){
            System.out.println("I'll stay home.");
        } else {
            System.out.println("I need a rest");

            if (money >= tourPriceTurkey && age < 60)
                System.out.println("I'm going to Turkey");
            else if (money >= tourPriceEgypt)
                System.out.println("I'm going to Egypt");
            else if (money >= tourPricegrandMa)
                System.out.println("Grandma");
            }
        }
    }


