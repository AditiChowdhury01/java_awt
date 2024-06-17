import java.awt.*;
import java.awt.event.*;


public class swapElement extends Frame{
Label l1,l2;
TextField t1,t2;
Button b;
super("My Frame");
swapElement(){
l1 = new Label("first");
l2 = new Label("Second");

t1 = new TextField(10);
t2 = new TextField(10);

b = new Button("ok");

add(l1);
add(t1);
add(l2);
add(t2);
add(b);
setLayout(new FlowLayout());

}
public static void main(String[] args){
swapElement s = new swapElement();

s.setSize(300,300);
s.setVisible(true);
}
}