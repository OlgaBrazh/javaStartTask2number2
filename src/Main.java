public class Main {
    public static void main(String[] args) {
        int amountInitial = 32;
        int amountDeposit = 932;
        int amountFinish = (amountInitial + amountDeposit);
        int amountBonus;

        if (amountDeposit > 1000) {
            System.out.println("Количество бонусных рублей: " + (amountBonus = amountDeposit / 100));
            System.out.println("Итоговая сумма на счету: " + amountFinish);
        } else {
            System.out.println("Количество бонусных рублей: 0");
            System.out.println("Итоговая сумма на счету: " + amountFinish);
        }
    }
}