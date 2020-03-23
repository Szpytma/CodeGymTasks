package pl.codegym.task.task15.task1511;

import java.io.Serializable;

/* 
Najprostszy kod: część 1
*/

public class Solution {
    public static void main(String[] args) {
        JuniorJavaDev me = new JuniorJavaDev();
        System.out.println(me.askHubert());
        System.out.println(me.askZapp());
    }

    public interface SpecificSerializable extends Serializable {
    }

    public static class JavaDev implements SpecificSerializable {
        String answerQuestion(String question) {
            return String.format("Zastanowię się nad [%s]", question);
        }
    }

    public static class JuniorJavaDev extends JavaDev {
        JavaDev zapp = new JavaDev();
        JavaDev hubert = new JavaDev();

        String askZapp() {
            return zapp.answerQuestion("Kiedy pojawi się następna aktualizacja?");
        }

        String askHubert() {
            return hubert.answerQuestion("Co sądzisz o com.codegym.task.task15.task1511?");
        }
    }
}
