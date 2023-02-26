/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/NetBeansModuleDevelopment-files/actionListener.java to edit this template
 */
package todo.controller.options;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Options",
        id = "todo.controller.options.SortByDueDateAction"
)
@ActionRegistration(
        iconBase = "todo/controller/options/next_nav.gif",
        displayName = "#CTL_SortByDueDateAction"
)
@ActionReferences({
    @ActionReference(path = "Menu/Options", position = 30, separatorAfter = 35),
    @ActionReference(path = "Toolbars/Options", position = 30),
    @ActionReference(path = "Shortcuts", name = "F12")
})
@Messages("CTL_SortByDueDateAction=Sort by Due Date")
public final class SortByDueDateAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}
