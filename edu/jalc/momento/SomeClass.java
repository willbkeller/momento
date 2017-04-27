package edu.jalc.momento;

public class SomeClass{
  public static void main(String[] args) {
    Originator o = new Originator();
    o.setState("Hello");
    o.save();
    System.out.println(o.getStateFromCaretaker(0));
    o.setState("Goodbye");
    o.save();
    System.out.println(o.getStateFromCaretaker(1));
  }
}
