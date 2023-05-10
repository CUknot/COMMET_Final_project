package Application;

import entity.Bullet;

public class movebullet extends Thread{
	public void run() {
		System.out.println("thread run sucessfully");
		while(true) {
			for (Bullet bullet: Bullet.getBullets()) {
				bullet.update();
			}
		}
	}
}
