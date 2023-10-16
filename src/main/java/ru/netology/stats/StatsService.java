package ru.netology.stats;

public class StatsService {

    public int getSaleseAmount(int[] salese) {


        int saleseAmount = 0;
        for (int i = 0; i < salese.length; i++) {
            saleseAmount = saleseAmount + salese[i];
        }
        return saleseAmount;
    }

    public int getAverageSaleseAmount(int[] salese) {

        int saleseAmount = 0;
        for (int i = 0; i < salese.length; i++) {
            saleseAmount = saleseAmount + salese[i];

        }
        int averageSalesAmount = saleseAmount / salese.length;
        return averageSalesAmount;
    }

    public int getMaxMount(int[] salese) {

        int maxMount = 0;
        for (int i = 0; i < salese.length; i++) {
            if (salese[i] >= salese[maxMount]) {
                maxMount = i;

            }
        }
        return maxMount + 1;


    }

    public int getMinMount(int[] salese) {

        int minMount = 0;
        for (int i = 0; i < salese.length; i++) {
            if (salese[i] <= salese[minMount]) {
                minMount = i;

            }
        }
        return minMount + 1;
    }

    public int getOverAverageSaleseAmount(int[] salese) {

        int averageSalesAmount = getAverageSaleseAmount(salese);
        int overAverageSaleseAmount = 0;
        for (int j = 0; j < salese.length; j++)

            if (salese[j] > averageSalesAmount) {
                overAverageSaleseAmount++;
            }

        return overAverageSaleseAmount;
    }


    public int getUnderAverageSaleseAmount(int[] salese) {

        int averageSalesAmount = getAverageSaleseAmount(salese);
        int underAverageSaleseAmount = 0;
        for (int j = 0; j < salese.length; j++)

            if (salese[j] <= averageSalesAmount) {
                underAverageSaleseAmount++;
            }

        return underAverageSaleseAmount;
    }


}

