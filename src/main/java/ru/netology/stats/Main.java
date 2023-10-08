package ru.netology.stats;
import ru.netology.stats.StatsService;

public class Main {

    public static void main(String[] args) {
        StatsService service = new StatsService();

        int saleseAmount = service.getSaleseAmount();
        System.out.println("Сумма всех продаж за год: " + saleseAmount + " млн. руб.");

        int averageSalesAmount = service.getAverageSaleseAmount();
        System.out.println("Средняя сумма проаж за месяц: " + averageSalesAmount + " млн. руб.");

        int maxMount = service.getMaxMount();
        System.out.println("Номер месяца, в котором был пик продаж: " + maxMount);

        int minMount = service.getMinMount();
        System.out.println("Номер месяца, в котором был минимум продаж: " + minMount);

        int overAverageSaleseAmountMount = service.getOverAverageSaleseAmount();
        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + overAverageSaleseAmountMount);

        int underAverageSaleseAmountMount = service.getUnderAverageSaleseAmount();
        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + underAverageSaleseAmountMount);


    }

}
