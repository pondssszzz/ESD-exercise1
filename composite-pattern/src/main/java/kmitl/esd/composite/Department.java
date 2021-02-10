package kmitl.esd.composite;

import java.util.ArrayList;
import java.util.List;

public class Department implements BusinessUnit{
    private Integer id;
    private String name;
    private List<BusinessUnit> childBusiness;
    public Department(Integer id, String name){
        this.id = id;
        this.name = name;
        this.childBusiness = new ArrayList<>();
    }
    /**
     * A function for showing the department details
     *
     * @return void
     */
    @Override
    public void printDepartureName() {
        childBusiness.forEach(BusinessUnit::printDepartureName);
    }
    /**
     * A function for adding a department
     *
     * @param businessUnit department to add
     * @return void
     */
    public void addDepartment(BusinessUnit businessUnit){
        childBusiness.add(businessUnit);
    }
    /**
     * A function for removing a department
     *
     * @param businessUnit department to remove
     * @return void
     */
    public void removeDepartment(BusinessUnit businessUnit){
        childBusiness.remove(businessUnit);
    }
}
