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
    o.setState(State.ERROR, "error");
    o.save();
    System.out.println(o.getStateFromCaretaker(2));
    o.setState(State.FATAL, "fatal");
    o.save();
    System.out.println(o.getStateFromCaretaker(3));
    o.setState(State.INFO, "info");
    o.save();
    System.out.println(o.getStateFromCaretaker(4));
    o.setState(State.WARN, "warning");
    o.save();
    System.out.println(o.getStateFromCaretaker(5));
  }
}
