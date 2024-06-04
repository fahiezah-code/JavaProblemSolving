package javaPractise;

import java.util.concurrent.CountDownLatch;

public class MultiThreadingProblem {
    private CountDownLatch latchAfterFirst;
    private CountDownLatch latchAfterSecond;

    public MultiThreadingProblem(){
        latchAfterFirst = new CountDownLatch(1);
        latchAfterSecond = new CountDownLatch(1);
    }

    public void first(Runnable printFirst) throws InterruptedException{

        printFirst.run();
        latchAfterFirst.countDown();
    }
    public void second(Runnable printSecond) throws InterruptedException{
        latchAfterFirst.await();
        printSecond.run();
        latchAfterSecond.countDown();
    }
    public void third(Runnable printThird) throws InterruptedException{
        latchAfterSecond.await();

        printThird.run();
    }
    public static void main(String[] args) {
        MultiThreadingProblem m = new MultiThreadingProblem();
       // m.first("printfirst");
    }

// the other way can use  by nofifyAll() and wait()
    //refer in learning page
}
