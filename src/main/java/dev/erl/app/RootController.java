package dev.erl.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Comparator;

import atlantafx.base.theme.Styles;
import atlantafx.base.util.Animations;
import dev.erl.App;
import dev.erl.data.MemberDAO;
import dev.erl.models.enums.CivilStatus;
import dev.erl.models.hr.Member;
import dev.erl.models.hr.Office;
import dev.sol.core.application.FXController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class RootController extends FXController {

    @FXML
    private TableView<Member> memberTable;

    @FXML
    private TableColumn<Member, String> memberIdColumn;

    @FXML
    private TableColumn<Member, String> lnameColumn;

    @FXML
    private TableColumn<Member, String> fnameColumn;

    @FXML
    private TableColumn<Member, Long> amountpaidColumn;

    @FXML
    private TextField idField;

    @FXML
    private TextField firstname;

    @FXML
    private TextField middlename;

    @FXML
    private TextField lastname;

    @FXML
    private TextField birthdate;

    @FXML
    private TextField birthplace;

    @FXML
    private ComboBox<CivilStatus> civilstatus;

    @FXML
    private TextField homeaddress;

    @FXML
    private TextField occupation;

    @FXML
    private ComboBox<Office> officebox;

    @FXML
    private TextField salary;

    @FXML
    private TextField income;

    @FXML
    private TextField relativefield;

    @FXML
    private ComboBox<Member> relationfield;

    @FXML
    private TextField dependents;

    @FXML
    private TextField stockshare;

    @FXML
    private TextField stockamount;

    @FXML
    private TextField stockpaid;

    @FXML
    private TextField amountpaid;

    @FXML
    private TextField search;
    
    // @FXML
    // void handleAdd(){
    //     int officebox = idField.getSelectionModel().getSelectedIndex() + 1;
    //     int civil_status = civilstatus.getSelectionModel().getSelectedIndex() + 1;

    //     LocalDate date = birthdate.getValue();
    //     DateTimeFormatter formatter = DateTime
    // }

    // @FXML
    // private void handleAddMember(){
    //     if( firstname.getText().isEmpty()){
    //         firstname.pseudoClassStateChanged(Styles.STATE_DANGER, true);
    //         Animations.flash(firstname).playFromStart();
    //         return;
    //     }
    //     Collections.sort(member_masterlist,
    //     Comparator.comparing(Member))
    // }

    @FXML
    private void handleDelete() {
        Member selectedMember = memberTable.getSelectionModel().getSelectedItem();
        if (memberTable.getSelectionModel().getSelectedItem() == null) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Member Delete Error");
            alert.setHeaderText("Null Selection Error Occurred");
            alert.setContentText("No Member selected from table. Must select a Member to delete");
            alert.initOwner(scene.getWindow());
            alert.show();
            return;
        }
        member_masterlist.remove(selectedMember);
        MemberDAO.delete(selectedMember);

    }

    private Member selectedmember;
    private Scene scene;
    private ObservableList<Member> member_masterlist;
    private FilteredList<Member> memberFilteredList;
    private FilteredList<Office> office_marterList;
    private FilteredList<Office> officeList;

    // private static class OFFICE_CELL extends ListCell<Office>{
    //     @Override
    //     protected void updateItem(Office office, boolean empty){
    //         super.updateItem(office, empty);

    //         if(office == null || empty){
    //             setText(null);
    //             setGraphic(null);

    //             return;
    //         }

    //         setGraphic(new Label(office.getOfficeName()));
    //     }
        

    @Override
    protected void load_fields() {
        
        scene = (Scene) getParameter("SCENE");
        //office_marterList = App.COLLECTIONS_REGISTER.getList("OFFICE");
        member_masterlist = App.COLLECTIONS_REGISTER.getList("MEMBER");
        
        memberFilteredList = new FilteredList<>(member_masterlist, p -> true);

        memberIdColumn.setCellValueFactory(cell -> cell.getValue().memberIDProperty().asString());
        lnameColumn.setCellValueFactory(cell -> cell.getValue().lnameProperty());
        fnameColumn.setCellValueFactory(cell -> cell.getValue().fnameProperty());
        amountpaidColumn.setCellValueFactory(cell -> cell.getValue().amountPaidProperty().asObject());

        ObservableList<CivilStatus> joblist = FXCollections.observableArrayList(CivilStatus.values());
        if (member_masterlist.stream().anyMatch(e -> e.getCivil_Status().equals(CivilStatus.SINGLE))) {
            civilstatus.setItems(FXCollections.observableArrayList(joblist.subList(0, joblist.size())));
        } else
            civilstatus.setItems(joblist);


        // ObservableList<RelationShip> relation = FXCollections.observableArrayList(RelationShip.values());
        // if (member_masterlist.stream().anyMatch(e -> e.getRelationship().equals(RelationShip.MOTHER))) {
        //     relationfield.setItems(FXCollections.observableArrayList(relation.subList(1, relation.size())));
        // } else
        //     relationfield.setItems(relation);


        // officebox.setButtonCell(new Office.LIST_CELL());
        // officebox.setCellFactory(cell -> new Office.LIST_CELL());
        // officebox.getItems().add(null);
        // officebox.setItems(office_marterList);

        
        memberTable.setItems(member_masterlist);

        memberTable.getSelectionModel().selectedItemProperty().addListener((o, ov, nv) -> {
            if (nv != null) {
                idField.setText(String.valueOf(nv.getMemberID()));
                firstname.setText(nv.getFname());
                middlename.setText(nv.getMname());
                lastname.setText(nv.getLname());
                birthdate.setText(nv.getBirthDate());
                birthplace.setText(nv.getBirthPlace());
                homeaddress.setText(nv.getHomeAddress());
                occupation.setText(nv.getOccupation());
                salary.setText(String.valueOf(nv.getSalary()));
                relativefield.setText(nv.getRelative());
                relationfield.setPromptText(nv.getRelationship());
                income.setText(nv.getSourceOfIncome());
                dependents.setText(nv.getDependent());
                stockshare.setText(String.valueOf(nv.getStockshare()));
                stockpaid.setText(String.valueOf(nv.getStockPaid()));
                stockamount.setText(String.valueOf(nv.getStockAmount()));
                amountpaid.setText(String.valueOf(nv.getAmountPaid()));
                officebox.setPromptText(String.valueOf(nv.getOffice()));

                
            }else{
                idField.setText("");
                firstname.setText("");
                middlename.setText("");
                lastname.setText("");
                birthdate.setText("");
                birthplace.setText("");
                homeaddress.setText("");
                occupation.setText("");
                salary.setText("");
                relativefield.setText("");
                relationfield.setPromptText("");
                income.setText("");
                dependents.setText("");
                stockshare.setText("");
                stockpaid.setText("");
                stockamount.setText("");
                amountpaid.setText("");
            }
        });

    }

    @Override
    protected void load_bindings() {
        _bind_labelProperties();
    }

    @Override
    protected void load_listeners() {
        reset_combobox();
        memberTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            selectedmember = newValue;
            _bind_labelProperties();
        });

    }

    private void _bind_labelProperties() {
        if (selectedmember != null) {
        
        civilstatus.valueProperty().bind(selectedmember.civil_statusProperty());
        //relationfield.valueProperty().bind(selectedmember.relationshipProperty());

         }

    }

    private void reset_combobox() {

        civilstatus.getSelectionModel().selectFirst();
        //relationfield.getSelectionModel().selectFirst();
        //officebox.getSelectionModel().selectFirst();
    }

}

