package dev.erl.models.delivery;

import dev.erl.models.sales.Stock;
import dev.sol.core.application.FXModel;
import dev.sol.core.properties.beans.FXDoubleProperty;
import dev.sol.core.properties.beans.FXIntegerProperty;
import dev.sol.core.properties.beans.FXObjectProperty;

public class DeliveryItems extends FXModel {

    private FXIntegerProperty DRID;
    private FXObjectProperty<Stock> stockId;
    private FXDoubleProperty buyingprice;
    private FXDoubleProperty qty;
    private FXDoubleProperty amount;

    public DeliveryItems(Integer DRID,
            Stock stockId,
            Double buyingprice,
            Double qty,
            Double amount) {
        this.DRID = new FXIntegerProperty(DRID);
        this.stockId = new FXObjectProperty<>(stockId);
        this.buyingprice = new FXDoubleProperty(buyingprice);
        this.qty = new FXDoubleProperty(qty);
        this.amount = new FXDoubleProperty(amount);

        track_properties(this.DRID,
                this.stockId,
                this.buyingprice,
                this.qty,
                this.amount);
    }

    // DRID
    public FXIntegerProperty DRIDProperty() {
        return DRID;
    }

    public Integer getDRID() {
        return DRIDProperty().get();
    }

    public void setDRID(Integer DRID) {
        DRIDProperty().set(DRID);
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

    // buyingprice
    public FXDoubleProperty buyingpriceProperty() {
        return buyingprice;
    }

    public Double getBuyingPrice() {
        return buyingpriceProperty().get();
    }

    public void setBuyingPrice(Double buyingprice) {
        buyingpriceProperty().set(buyingprice);
    }

    // qty
    public FXDoubleProperty qtyProperty() {
        return qty;
    }

    public Double getQty() {
        return qtyProperty().get();
    }

    public void setQty(Double qty) {
        qtyProperty().set(qty);
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
        return new DeliveryItems(getDRID(),
                getStockId(),
                getBuyingPrice(),
                getQty(),
                getAmount());

        
    }

    @Override
    public void copy(FXModel arg0) {
        DeliveryItems c = (DeliveryItems) arg0;

        setDRID(c.getDRID());
        setStockId(c.getStockId());
        setBuyingPrice(c.getBuyingPrice());
        setQty(c.getQty());
        setAmount(c.getAmount());
    }

}
