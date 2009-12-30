/*
 * Created by JFormDesigner on Wed Mar 18 14:18:10 EDT 2009
 */

package edu.yale.plugins.instanceEditor;

import java.awt.*;
import javax.swing.*;

/**
 * @author Lee Mandell
 */
public class MyEditorPanel1 extends JPanel {
    public MyEditorPanel1() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        button1 = new JButton();
        label1 = new JLabel();

        //======== this ========
        setLayout(new BorderLayout());

        //---- button1 ----
        button1.setText("Should See Button");
        add(button1, BorderLayout.NORTH);

        //---- label1 ----
        label1.setText("Embedded Resource Editor Panel");
        label1.setFont(new Font("Lucida Grande", Font.BOLD, 24));
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        add(label1, BorderLayout.CENTER);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    private JButton button1;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
