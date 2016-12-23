package com.head.first.ood;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {

  private boolean open;
  private Bark allowedBark;

  public DogDoor() {
    this.open = false;
  }

  public void setAllowedBark(Bark bark) {
    this.allowedBark = bark;
  }

  public Bark getAllowedBark() {
    return allowedBark;
  }

  public void open() {
    System.out.println("The dog door opens.");
    open = true;

    final Timer timer = new Timer();
    timer.schedule(new TimerTask() {
      public void run() {
        close();
        timer.cancel();
      }
    }, 5000);
  }

  public void close() {
    System.out.println("The dog door closes.");
    open = false;
  }

  public boolean isOpen() {
    return open;                      
  }                  
}
