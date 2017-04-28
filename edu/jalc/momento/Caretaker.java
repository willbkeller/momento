package edu.jalc.momento;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

  ArrayList<Message> getAll(State context){
    ArrayList<Message> filtered = null;

    if(context == State.WARN){
      filtered = (ArrayList<Message>) this.getWarnings();
    }

    return filtered;
  }

  private List<Message> getWarnings(){
    return events.parallelStream().filter((message) -> message instanceof WarnMSG).collect(Collectors.toList());
  }
}
