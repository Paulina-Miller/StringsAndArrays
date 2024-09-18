package ru.netology.StringsAndArrays.stats;
public class StatsService {

    //1. Метод для расчета суммы всех продаж
    public long totalSales(long[] sales) {
        long total = 0;
        for (long sale : sales) {
            total += sale;
        }
        return total;
    }

    //2. Метод для расчета средней суммы продаж в месяц
    public double averageSales(long[] sales) {
        double total = totalSales(sales);
        return total / sales.length;
    }

    //3. Метод для нахождения номера месяца с пиковыми продажами
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }


    //4. Метод для нахождения номера месяца с минимумом продаж
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    //5. Метод для подсчета месяцев с продажами ниже среднего
    public int monthsBelowAverage(long[] sales) {
        double average = averageSales(sales);
        int month = 0;
        for (long sale : sales) {
            if (sale < average) {
                month++;
            }
        }
        return month;
    }

    //6. Метод для подсчета месяцев с продажами выше среднего
    public int monthsAboveAverage(long[] sales) {
        double average = averageSales(sales);
        int month= 0;
        for (long sale : sales) {
            if (sale > average) {
                month++;
            }
        }
        return month;
    }

}

