package chap02;

//********************************************************************
//  Einstein.java       Author: Lewis/Loftus
//
//  Demonstrates a basic applet.
//********************************************************************

import javax.swing.JApplet;
import java.awt.*;

public class Einstein extends JApplet
{
   //-----------------------------------------------------------------
   //  Draws a quotation by Albert Einstein among some shapes.
   //-----------------------------------------------------------------
   public void paint (Graphics page)
   {
      page.drawRect (0, 0, 55, 55);    // square
      page.drawRect (60, 80, 225, 30);   // rectangle
      page.drawOval (75, 80, 20, 20);    // circle
      page.drawLine (55, 55, 100, 120);  // line

      page.drawString ("Out of clutter, find simplicity.", 110, 70);
      page.drawString ("-- Albert Einstein", 130, 100);
   }
}
