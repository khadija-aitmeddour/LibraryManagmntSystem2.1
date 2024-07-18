package view.component;
import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonCellRenderer extends AbstractCellEditor implements TableCellRenderer {
    private JButton button;

    public ButtonCellRenderer() {
        button = new JButton("Button");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
            }
        });
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        return button;
    }
    @Override
    public Object getCellEditorValue() {
        return null;
    }

}
