import java.awt.*;
import java.awt.event.*;
class swapapp extends Frame implements ActionListener{
Label l1,l2;
TextField t1,t2;
Button b;

swapapp(){
super("My Frame");

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
b.addActionListener(this);
}
public void actionPerformed(ActionEvent ae){
String temp = t1.getText();
t1.setText(t2.getText());
t2.setText(temp);
}

public static void main(String [] args){
swapapp s = new swapapp();
s.setSize(300,300);
s.setVisible(true);
}}

