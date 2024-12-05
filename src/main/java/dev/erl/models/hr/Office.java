package dev.erl.models.hr;

import dev.sol.core.application.FXModel;
import dev.sol.core.properties.beans.FXStringProperty;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;

public class Office extends FXModel {

     public static class LIST_CELL extends ListCell<Office>{
        @Override
        protected void updateItem(Office office, boolean empty){
            super.updateItem(office, empty);

            if(office == null || empty){
                setText(null);
                setGraphic(null);

                return;
            }

            setGraphic(new Label(office.getOfficeName()));
        }
        
    }

    private FXStringProperty office_id;
    private FXStringProperty office_name;

    public Office(String office_id, String office_name){
        this.office_id = new FXStringProperty(office_id);
        this.office_name = new FXStringProperty(office_name);

        track_properties(this.office_id, this.office_name);
    }

    public FXStringProperty officeidProperty(){
        return office_id;
    }
    public String getOfficeId(){
        return officeidProperty().get();
    }
    public void setOfficeId(String office_id){
        officeidProperty().set(office_id);
    }

    public FXStringProperty officenameProperty(){
        return office_name;
    }
    public String getOfficeName(){
        return officenameProperty().get();
    }
    public void setOfficeName(String office_name){
        officenameProperty().set(office_name);
    }

    @Override
    public FXModel clone() {
        return new Office(getOfficeId(), getOfficeName());
    }

    @Override
    public void copy(FXModel arg0) {
        Office c = (Office) arg0;

        setOfficeId(c.getOfficeId());
        setOfficeName(c.getOfficeName());
    }

    
    
}
