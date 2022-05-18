package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] salesOfMonth) {
        int sum = 0;
        for (int eachSalesMonth : salesOfMonth) {
            sum += eachSalesMonth;
        }
        return sum;
    }

    public int calculateAvg(int[] salesOfMonth) {
        return calculateSum(salesOfMonth) / salesOfMonth.length;
    }

    public int findMax(int[] salesOfMonth) {
        int currentMax = 0;
        int month = 0;
        for (int eachSalesMonth : salesOfMonth) {
            if (eachSalesMonth >= salesOfMonth[currentMax]) {
                currentMax = month;
            }
            month = month + 1;
        }
        return currentMax + 1;
    }

    public int findMin(int[] salesOfMonth) {
        int currentMin = 0;
        int month = 0;
        for (int eachSalesMonth : salesOfMonth) {
            if (eachSalesMonth <= salesOfMonth[currentMin]) {
                currentMin = month;
            }
            month = month + 1;
        }
        return currentMin + 1;
    }

    public int belowAvg(int[] salesOfMonth) {
        int currentBelowAvg = 0;
        int avg = calculateSum(salesOfMonth) / salesOfMonth.length;
        for (int eachSalesMonth : salesOfMonth) {
            if (eachSalesMonth < avg) {
                currentBelowAvg++;
            }
            ;
        }
        return currentBelowAvg++;
    }

    public int overAvg(int[] salesOfMonth) {
        int currentOverAvg = 0;
        int avg = calculateSum(salesOfMonth) / salesOfMonth.length;
        for (int eachSalesMonth : salesOfMonth) {
            if (eachSalesMonth > avg) {
                currentOverAvg++;
            }
            ;
        }
        return currentOverAvg++;
    }
}
