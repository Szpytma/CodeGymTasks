package pl.codegym.task.task12.task1226;

/* 
Wspinaj się, lataj i biegaj
*/

public class Solution {

    public interface CanFly {

        void fly();

    }
    public interface CanClimb {

        void climb();
    }
    public interface CanRun {

        void run();
    }

    public static void main(String[] args) {

    }

    public class Cat implements CanClimb, CanRun {

        @Override
        public void climb() {

        }

        @Override
        public void run() {

        }
    }

    public class Dog implements CanClimb, CanRun{

        @Override
        public void climb() {

        }

        @Override
        public void run() {

        }
    }

    public class Tiger extends Cat implements CanClimb, CanRun{

    }

    public class Duck implements CanFly, CanRun {

        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }
    }
}
