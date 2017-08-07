/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Gabriel
 */
public class MiRender extends DefaultTableCellRenderer {
   
  public Component getTableCellRendererComponent(JTable table,Object value, boolean isSelected,boolean hasFocus,int row, int column){
      super.getTableCellRendererComponent (table, value, isSelected, hasFocus, row, column);
         this.setOpaque(true);
         this.setBackground(Color.red);

      return this;
   }

}
    

