package dev.erl.models.hr;



import dev.erl.models.enums.CivilStatus;
import dev.sol.core.application.FXModel;
import dev.sol.core.properties.beans.FXDoubleProperty;
import dev.sol.core.properties.beans.FXIntegerProperty;
import dev.sol.core.properties.beans.FXLongProperty;
import dev.sol.core.properties.beans.FXObjectProperty;
import dev.sol.core.properties.beans.FXStringProperty;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;


public class Member extends FXModel {

    public static class OFFICE_TABLECELL extends TableCell<Member, Office>{
         @Override
        protected void updateItem(Office item, boolean empty) {
            super.updateItem(item, empty);

            if (item == null || empty) {
                setText(null);
                setGraphic(null);

                return;
            }

            setGraphic(new Label(item.getOfficeName()));
        }
    }

    private FXIntegerProperty memberId;
    private FXStringProperty lname;
    private FXStringProperty fname;
    private FXStringProperty Mname;
    private FXStringProperty birthDate;
    private FXStringProperty birthplace;
    private FXObjectProperty<CivilStatus> civil_status;
    private FXStringProperty homeAddress;
    private FXStringProperty occupation;
    private FXIntegerProperty office;
    private FXDoubleProperty salary;
    private FXStringProperty sourceofincome;
    private FXStringProperty relative;
    private FXStringProperty relationship;
    private FXStringProperty dependent;
    private FXIntegerProperty stockshare;
    private FXLongProperty stockamount;
    private FXLongProperty stockpaid;
    private FXLongProperty amountPaid;

    public Member(Integer memberId,
            String lname,
            String fname,
            String Mname,
            String birthDate,
            String birthplace,
            CivilStatus civil_status,
            String homeAddress,
            String occupation,
            Integer office,
            Double salary,
            String sourceofincome,
            String relative,
            String relationship,
            String dependent,
            Integer stockshare,
            long stockamount,
            long stockpaid,
            long amountPaid) {
        this.memberId = new FXIntegerProperty(memberId);
        this.lname = new FXStringProperty(lname);
        this.fname = new FXStringProperty(fname);
        this.Mname = new FXStringProperty(Mname);
        this.birthDate = new FXStringProperty(birthDate);
        this.birthplace = new FXStringProperty(birthplace);
        this.civil_status = new FXObjectProperty<>(civil_status);
        this.homeAddress = new FXStringProperty(homeAddress);
        this.occupation = new FXStringProperty(occupation);
        this.office = new FXIntegerProperty(office);
        this.salary = new FXDoubleProperty(salary);
        this.sourceofincome = new FXStringProperty(sourceofincome);
        this.relative = new FXStringProperty(relative);
        this.relationship = new FXStringProperty(relationship);
        this.dependent = new FXStringProperty(dependent);
        this.stockshare = new FXIntegerProperty(stockshare);
        this.stockamount = new FXLongProperty(stockamount);
        this.stockpaid = new FXLongProperty(stockpaid);
        this.amountPaid = new FXLongProperty(amountPaid);

        track_properties(this.memberId,
                this.lname,
                this.fname,
                this.Mname,
                this.birthDate,
                this.birthplace,
                this.civil_status,
                this.homeAddress,
                this.occupation,
                this.office,
                this.salary,
                this.sourceofincome,
                this.relative,
                this.relationship,
                this.dependent,
                this.stockshare,
                this.stockamount,
                this.stockpaid,
                this.amountPaid);
    }

    // memberID
    public FXIntegerProperty memberIDProperty() {
        return memberId;
    }

    public Integer getMemberID() {
        return memberIDProperty().get();
    }

    public void setMemberID(Integer memberId) {
        memberIDProperty().set(memberId);
    }

    // lname
    public FXStringProperty lnameProperty() {
        return lname;
    }

    public String getLname() {
        return lnameProperty().get();
    }

    public void setLname(String lname) {
        lnameProperty().set(lname);
    }

    // fname
    public FXStringProperty fnameProperty() {
        return fname;
    }

    public String getFname() {
        return fnameProperty().get();
    }

    public void setFname(String fname) {
        fnameProperty().set(fname);
    }

    // middlename
    public FXStringProperty mnameProperty() {
        return Mname;
    }

    public String getMname() {
        return fnameProperty().get();
    }

    public void setMname(String Mname) {
        mnameProperty().set(Mname);
    }

    // birthDate
    public FXStringProperty birthDateProperty() {
        return birthDate;
    }

    public String getBirthDate() {
        return birthDateProperty().get();
    }

    public void setBirthDate(String birthDate) {
        birthDateProperty().set(birthDate);
    }

    // birthplace
    public FXStringProperty birthplaceProperty() {
        return birthplace;
    }

    public String getBirthPlace() {
        return birthplaceProperty().get();
    }

    public void setBirthPlace(String birthplace) {
        birthplaceProperty().set(birthplace);
    }

