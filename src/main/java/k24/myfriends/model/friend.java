package k24.myfriends.model;

public class friend {

    private String firstName, lastName;

    public friend() {
        super();
    }
    
    public friend(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }




}
