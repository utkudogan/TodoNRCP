package todo.model;

import java.beans.PropertyChangeListener;
import java.util.List;

/**
 * Common interface for all TaskManagers.
 *
 * @author ikost
 */
public interface TaskManagerInterface {

    void addTask(Task task) throws ValidationException;

    List<Task> listAllTasks(boolean priorityOrDate);

    List<Task> listTasksWithAlert() throws ModelException;

    void markAsCompleted(final int id, final boolean completed);

    void removeTask(final int id);

    void updateTask(Task task) throws ValidationException;

    void addPropertyChangeListener(PropertyChangeListener listener);

    void removePropertyChangeListener(PropertyChangeListener listener);

}
