package edu.jalc.momento;

public class SomeClass{
  public static void main(String[] args) {
    Originator o = new Originator();
    o.setState(State.DEBUG, "debug");
    o.save();
    System.out.println(o.getStateFromCaretaker(0));
    o.setState(State.TRACE, "trace");
    o.save();
    System.out.println(o.getStateFromCaretaker(1));
  }
}
