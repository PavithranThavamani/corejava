package com.onebill.defaultobjects;

import java.util.LinkedList;

public class Demo {
  @Override
  public String toString() {
    return "0";
  }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof LinkedList<?>) {
      return true;
    }else {
      return false;
    }
  }
  @Override
  public int hashCode(){
    return 1;
  }
  
  
  @Override
  protected void finalize() throws Throwable{
    System.out.println("this is from finalize");
  }
  
  
  public static void main(String[] args) {
    Demo demo1= new Demo();
    System.out.println(demo1);
    
    Demo demo2= new Demo();
    System.out.println("this is object 2 of demo"+ demo2);
    
    
    demo1= null;
    
    Demo demo3= new Demo();
    int hashcode=demo3.hashCode();
    System.out.println(hashcode);
    demo2=null;
    demo3=null;
    System.gc();
    
    
  }

}