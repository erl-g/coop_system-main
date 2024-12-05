package dev.erl.models.sales;

import dev.sol.core.application.FXModel;
import dev.sol.core.properties.beans.FXDoubleProperty;
import dev.sol.core.properties.beans.FXObjectProperty;
import dev.sol.core.properties.beans.FXStringProperty;

public class Sales_Item extends FXModel {

    private FXStringProperty salesID;
    private FXObjectProperty<Stock> stockId;
    private FXDoubleProperty quantity;
    private FXDoubleProperty amount;

    public Sales_Item(String salesID, Stock stockId, Double quantity, Double amount) {
        this.salesID = new FXStringProperty(salesID);
        this.stockId = new FXObjectProperty<>(stockId);
        this.quantity = new FXDoubleProperty(quantity);
        this.amount = new FXDoubleProperty(amount);

        track_properties(this.salesID, this.stockId, this.quantity, this.amount);
    }

    // salesID
    public FXStringProperty salaesIDProperty() {
        return salesID;
    }

    public String getSalesID() {
        return salaesIDProperty().get();
    }

    public void setSalesID(String salesID) {
        salaesIDProperty().set(salesID);
    }

    // stockId
    public FXObjectProperty<Stock> stockIdProperty() {
        return stockId;
    }

    public Stock getStockId() {
        return stockIdProperty().get();
    }

    public void setStockId(Stock stockId) {
        stockIdProperty().set(stockId);
    }

    // quantity
    public FXDoubleProperty quantityProperty() {
        return quantity;
    }

    public Double getQuantity() {
        return quantityProperty().get();
    }

    public void setQuantity(Double quantity) {
        quantityProperty().set(quantity);
    }

    // amount
    public FXDoubleProperty amountProperty() {
        return amount;
    }

    public Double getAmount() {
        return amountProperty().get();
    }

    public void setAmount(Double amount) {
        amountProperty().set(amount);
    }

    @Override
    public FXModel clone() {
        return new Sales_Item(getSalesID(),
                getStockId(),
                getQuantity(),
                getAmount());

        
    }

    @Override
    public void copy(FXModel arg0) {
       Sales_Item c = (Sales_Item) arg0;

       setSalesID(c.getSalesID());
       setStockId(c.getStockId());
       setQuantity(c.getQuantity());
       setAmount(c.getAmount());


    }

}
