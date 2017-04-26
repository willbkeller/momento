package edu.jalc.momento;

public class SomeClass{
  public static void main(String[] args) {
    Originator o = new Originator();
    o.setState("hello");
    o.save();
    System.out.println(o.getStateFromCaretaker(0));

  }
}
