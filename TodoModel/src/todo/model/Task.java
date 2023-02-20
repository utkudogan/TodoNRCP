package todo.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;

public class Task implements Serializable {

    private int id;
    private String description;
    private int priority;
    private Date dueDate;
    private boolean alert;
    private int daysBefore;
    private String obs;
    private boolean completed;
    private PropertyChangeSupport pcs = null;

    public static final String PROP_ID = "ID CHANGED";
    public static final String PROP_COMPLETED = "COMPLETED CHANGED";
    public static final String PROP_DESCRIPTION = "DESCRIPTION CHANGED";
    public static final String PROP_PRIORITY = "PRIORITY CHANGED";
    public static final String PROP_DUE_DATE = "DUE DATE CHANGED";
    public static final String PROP_ALERT = "ALERT CHANGED";
    public static final String PROP_DAYS_BEFORE = "DAYS BEFORE CHANGED";
    public static final String PROP_OBS = "OBS CHANGED";

    /**
     * @return a thread-safe PropertyChangeSupport
     */
    private PropertyChangeSupport getPropertyChangeSupport() {
        if (pcs == null) {
            pcs = new PropertyChangeSupport(this);
        }
        return pcs;
    }

    public Task() {
        setCompleted(false);
        setAlert(false);
    }

    public Task(int id, String description, int priority, Date dueDate, boolean alert) {
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.dueDate = dueDate;
        this.alert = alert;
    }

    private Calendar getTodayDate() {
        Calendar now = Calendar.getInstance();
        now.set(Calendar.HOUR_OF_DAY, 0);
        now.set(Calendar.MINUTE, 0);
        now.set(Calendar.SECOND, 0);
        now.set(Calendar.MILLISECOND, 0);
        return now;
    }

    public boolean isLate() {
        Date dueDate = getDueDate();
        if (dueDate == null) {
            return false;
        } else {
            return dueDate.compareTo(getTodayDate().getTime()) < 0;
        }
    }

    public boolean hasAlert() {
        Date dueDate = getDueDate();
        if (!getAlert() || dueDate == null) {
            return false;
        } else {
            DateFormat df = DateFormat.getDateInstance();

            Calendar dueDay = Calendar.getInstance();
            dueDay.setTime(dueDate);
            int dias = dueDay.get(Calendar.DAY_OF_YEAR) - getTodayDate().get(Calendar.DAY_OF_YEAR);
            return dias <= getDaysBefore();
        }
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        boolean oldValue = this.completed;
        this.completed = completed;
        getPropertyChangeSupport().firePropertyChange(PROP_COMPLETED, oldValue, completed);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        String oldValue = this.description;
        this.description = description;
        getPropertyChangeSupport().firePropertyChange(PROP_DESCRIPTION, oldValue, description);
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        int oldValue = this.priority;
        this.priority = priority;
        getPropertyChangeSupport().firePropertyChange(PROP_PRIORITY, oldValue, priority);
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        Date oldValue = this.dueDate;
        this.dueDate = dueDate;
        getPropertyChangeSupport().firePropertyChange(PROP_DUE_DATE, oldValue, dueDate);
    }

    public boolean getAlert() {
        return alert;
    }

    public void setAlert(boolean alert) {
        boolean oldValue = this.alert;
        this.alert = alert;
        getPropertyChangeSupport().firePropertyChange(PROP_ALERT, oldValue, alert);

    }

    public int getDaysBefore() {
        return daysBefore;
    }

    public void setDaysBefore(int daysBefore) {
        int oldValue = this.daysBefore;
        this.daysBefore = daysBefore;
        getPropertyChangeSupport().firePropertyChange(PROP_DAYS_BEFORE, oldValue, daysBefore);
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        String oldValue = this.obs;
        this.obs = obs;
        getPropertyChangeSupport().firePropertyChange(PROP_OBS, oldValue, obs);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        int oldValue = this.id;
        this.id = id;
        getPropertyChangeSupport().firePropertyChange(PROP_ID, oldValue, id);
    }

    public void addPropertyChangeListener(final PropertyChangeListener listener) {
        getPropertyChangeSupport().addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(final PropertyChangeListener listener) {
        getPropertyChangeSupport().removePropertyChangeListener(listener);
    }
}
