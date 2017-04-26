package edu.jalc.momento;

import java.util.ArrayList;

public class Caretaker{

  private ArrayList<Momento> events = new ArrayList<>();

  Caretaker(){

  }

  void add(Momento m){
    events.add(m);
  }

  Momento get(int i){
    return events.get(i);
  }
}
