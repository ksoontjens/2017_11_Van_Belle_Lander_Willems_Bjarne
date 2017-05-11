package hellotvxlet;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.tv.xlet.*;
import org.havi.ui.HScene;
import org.havi.ui.HSceneFactory;
import org.havi.ui.HStaticText;
import org.havi.ui.HTextButton;
import org.havi.ui.HVisible;
import org.havi.ui.event.HActionListener;


public class HelloTVXlet implements Xlet, HActionListener {

  HScene scene;
    public HelloTVXlet() {
        
    }

    public void initXlet(XletContext context) {
      
     scene=HSceneFactory.getInstance().getDefaultHScene();
      
      HStaticText label1=new HStaticText("hello world",350,50,100,50); //x,y,w,h
      label1.setBackground(Color.BLUE);
      label1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      
      HTextButton knop2=new HTextButton("knop 2",350,250,100,50); //x,y,w,h
      knop2.setBackground(Color.BLUE);
      knop2.setBackgroundMode(HVisible.BACKGROUND_FILL);
      
      HTextButton knop4=new HTextButton("knop 4",350,350,100,50); //x,y,w,h
      knop4.setBackground(Color.BLUE);
      knop4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      
      HTextButton knop3=new HTextButton("knop 3",150,350,100,50); //x,y,w,h
      knop3.setBackground(Color.BLUE);
      knop3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      
      HTextButton knop1=new HTextButton("knop 1",150,250,100,50); //x,y,w,h
      knop1.setBackground(Color.BLUE);
      knop1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      
      knop1.setFocusTraversal(null, knop2, null, null); //up down left right
      knop2.setFocusTraversal(knop1, null, null, null);
      knop3.setFocusTraversal(null, null, null, null);
      knop4.setFocusTraversal(null, null, null, null);
      
      knop1.setActionCommand("knop1");
      knop1.addHActionListener(this);   //niet oplossen met wizard  
                                        //toevoegen vanboven aan interface
                                        //HActionListener toeveogen bij implements
      
      scene.add(label1);
      scene.add(knop1);
      scene.add(knop2);
      scene.add(knop3);
      scene.add(knop4);
      
      scene.validate(); 
      scene.setVisible(true);
      
      knop1.requestFocus();
      
    }

    public void startXlet() {
    
    }

    public void pauseXlet() {
     
    }

    public void destroyXlet(boolean unconditional) {
     
    }

    public void actionPerformed(ActionEvent arg0) {
        System.out.println(arg0.getActionCommand());
    }
}
