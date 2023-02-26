/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/NetBeansModuleDevelopment-files/contextAction.java to edit this template
 */
package todo.controller.edit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.openide.util.RequestProcessor.Task;

@ActionID(
        category = "Edit",
        id = "todo.controller.edit.EditTaskAction"
)
@ActionRegistration(
        iconBase = "todo/controller/edit/configs.gif",
        displayName = "#CTL_EditTaskAction"
)
@ActionReferences({
    @ActionReference(path = "Menu/Edit", position = 20),
    @ActionReference(path = "Toolbars/Edit", position = 20),
    @ActionReference(path = "Shortcuts", name = "O-ENTER")
})
@Messages("CTL_EditTaskAction=Edit Task...")
public final class EditTaskAction implements ActionListener {

    private final Task context;

    public EditTaskAction(Task context) {
        this.context = context;
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        // TODO use context
    }
}
