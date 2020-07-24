package ru.netology.stats;

class StatsService {
    public long sumSales(long[] sales) {
        long sum = 0;
        for (long purchase : sales) {
            sum += purchase;
        }
        return sum;
    }

    public long averageMonthlySales(long[] sales) {
        long sum = 0;
        for (long purchase : sales) {
            sum += purchase;
        }
        long averageSales = sum / 12;
        return averageSales;
    }

    public long peakSales(long[] sales) {
        long peakSale = 0;
        long peakMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            int month = i;
            if (sales[i] >= peakSale) {
                peakSale = sales[i];
                peakMonth = month + 1;
            }
        }
        return peakMonth;
    }

    public long minSales(long[] sales) {
        long minSale = sales [0];
        long minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            int month = i;
            if (minSale >= sales[i]) {
                minSale = sales[i];
                minMonth = month + 1;
            }
        }
        return minMonth;
    }

    public long sumMonthsMinSales(long[] sales) {
        long sum = 0;
        for (long purchase : sales) {
            sum += purchase;
        }
        long averageSales = sum / 12;
        int month = 0;
        for (long purchase : sales) {
            long sale = purchase;
            if (averageSales > sale)
                month += 1;
        }
        return month;
    }

    public long sumMonthsPeakSales(long[] sales) {
        long sum = 0;
        for (long purchase : sales) {
            sum += purchase;
        }
        long averageSales = sum / 12;
        int month = 0;
        for (long purchase : sales) {
            long sale = purchase;
            if (averageSales < sale)
                month += 1;
        }
        return month;
    }
}