import java.awt.*; 
import java.awt.event.*; 
import java.applet.*; 
public class LineDemo extends Applet 
{ 
 int x1=0,y1=0; 
 int flag=1; 
 public void init() 
 { 
  addMouseListener(new InnerClicked()); 
  addMouseMotionListener(new InnerMoved()); 
 } 
 class InnerClicked extends MouseAdapter 
 { 
  public void mouseClicked(MouseEvent me) 
  { 
   if(flag==1) 
   { 
    x1=me.getX(); 
    y1=me.getY(); 
    flag=2; 
   } 
  } 
 } 
 class InnerMoved extends MouseMotionAdapter 
 { 
  public void mouseMoved(MouseEvent me) 
  { 
   int x=me.getX(); 
   int y=me.getY(); 
   Graphics g=getGraphics(); 
   if(flag==2) 
   { 
    g.setColor(Color.red); 
    g.drawLine(x,y,x1,y1); 
    x1=x; 
    y1=y; 
   } 
  }   
 } 
} 
/* 
<applet code="LineDemo.class" width="500" height="500"> 
</applet> 
*/ 
 