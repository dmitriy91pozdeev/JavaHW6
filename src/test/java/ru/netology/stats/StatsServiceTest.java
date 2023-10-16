package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void salesAmountCalculation() {
        StatsService service = new StatsService();

        int[] salese = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        int expected = 180;

        int actual = service.getSaleseAmount(salese);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void AverageSalesCalculation() {
        StatsService service = new StatsService();

        int[] salese = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        int expected = 15;

        int actual = service.getAverageSaleseAmount(salese);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchMaxSales() {
        StatsService service = new StatsService();

        int[] salese = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        int expected = 8;

        int actual = service.getMaxMount(salese);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchMinSales() {
        StatsService service = new StatsService();

        int[] salese = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        int expected = 9;

        int actual = service.getMinMount(salese);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchOverAverageSales() {
        StatsService service = new StatsService();

        int[] salese = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        int expected = 5;

        int actual = service.getOverAverageSaleseAmount(salese);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchUnderAverageSales() {
        StatsService service = new StatsService();

        int[] salese = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        int expected = 7;

        int actual = service.getUnderAverageSaleseAmount(salese);
        Assertions.assertEquals(expected, actual);
    }
}
