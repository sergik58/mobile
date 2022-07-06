public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int replenishment = 2000;
        int bonus = replenishment / 100;
        int total = balance + replenishment + bonus;

        if (replenishment > 1000) {
            System.out.println(" Итого: " + total + " Из них бонус: " + bonus);
        } else {
            System.out.println(" Итого: " + (balance + replenishment));


        }
    }
}
