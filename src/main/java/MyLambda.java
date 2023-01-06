import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyLambda {
    public static void main(String[] args) {
        JButton jButton = new JButton();
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello World");
            }
        });

        JButton jButton2 = new JButton();
        jButton2.addActionListener(e -> System.out.println("Hello World"));
    }


    //SAM - Single Abstract Method
    //Abstract class has only one method
}
