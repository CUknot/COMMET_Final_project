package Application;

import entity.Bullet;

public class MoveBulletThread extends Thread {
    public void run() {
        System.out.println("Thread run successfully");
        while (true) {
            for (Bullet bullet : Bullet.getBullets()) {
                bullet.update();
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}