package BuildingH2O;

import java.util.concurrent.Semaphore;

public class H2O {

    Semaphore sH;
    Semaphore sO;
    private int i;

    public H2O() {
        sH = new Semaphore(2);
        sO = new Semaphore(0);
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        sH.acquire();
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        releaseHydrogen.run();
        i++;
        if (i % 2 == 0) {
            sO.release();
        }
<<<<<<< HEAD
        sH.release();
=======
>>>>>>> origin/feature
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        sO.acquire();
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
        releaseOxygen.run();
        sH.release(2);
<<<<<<< HEAD
=======

>>>>>>> origin/feature
    }
}
