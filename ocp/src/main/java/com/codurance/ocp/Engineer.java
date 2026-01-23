package com.codurance.ocp;

public class Engineer implements IPayAmount {
  private int salary;

  public Engineer(int salary)
  {
    this.salary = salary;
  }

  @Override
  public int payAmount()
  {
    return salary;
  }
}
