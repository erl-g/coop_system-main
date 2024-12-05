package dev.erl.models.user;

import dev.sol.core.application.FXModel;
import dev.sol.core.properties.beans.FXDoubleProperty;
import dev.sol.core.properties.beans.FXStringProperty;

public class User extends FXModel {

    private final FXStringProperty user_id;
    private final FXStringProperty user_name;
    private final FXStringProperty designation;
    private final FXStringProperty fname;
    private final FXStringProperty lname;
    private final FXStringProperty address;
    private final FXStringProperty password;
    private final FXDoubleProperty user_salary;

    public User(String user_id, 
        String user_name, 
        String designation, 
        String fname, 
        String lname, 
        String address, 
        String password, 
        Double user_salary){
            this.user_id = new FXStringProperty(user_id);
            this.user_name = new FXStringProperty(user_name);
            this.designation = new FXStringProperty(designation);
            this.fname = new FXStringProperty(fname);
            this.lname = new FXStringProperty(lname);
            this.address = new FXStringProperty(address);
            this.password = new FXStringProperty(password);
            this.user_salary = new FXDoubleProperty(user_salary);

            track_properties(this.user_id, 
                this.user_name, 
                this.designation, 
                this.fname, 
                this.lname, 
                this.address, 
                this.password, 
                this.user_salary);
    }

    // user_id
    public FXStringProperty user_idProperty(){
        return user_id;
    }
    public String geUserId(){
        return user_idProperty().get();
    }
    public void setUserId(String user_id){
        user_idProperty().set(user_id);
    }

    // user_name
    public FXStringProperty user_namProperty(){
        return user_name;
    }
    public String getUserName(){
        return user_namProperty().get();
    }
    public void setUserName(String user_name){
        user_namProperty().set(user_name);
    }

    // designation
    public FXStringProperty designsProperty(){
        return designation;
    }
    public String getDesignation(){
        return designsProperty().get();
    }
    public void setDesignation(String designation){
        designsProperty().set(designation);
    }

    // firstname
    public FXStringProperty fnamProperty(){
        return fname;
    }
    public String getFname(){
        return fnamProperty().get();
    }
    public void setFname(String fname){
        fnamProperty().set(fname);
    }

    // lastname
    public FXStringProperty lnamProperty(){
        return lname;
    }
    public String getLname(){
        return lnamProperty().get();
    }
    public void setLname(String lname){
        lnamProperty().set(lname);
    }

    // address
    public FXStringProperty addressProperty(){
        return address;
    }
    public String getAddress(){
        return addressProperty().get();
    }
    public void setAddress(String address){
        addressProperty().set(address);
    }

    // password
    public FXStringProperty passwordProperty(){
        return password;
    }
    public String getPassword(){
        return passwordProperty().get();
    }
    public void setPassword(String password){
        passwordProperty().set(password);
    }

    // user_salary
    public FXDoubleProperty user_salaryProperty(){
        return user_salary;
    }
    public Double getUserSalary(){
        return user_salaryProperty().get();
    }
    public void setUserSalary(Double salary){
        user_salaryProperty().set(salary);
    }

    

    @Override
    public FXModel clone() {
      return new User(getAddress(), 
        getUserName(), 
        getDesignation(), 
        getFname(), 
        getLname(), 
        getAddress(), 
        getPassword(), 
        getUserSalary());

       
    }

    @Override
    public void copy(FXModel arg0) {
       User c = (User) arg0;

       setUserId(c.getAddress());
       setUserName(c.getAddress());
       setDesignation(c.getDesignation());
       setFname(c.getFname());
       setLname(c.getLname());
       setAddress(c.getAddress());
       setPassword(c.getPassword());
       setUserSalary(c.getUserSalary());
    }
    
}
