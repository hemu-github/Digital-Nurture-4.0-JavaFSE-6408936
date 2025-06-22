public class FinancialForecast {

    public static double forecastRecursive(double presentValue, double rate, int years) {

        if (years == 0) {

            return presentValue;

        }

        return forecastRecursive(presentValue * (1 + rate), rate, years - 1);

    }

    public static double forecastIterative(double presentValue, double rate, int years) {

        for (int i = 0; i < years; i++) {

            presentValue *= (1 + rate);

        }

        return presentValue;

    }

    public static void main(String[] args) {
        double presentValue = 10000;
        double rate = 0.05;
        int years = 5;

        double futureValueRecursive = forecastRecursive(presentValue, rate, years);
        double futureValueIterative = forecastIterative(presentValue, rate, years);

        System.out.printf("Future Value (Recursive) after %d years: %.2f\n", years, futureValueRecursive);
        System.out.printf("Future Value (Iterative) after %d years: %.2f\n", years, futureValueIterative);
    }
}
