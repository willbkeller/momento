package edu.jalc.momento;

import java.util.ArrayList;

public class Originator{

  Caretaker caretaker = new Caretaker();

  private State state;
  private String message;

  public void setState(State state, String message){
    this.state = state;
    this.message = message;
  }

  public String getState(){
    return message;
  }

  public void save(){
    Message msg;
    if(State.DEBUG == this.state){msg = new DebugMSG(message);}
    else if(State.TRACE == this.state){msg = new TraceMSG(message);}
    else if(State.INFO == this.state){msg = new InfoMSG(message);}
    else if(State.WARN == this.state){msg = new WarnMSG(message);}
    else if(State.ERROR == this.state){msg = new ErrorMSG(message);}
    else{msg = new FatalMSG(message);}
    caretaker.add(msg);
  }

  public Message getStateFromCaretaker(int i){
    return caretaker.get(i);
  }

  public ArrayList<Message> getWarnings(){
    return caretaker.getAll(State.WARN);
  }
}
