
package pl.codegym.task.task14.task1414;

/* 
MovieFactory
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("soapOpera") || input.equals("cartoon") || input.equals("thriller")) {
                Movie movie = MovieFactory.getMovie(input);
                System.out.println(movie.getClass().getSimpleName());
            } else {
                MovieFactory.getMovie(input);
                break;
            }
        }
    }
    static class MovieFactory {
        static Movie getMovie(String key) {
            Movie movie = null;
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }
            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }
            if ("thriller".equals(key)) {
                movie = new Thriller();
            }
            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }


}
