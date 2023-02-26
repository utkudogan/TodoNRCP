/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/NetBeansModuleDevelopment-files/actionListener.java to edit this template
 */
package todo.controller.edit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import todo.model.Task;
import todo.view.TaskDetailsDialog;

@ActionID(
        category = "Edit",
        id = "todo.controller.edit.AddTaskAction"
)
@ActionRegistration(
        iconBase = "todo/controller/edit/add_obj.gif",
        displayName = "#CTL_AddTaskAction"
)
@ActionReferences({
    @ActionReference(path = "Menu/Edit", position = 10),
    @ActionReference(path = "Toolbars/Edit", position = 10),
    @ActionReference(path = "Shortcuts", name = "INSERT")
})
@Messages("CTL_AddTaskAction=Add Task...")
public final class AddTaskAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        TaskDetailsDialog taskDetailsDialog = new TaskDetailsDialog(null, true);
        taskDetailsDialog.setNewTask(true);
        taskDetailsDialog.setTask(new Task());
//        taskDetailsDialog.addActionListener(this);
        taskDetailsDialog.setVisible(true);
    }
}
