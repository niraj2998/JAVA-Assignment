package com.java.org;
abstract class base{
    public base() {
        System.out.println("make shape");    }
    abstract public void draw();
}
class line extends base{
    public void draw() {
        System.out.println("line");
    }
}
class rectangle extends base{
    public void draw() {
        System.out.println("rectangle");
    }
}
 class cube extends base{
    public void draw() {
        System.out.println("cube");
    }
}
public class Shapes {

 

    public static void main(String[] args) {
      line l=new line();
      l.draw();
      rectangle r=new rectangle();
      r.draw();
      cube c=new cube();
      c.draw();
      
    }

 

}