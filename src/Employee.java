import java.util.Objects;
import java.util.Random;

public class Employee {
    private Integer id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @Override
    public int hashCode() {
        return new Random().nextInt(2);
    }

    public boolean equals(Object o){
        Employee obj = (Employee)o;
        System.out.println(o.hashCode());
        System.out.println(this.hashCode());
        if(obj.getName() == null || (this.getName()==null)){
            return false;
        }
        return (obj.getName().equals(this.getName()) && (obj.getId().equals(this.getId())));
    }

}
