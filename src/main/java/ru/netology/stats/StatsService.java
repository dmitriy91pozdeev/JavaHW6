package ru.netology.stats;

public class StatsService {

    public int getSaleseAmount() {

        int[] salese = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int saleseAmount = 0;
        for (int i = 0; i < salese.length; i++) {
            saleseAmount = saleseAmount + salese[i];
        }
        return saleseAmount;
    }

    public int getAverageSaleseAmount() {
        int[] salese = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int saleseAmount = 0;
        for (int i = 0; i < salese.length; i++) {
            saleseAmount = saleseAmount + salese[i];

        }
        int averageSalesAmount = saleseAmount / salese.length;
        return averageSalesAmount;
    }

    public int getMaxMount() {
        int[] salese = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int maxMount = 0;
        for (int i = 0; i < salese.length; i++) {
            if (salese[i] >= salese[maxMount]) {
                maxMount = i;

            }
        }
        return maxMount + 1;


    }

    public int getMinMount() {
        int[] salese = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int minMount = 0;
        for (int i = 0; i < salese.length; i++) {
            if (salese[i] <= salese[minMount]) {
                minMount = i;

            }
        }
        return minMount + 1;
    }

    public int getOverAverageSaleseAmount() {
        int[] salese = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int averageSalesAmount = getAverageSaleseAmount();
        int overAverageSaleseAmount = 0;
        for (int j = 0; j < salese.length; j++)

            if (salese[j] > averageSalesAmount) {
                overAverageSaleseAmount++;
            }

        return overAverageSaleseAmount;
    }


    public int getUnderAverageSaleseAmount() {
        int[] salese = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int averageSalesAmount = getAverageSaleseAmount();
        int underAverageSaleseAmount = 0;
        for (int j = 0; j < salese.length; j++)

            if (salese[j] <= averageSalesAmount) {
                underAverageSaleseAmount++;
            }

        return underAverageSaleseAmount;
    }


}

