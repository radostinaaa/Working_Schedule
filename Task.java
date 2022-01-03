public class Task {
    private String name;
    private int workingHours;

    Task(final String name,int workingHours){
        setName(name);
        setWorkingHours(workingHours);
    }

    void setName(final String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public String getName() {
        return this.name;
    }

    void setWorkingHours(int workingHours) {
        if(workingHours >= 0 ){
        this.workingHours = workingHours;
        }
    }

     int getWorkingHours() {
        return this.workingHours;
    }
}
