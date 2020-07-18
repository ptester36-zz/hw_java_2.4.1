package ru.netology.stats;

class StatsService {
    public long sumSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long sum = 0;
        for (long purchase : sales) {
            sum += purchase;
        }
        return sum;
    }

    public long averageMonthlySales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long sum = 0;
        for (long purchase : sales) {
            sum += purchase;
        }
        long averageSales = sum / 12;
        return averageSales;
    }

    public long peakSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 19, 7, 14, 14, 18};
        long peakSale = 0;
        long peakMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            int month = i;
            if (sales[i] > peakSale) {
                peakSale = sales[i];
                peakMonth = month + 1;
            }
        }
        return peakMonth;
    }

    public long minSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 19, 7, 14, 14, 18};
        long minSale = sales [0];
        long minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            int month = i;
            if (minSale > sales[i]) {
                minSale = sales[i];
                minMonth = month + 1;
            }
        }
        return minMonth;
    }

    public long sumMonthsMinSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 19, 7, 14, 18, 24};
        long sum = 0;
        for (long purchase : sales) {
            sum += purchase;
        }
        long averageSales = sum / 12;
        System.out.println(averageSales);
        int month = 0;
        for (long purchase : sales) {
            long sale = purchase;
            if (averageSales > sale)
                month += 1;
        }
        return month;
    }

    public long sumMonthsPeakSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 19, 7, 14, 18, 24};
        long sum = 0;
        for (long purchase : sales) {
            sum += purchase;
        }
        long averageSales = sum / 12;
        System.out.println(averageSales);
        int month = 0;
        for (long purchase : sales) {
            long sale = purchase;
            if (averageSales < sale)
                month += 1;
        }
        return month;
    }
}