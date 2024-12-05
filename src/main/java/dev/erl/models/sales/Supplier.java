package dev.erl.models.sales;

import dev.sol.core.application.FXModel;
import dev.sol.core.properties.beans.FXStringProperty;

public class Supplier extends FXModel {

    private FXStringProperty supplierId;
    private FXStringProperty suppliername;
    private FXStringProperty supplierAddress;

    public Supplier(String supplierId, String suppliername, String supplierAddress){
        this.supplierId = new FXStringProperty(supplierId);
        this.suppliername = new FXStringProperty(suppliername);
        this.supplierAddress = new FXStringProperty(supplierAddress);

        track_properties(this.supplierId, this.suppliername, this.supplierAddress);
    }

    // supllierId
    public FXStringProperty supplierIdProperty() {
        return supplierId;
    }

    public String getSupplierId() {
        return supplierIdProperty().get();
    }

    public void setSupplierId(String supllierId) {
        supplierIdProperty().set(supllierId);
    }

    // suppliername
    public FXStringProperty suppliernameProperty() {
        return suppliernameProperty();
    }

    public String getSupplierName() {
        return suppliernameProperty().get();
    }

    public void setSupplierName(String suppliername) {
        suppliernameProperty().set(suppliername);
    }

    // supplierAddress
    public FXStringProperty supplierAddressProperty() {
          return supplierAddress;
    }

    public String getSupplierAddress() {
        return supplierAddressProperty().get();
    }

    public void setSupplierAddress(String supplierAddress) {
        supplierAddressProperty().set(supplierAddress);
    }

    @Override
    public FXModel clone() {
      return new Supplier(getSupplierId(), getSupplierName(), getSupplierAddress());

       
    }

    @Override
    public void copy(FXModel arg0) {
        Supplier c = (Supplier) arg0;

        setSupplierId(c.getSupplierId());
        setSupplierName(c.getSupplierName());
        setSupplierAddress(c.getSupplierAddress());
    }
    
}
