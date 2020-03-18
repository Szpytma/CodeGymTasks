package pl.codegym.task.task14.task1408;

/* 
Ferma drobiu
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Continent.AFRICA);
        hen.getMonthlyEggCount();
    }

    static class HenFactory {

        static Hen getHen(String continent) {
            Hen hen = null;
            //tutaj wpisz swój kod
            if (continent.equals(Continent.AFRICA)) {
                hen = new AfricanHen();
            }
            if (continent.equals(Continent.ASIA)) {
                hen = new AsianHen();
            }
            if (continent.equals(Continent.NORTHAMERICA)) {
                hen = new NorthAmericanHen();
            }
            if (continent.equals(Continent.EUROPE)) {
                hen = new EuropeanHen();
            }
            return hen;
        }
    }
}
