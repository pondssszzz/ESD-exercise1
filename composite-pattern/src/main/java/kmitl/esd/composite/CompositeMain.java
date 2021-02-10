package kmitl.esd.composite;

public class CompositeMain {
    public static void main(String[] args){
        /**
         * A main function for showing that the implementation works
         *
         * @return void
         */
        BusinessUnit team1 = new Team(1, "A");
        BusinessUnit team2 = new Team(2,"B");
        Department department = new Department(3,"C");

        department.addDepartment(team1);
        department.addDepartment(team2);
        department.printDepartureName();

    }
}
