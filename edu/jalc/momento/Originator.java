package edu.jalc.momento;

public class Originator{

  Caretaker caretaker = new Caretaker();

  private String State;

  public void setState(String state){
    this.State = state;
  }

  public String getState(){
    return State;
  }

  public void save(){
    Momento momento = new Momento(getState());
    caretaker.add(momento);
  }

  public Momento getStateFromCaretaker(int i){
    return caretaker.get(i);
  }
}
