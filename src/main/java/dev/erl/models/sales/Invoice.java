package dev.erl.models.sales;

import java.time.LocalDate;

import dev.erl.models.hr.Member;
import dev.erl.models.user.User;
import dev.sol.core.application.FXModel;
import dev.sol.core.properties.beans.FXDoubleProperty;
import dev.sol.core.properties.beans.FXObjectProperty;
import dev.sol.core.properties.beans.FXStringProperty;

public class Invoice extends FXModel {

    private FXStringProperty salesId;
    private FXStringProperty invoice_num;
    private FXDoubleProperty totalamount;
    private FXObjectProperty<Member> memberId;
    private FXObjectProperty<User> userid;
    private FXObjectProperty<LocalDate> date;

    public Invoice(String salesId,
            String invoice_num,
            Double totalamount,
            Member memberId,
            User userid,
            LocalDate date) {
        this.salesId = new FXStringProperty(salesId);
        this.invoice_num = new FXStringProperty(invoice_num);
        this.totalamount = new FXDoubleProperty(totalamount);
        this.memberId = new FXObjectProperty<>(memberId);
        this.userid = new FXObjectProperty<>(userid);
        this.date = new FXObjectProperty<>(date);

        track_properties(this.salesId,
                this.invoice_num,
                this.totalamount,
                this.memberId,
                this.userid,
                this.date);
    }

    // salesId
    public FXStringProperty salesIdProperty() {
        return salesId;
    }

    public String getSalesId() {
        return salesIdProperty().get();
    }

    public void setSalesId(String salesId) {
        salesIdProperty().set(salesId);
    }

    // invoice_num
    public FXStringProperty invoice_numProperty() {
        return invoice_num;
    }

    public String getInvoice_num() {
        return invoice_numProperty().get();
    }

    public void setInvoice_num(String invoice_num) {
        invoice_numProperty().set(invoice_num);
    }

    // totalamount
    public FXDoubleProperty totalamounProperty() {
        return totalamount;
    }

    public Double getTotalAmount() {
        return totalamounProperty().get();
    }

    public void setTotalAmount(Double totalamount) {
        totalamounProperty().set(totalamount);
    }

    // memberId
    public FXObjectProperty<Member> memberIdProperty() {
        return memberId;
    }

    public Member getMemberId() {
        return memberIdProperty().get();
    }

    public void setMemberId(Member memberId) {
        memberIdProperty().set(memberId);
    }

    // userid
    public FXObjectProperty<User> useridProperty() {
        return userid;
    }

    public User getUserId() {
        return useridProperty().get();
    }

    public void setUserId(User userid) {
        useridProperty().set(userid);
    }

    // date
    public FXObjectProperty<LocalDate> dateProperty() {
        return date;
    }

    public LocalDate getDate() {
        return dateProperty().get();
    }

    public void setDate(LocalDate date) {
        dateProperty().set(date);
    }

    @Override
    public FXModel clone() {
        return new Invoice(getSalesId(),
                getInvoice_num(),
                getTotalAmount(),
                getMemberId(),
                getUserId(),
                getDate());

        
    }

    @Override
    public void copy(FXModel arg0) {
        Invoice c = (Invoice) arg0;

        setSalesId(c.getSalesId());
        setInvoice_num(c.getInvoice_num());
        setTotalAmount(c.getTotalAmount());
        setMemberId(c.getMemberId());
        setDate(c.getDate());
    }

}
