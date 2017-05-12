/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import org.bluray.ui.event.HRcEvent;
import org.dvb.event.UserEvent;
import org.dvb.event.UserEventListener;
import org.dvb.event.UserEventRepository;
import org.havi.ui.HComponent;

/**
 *
 * @author student
 */
public class Playfield extends HComponent implements UserEventListener {

    ArrayList slang=new ArrayList();
    int hx=100;
    int hy=100;
    int r=1;    //richting
    
    public Playfield()
    {
        this.setBounds(0,0,720,576); // full screen
        
    }
    
    public void paint(Graphics g)
    {
        for (int i=0;i<slang.size();i++)
        {
            g.setColor(Color.GREEN);
            SlangSegment s=new SlangSegment();
            s=(SlangSegment)slang.get(i);
            
            g.fillOval(s.x,s.y , 10, 10);
            
        }
    }

    
    public void run()
    {
        SlangSegment s=new SlangSegment();
        if (r==1) hx=hx+10;
        s.x=hx;
        s.y=hy;
  
        slang.add(s);
        this.repaint();
    }
    public void userEventReceived(UserEvent e) {
  
}
}

