/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todo.view;

import java.beans.IntrospectionException;
import java.util.List;
import org.openide.nodes.ChildFactory;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;
import todo.model.Task;
import todo.model.TaskManagerInterface;

/**
 *
 * @author utku
 */
public class TaskChildFactory extends ChildFactory<Task> {

    @Override
    protected boolean createKeys(final List<Task> toPopulate) {
        final TaskManagerInterface taskManager
                = Lookup.getDefault().lookup(TaskManagerInterface.class);
        toPopulate.addAll(taskManager.listAllTasks(true));
        return true;
    }

    @Override
    protected Node createNodeForKey(final Task key) {
        TaskNode taskNode = null;
        try {
            taskNode = new TaskNode(key);
        } catch (IntrospectionException ex) {
            Exceptions.printStackTrace(ex);
        }
        return taskNode;
    }
}
