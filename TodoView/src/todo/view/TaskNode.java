/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todo.view;

import java.beans.IntrospectionException;
import org.openide.nodes.BeanNode;
import todo.model.Task;

/**
 *
 * @author utku
 */
public class TaskNode extends BeanNode<Task>{
    
    public TaskNode(Task bean) throws IntrospectionException {
        super(bean);
    }
    
}
