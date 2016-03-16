//********************************************************************
//  KochPanel.java       Author: Lewis/Loftus/Cocking
//
//  Represents a drawing surface on which to paint a Koch Snowflake.
//********************************************************************

import java.awt.*;
import javax.swing.JPanel;
import java.awt.geom.Line2D;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

public class KochPanel extends JPanel
{
   private final int PANEL_WIDTH = 1000;
   private final int PANEL_HEIGHT = 1000;
   
   private final double ANGLE = 30;
   private final double SQ = Math.sqrt(3.0) / 6;

   private final int TOPX = 200, TOPY = 20;
   private final int LEFTX = 60, LEFTY = 300;
   private final int RIGHTX = 340, RIGHTY = 300;

   private int current; //current order

   //-----------------------------------------------------------------
   //  Sets the initial fractal order to the value specified.
   //-----------------------------------------------------------------
   public KochPanel (int currentOrder)
   {
      current = currentOrder;
      setBackground (Color.black);
      setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
   }

   //-----------------------------------------------------------------
   //  Draws the fractal recursively. Base case is an order of 1 for
   //  which a simple straight line is drawn. Otherwise three
   //  intermediate points are computed, and each line segment is
   //  drawn as a fractal.
   //-----------------------------------------------------------------
   public void drawFractal (double x, double y, double angle, double length, Graphics2D g2)
   {
      
      double x_2 = x - length * Math.sin(angle);
      double y_2 = y - length * Math.cos(angle);
      
      double x_3 = x + length * Math.sin(angle);
      double y_3 = y + length * Math.cos(angle);
      
      
      Line2D.Double nextline = new Line2D.Double(x,y,x_2,y_2);
      
      g2.draw(nextline);

      if(length <= 1)
      {
          return;
      }
      else
      {
          drawFractal(x_2,y_2,angle + ANGLE,length-5,g2);
          
          drawFractal(x_2,y_2,angle - ANGLE,length-5,g2);
          
          
      }
       
       
       
   }

   //-----------------------------------------------------------------
   //  Performs the initial calls to the drawFractal method.
   //-----------------------------------------------------------------
   public void paintComponent (Graphics g)
   {
      super.paintComponent (g);

      Graphics2D g2 = (Graphics2D) g;
      g2.setColor(new Color(100,50,190));
      drawFractal(500,800,0,100,g2);
   }

   //-----------------------------------------------------------------
   //  Sets the fractal order to the value specified.
   //-----------------------------------------------------------------
   public void setOrder (int order)
   {
      current = order;
   }

   //-----------------------------------------------------------------
   //  Returns the current order.
   //-----------------------------------------------------------------
   public int getOrder ()
   {
      return current;
   }
}
