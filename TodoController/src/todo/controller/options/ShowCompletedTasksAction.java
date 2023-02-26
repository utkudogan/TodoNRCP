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
        id = "todo.controller.options.ShowCompletedTasksAction"
)
@ActionRegistration(
        iconBase = "todo/controller/options/showtsk_tsk.gif",
        displayName = "#CTL_ShowCompletedTasksAction",
        lazy = true
)
@ActionReferences({
    @ActionReference(path = "Menu/Options", position = 10),
    @ActionReference(path = "Toolbars/Options", position = 10),
    @ActionReference(path = "Shortcuts", name = "F10")
})
@Messages("CTL_ShowCompletedTasksAction=Show completed tasks")
public final class ShowCompletedTasksAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }
}
