package pl.codegym.task.task03.task0307;

/* 
Witaj, StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        Zerg zerg = new Zerg();
        zerg.imie = "Andrzej";
        Zerg zerg1 = new Zerg();
        zerg1.imie = "Jarek";
        Zerg zerg2 = new Zerg();
        zerg2.imie = "Jurek";
        Zerg zerg3 = new Zerg();
        zerg3.imie = "Maciej";
        Zerg zerg4 = new Zerg();
        zerg4.imie = "Pawel";
        Protoss protoss = new Protoss();
        protoss.imie = "Protos1";
        Protoss protoss1 = new Protoss();
        protoss1.imie = "Protos2";
        Protoss protoss2 = new Protoss();
        protoss2.imie = "Protos3";
        Terranin terranin = new Terranin();
        terranin.imie = "Tera1";
        Terranin terranin2 = new Terranin();
        terranin2.imie = "Tera2";
        Terranin terranin3 = new Terranin();
        terranin3.imie = "Tera3";
        Terranin terranin4 = new Terranin();
        terranin4.imie = "Tera4";

    }

    public static class Zerg {
        public String imie;
    }

    public static class Protoss {
        public String imie;
    }

    public static class Terranin {
        public String imie;
    }
}