    // civil_status
    public FXObjectProperty<CivilStatus> civil_statusProperty() {
        return civil_status;
    }

    public CivilStatus getCivil_Status() {
        return civil_statusProperty().get();
    }

    public void setCivil_Status(CivilStatus civil_status) {
        civil_statusProperty().set(civil_status);
    }

    // homeAddress
    public FXStringProperty homeAddressProperty() {
        return homeAddress;
    }

    public String getHomeAddress() {
        return homeAddressProperty().get();
    }

    public void setHomeAddress(String homeAddress) {
        homeAddressProperty().set(homeAddress);
    }

    // occupation
    public FXStringProperty occupationProperty() {
        return occupation;
    }

    public String getOccupation() {
        return occupationProperty().get();
    }

    public void setOccupation(String occupation) {
        occupationProperty().set(occupation);
    }

    // office
    public FXIntegerProperty officeProperty() {
        return office;
    }

    public Integer getOffice() {
        return officeProperty().get();
    }

    public void setOffice(Integer office) {
        officeProperty().set(office);
    }

    // salary
    public FXDoubleProperty salaryProperty() {
        return salary;
    }

    public Double getSalary() {
        return salaryProperty().get();
    }

    public void setSalary(double salary) {
        salaryProperty().set(salary);
    }

    // sourceofincome
    public FXStringProperty sourceofincomeProperty() {
        return sourceofincome;
    }

    public String getSourceOfIncome() {
        return sourceofincomeProperty().get();
    }

    public void setSourceOfIncome(String sourceofincome) {
        sourceofincomeProperty().set(sourceofincome);
    }

    // relstive
    public FXStringProperty relativeProperty() {
        return relative;
    }

    public String getRelative() {
        return relativeProperty().get();
    }

    public void setRelative(String relative) {
        relativeProperty().set(relative);
    }

    // relationship
    public FXStringProperty relationshipProperty() {
        return relationship;
    }

    public String getRelationship() {
        return relationshipProperty().get();
    }

    public void setRelationship(String relationship) {
        relationshipProperty().set(relationship);
    }

    // dependent
    public FXStringProperty dependentProperty() {
        return dependent;
    }

    public String getDependent() {
        return dependentProperty().get();
    }

    public void setDependent(String dependent) {
        dependentProperty().set(dependent);
    }

    // stockshare
    public FXIntegerProperty stockshareProperty() {
        return stockshare;
    }

    public Integer getStockshare() {
        return stockshareProperty().get();
    }

    public void setStockshare(Integer stockshare) {
        stockshareProperty().set(stockshare);
    }

    // stockamount
    public FXLongProperty stockamountProperty() {
        return stockamount;
    }

    public long getStockAmount() {
        return stockamountProperty().get();
    }

    public void setStockAmount(long stockamount) {
        stockamountProperty().set(stockamount);
    }

    // stockpaid
    public FXLongProperty stockpaidProperty() {
        return stockpaid;
    }

    public long getStockPaid() {
        return stockpaidProperty().get();
    }

    public void setStockPaid(long stockpaid) {
        stockpaidProperty().set(stockpaid);
    }

    // amountPaid
    public FXLongProperty amountPaidProperty() {
        return amountPaid;
    }

    public long getAmountPaid() {
        return amountPaidProperty().get();
    }

    public void setAmountPaid(long amountPaid) {
        amountPaidProperty().set(getAmountPaid());
    }

    @Override
    public FXModel clone() {
        Member member = new Member(getMemberID(),
                getLname(),
                getFname(),
                getMname(),
                getBirthDate(),
                getBirthPlace(),
                getCivil_Status(),
                getHomeAddress(),
                getOccupation(),
                getOffice(),
                getSalary(),
                getSourceOfIncome(),
                getRelative(),
                getRelationship(),
                getDependent(),
                getStockshare(),
                getStockAmount(),
                getStockPaid(),
                getAmountPaid());
        return member;
        
    }

    @Override
    public void copy(FXModel arg0) {
        Member c = (Member) arg0;

        setMemberID(c.getMemberID());
        setLname(c.getLname());
        setFname(c.getFname());
        setMname(c.getMname());
        setBirthDate(c.getBirthDate());
        setBirthPlace(c.getBirthPlace());
        setCivil_Status(c.getCivil_Status());
        setHomeAddress(c.getHomeAddress());
        setOccupation(c.getOccupation());
        setOffice(c.getOffice());
        setSalary(c.getAmountPaid());
        setSourceOfIncome(c.getSourceOfIncome());
        setRelative(c.getRelative());
        setRelationship(c.getRelationship());
        setDependent(c.getDependent());
        setStockshare(c.getStockshare());
        setStockAmount(c.getStockAmount());
        setStockPaid(c.getStockPaid());
        setAmountPaid(c.getAmountPaid());

        
    }

}
