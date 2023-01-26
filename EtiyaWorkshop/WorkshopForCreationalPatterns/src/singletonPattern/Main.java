package singletonPattern;

import singletonPattern.services.HumanCloneService;
import singletonPattern.services.ICloneService;

public class Main {
    public static void main(String[] args) {

        Thread thread = new Thread(new clonningThread1());
        Thread thread1 = new Thread(new clonningThread2());
        thread.start();
        thread1.start();

    }

    static class  clonningThread1 implements Runnable{

        @Override
        public void run() {
            ICloneService iCloneService = new HumanCloneService("Human");
            iCloneService.clonne();
        }
    }

    static class clonningThread2 implements Runnable{

        @Override
        public void run() {
            ICloneService iCloneService = new HumanCloneService("Human - Human");
            iCloneService.clonne();
        }
    }
}
