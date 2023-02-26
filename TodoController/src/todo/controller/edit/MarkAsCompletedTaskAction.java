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
        id = "todo.controller.edit.MarkAsCompletedTaskAction"
)
@ActionRegistration(
        iconBase = "todo/controller/edit/complete_tsk.gif",
        displayName = "#CTL_MarkAsCompletedTaskAction"
)
@ActionReferences({
    @ActionReference(path = "Menu/Edit", position = 40, separatorBefore = 35),
    @ActionReference(path = "Toolbars/Edit", position = 40),
    @ActionReference(path = "Shortcuts", name = "D-SPACE")
})
@Messages("CTL_MarkAsCompletedTaskAction=Mark as Completed")
public final class MarkAsCompletedTaskAction implements ActionListener {

    private final Task context;

    public MarkAsCompletedTaskAction(Task context) {
        this.context = context;
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        // TODO use context
    }
}
