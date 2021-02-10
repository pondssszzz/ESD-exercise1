package kmitl.esd.composite;

public class Team implements BusinessUnit {
    private Integer id;
    private String name;
    public Team(Integer id,String name){
        this.id = id;
        this.name = name;

    }
    /**
     * A function for showing the team details
     *
     * @return void
     */
    @Override
    public void printDepartureName() {
        System.out.println(getClass().getSimpleName());
    }
}
