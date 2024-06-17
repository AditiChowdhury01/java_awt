import java.awt.*;
import java.awt.event.*;

class myFrame extends Frame{
Label l1,l2;
TextField t1,t2;
Button b;
myFrame(){
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
} 
public class swapConst{
public static void main(String[] args){
myFrame f = new myFrame();

f.setSize(300,300);
f.setVisible(true);
}
}