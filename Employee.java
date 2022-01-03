public class Employee {
    private String name;
    private Task currentTask;
    private int hoursLeft = 8;
    private boolean isWorking;

    public Employee(String name) {
        setName(name);
    }

    public void setName(final String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        }
    }
    public String getName() {
        return this.name;
    }

    public Task getCurrentTask() {
        return this.currentTask;
    }

    public void setCurrentTask(final Task currentTask) {
        if (currentTask != null && currentTask.getWorkingHours()>0) {
            this.currentTask = currentTask;
        }
    }

    public int getHoursLeft() {
        return this.hoursLeft;
    }

    public void setHoursLeft(int hoursLeft) {
        if (hoursLeft >= 0 ) {
            this.hoursLeft = hoursLeft;
        }
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean isWorking) {
        this.isWorking = isWorking;
    }
    public void work(){
        this.setWorking(false);
        if (this.getCurrentTask() != null && this.getCurrentTask().getWorkingHours() != 0 && this.getHoursLeft() !=0){
            this.setWorking(true);
             if (this.getHoursLeft() < this.getCurrentTask().getWorkingHours()){
                 this.getCurrentTask().setWorkingHours(this.getCurrentTask().getWorkingHours());
                 this.getCurrentTask().setWorkingHours(0);
             }
             else{
                 this.getCurrentTask().setWorkingHours(0);
                 this.setHoursLeft(0);
             }
        }

    }
    public void showReport (){
        if (this.isWorking()){
            System.out.println("Employee's name : "+ this.getName());
            System.out.println("Current task : "+ this.getCurrentTask().getName());
            System.out.println("Working hours left : " + this.getCurrentTask().getWorkingHours());
            System.out.println();
        }
        else{
            if (this.getHoursLeft() == 0) {
                System.out.println(" " + this.getName() + " done: " + this.getCurrentTask().getName());
                System.out.println();
            } else {
                System.out.println("  " + this.getName() + " done: " + this.getCurrentTask().getName() );
                System.out.println();
            }
        }
    }

}
