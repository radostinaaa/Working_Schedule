public class AllWork {
    private final Task [] tasks = new Task[10];
    private int freePlacesForTasks;
    private int currentUnassignedTask;

    AllWork () {
        this.freePlacesForTasks = 10;
        this.currentUnassignedTask = 0;
    }
    
    public void addTask(Task task){
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] != null) {
                this.tasks[i] = task;
                freePlacesForTasks--;
                currentUnassignedTask++;
                break;
            }
        }
    }

    public Task getNextTask (){
        return tasks[currentUnassignedTask];
    }

    public boolean isAllWorkDone (){
        for (Task task : tasks)
            if (task.getWorkingHours() == 0) {
                return true;
            }
        return false;
    }



    
}
