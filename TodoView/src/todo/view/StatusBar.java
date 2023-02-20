/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todo.view;

import java.awt.Component;
import javax.swing.JLabel;
import org.openide.awt.StatusLineElementProvider;
import org.openide.util.lookup.ServiceProvider;

/**
 * The application's status bar.
 */
@ServiceProvider(service = StatusLineElementProvider.class, position = 1)
public class StatusBar implements StatusLineElementProvider {

    @Override
    public Component getStatusLineElement() {
        return new JLabel("There are no task alerts for today.");
    }
}
