
package classes;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author LENOVO
 */
public class TablaImagen extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean inSelected, boolean hasFocus, int row, int column) {
        
        //Verifica si variable "value" es tipo JLabel 
        if(value instanceof JLabel){
            JLabel lbl = (JLabel)value;
            return lbl;            
        }
        return super.getTableCellRendererComponent(table, value, inSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
