package dev.erl.models.delivery;

import dev.erl.models.sales.Supplier;
import dev.sol.core.application.FXModel;
import dev.sol.core.properties.beans.FXDoubleProperty;
import dev.sol.core.properties.beans.FXIntegerProperty;
import dev.sol.core.properties.beans.FXObjectProperty;
import dev.sol.core.properties.beans.FXStringProperty;

public class DeliveryReceipt extends FXModel {

    private FXStringProperty DRID;
    private FXStringProperty DRNum;
    private FXObjectProperty<Supplier> supplierId;
    private FXIntegerProperty datedel;
    private FXDoubleProperty totalamt;
    private FXDoubleProperty paidamt;
    private FXIntegerProperty userid;

    public DeliveryReceipt(String DRID,
            String DRNum,
            Supplier supplierId,
            Integer datedel,
            Double totalamt,
            Double paidamt,
            Integer userid) {
        this.DRID = new FXStringProperty(DRID);
        this.DRNum = new FXStringProperty(DRNum);
        this.supplierId = new FXObjectProperty<>(supplierId);
        this.datedel = new FXIntegerProperty(datedel);
        this.totalamt = new FXDoubleProperty(totalamt);
        this.paidamt = new FXDoubleProperty(paidamt);
        this.userid = new FXIntegerProperty(userid);

        track_properties(this.DRID,
                this.DRNum,
                this.supplierId,
                this.datedel,
                this.totalamt,
                this.paidamt,
                this.userid);
    }

    // DRID
    public FXStringProperty DRIDProperty() {
        return DRID;
    }

    public String getDRID() {
        return DRIDProperty().get();
    }

    public void setDRID(String DRID) {
        DRIDProperty().set(DRID);
    }

    // DRNum
    public FXStringProperty DRNumProperty() {
        return DRNum;
    }

    public String getDRNum() {
        return DRNumProperty().get();
    }

    public void setDRNum(String DRNum) {
        DRNumProperty().set(DRNum);
    }

    // supplierId
    public FXObjectProperty<Supplier> supplierProperty() {
        return supplierId;
    }

    public Supplier getSupplierId() {
        return supplierProperty().get();
    }

    public void setSupplierId(Supplier supplierId) {
        supplierProperty().set(supplierId);
    }

    // datedel
    public FXIntegerProperty datedelProperty() {
        return datedel;
    }

    public Integer getDatedel() {
        return datedelProperty().get();
    }

    public void setDatedel(Integer datedel) {
        datedelProperty().set(datedel);
    }

    // totalamt
    public FXDoubleProperty totalamtProperty() {
        return totalamt;
    }

    public Double getTotalamt() {
        return totalamtProperty().get();
    }

    public void setTotalamt(Double totalamt) {
        totalamtProperty().set(totalamt);
    }

    // paidamt
    public FXDoubleProperty paidamtProperty() {
        return paidamt;
    }

    public Double getPaidamt() {
        return paidamtProperty().get();
    }

    public void setPaidamt(Double paidamt) {
        paidamtProperty().set(paidamt);
    }

    // userid
    public FXIntegerProperty useridProperty() {
        return userid;
    }

    public Integer getUserid() {
        return useridProperty().get();
    }

    public void setUserid(Integer userid) {
        useridProperty().set(userid);
    }

    @Override
    public FXModel clone() {
       return new DeliveryReceipt(getDRID(),
                getDRNum(),
                getSupplierId(),
                getDatedel(),
                getTotalamt(),
                getPaidamt(),
                getUserid());

        
    }

    @Override
    public void copy(FXModel arg0) {
       DeliveryReceipt c = (DeliveryReceipt) arg0;

       setDRID(c.getDRID());
       setDRNum(c.getDRNum());
       setSupplierId(c.getSupplierId());
       setDatedel(c.getDatedel());
       setTotalamt(c.getTotalamt());
       setPaidamt(c.getPaidamt());
       setUserid(c.getUserid());
    }

}
