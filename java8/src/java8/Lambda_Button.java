package java8;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Lambda_Button extends JFrame  {
	 public Lambda_Button() {
	      super("titre de l'application");

	      WindowListener l = new WindowAdapter() {
	         public void windowClosing(WindowEvent e){
	            System.exit(0);
	         }
	      };

	      addWindowListener(l);
	      JPanel pane=new JPanel();
	      setSize(500,500);
	      JButton button= new JButton("click !");
	      /*
	       * Here We got a lambda expression which write click when we are clicking on the button.
	       * The main interest of a lambda is to have the lower code as possible.
	       * But care lower don't mean don't understandable code, 1 /2 line lambda's are perfect.
	      */
	      button.addActionListener(e -> System.out.println("Click"));
	      /* 
	       * To understand what happend we got mainly 2 news.
	       * the e is our variable (Event e)
	       * And the arrow (->) means what wewill do when this action will be performed
	       * This metod interface fonctionnelle
	       */
	      pane.add(button,BorderLayout.NORTH);
	      this.add(pane);
	      setVisible(true);
	   }

}
