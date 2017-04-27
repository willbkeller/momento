package edu.jalc.momento;

import java.util.ArrayList;

public class Caretaker{

  private ArrayList<Message> events = new ArrayList<>();

  Caretaker(){

  }

  void add(Message msg){
    events.add(msg);
  }

  Message get(int i){
    return events.get(i);
  }
}
