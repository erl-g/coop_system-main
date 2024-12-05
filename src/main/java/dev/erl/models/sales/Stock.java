package dev.erl.models.sales;

import dev.sol.core.application.FXModel;
import dev.sol.core.properties.beans.FXDoubleProperty;
import dev.sol.core.properties.beans.FXIntegerProperty;
import dev.sol.core.properties.beans.FXStringProperty;

public class Stock extends FXModel {

    private FXStringProperty stockId;
    private FXStringProperty description;
    private FXDoubleProperty unitprice;
    private FXDoubleProperty sellingprice;
    private FXStringProperty unit;
    private FXIntegerProperty criticalLevel;

    public Stock(String stockId,
            String description,
            Double unitprice,
            Double sellingprice,
            String unit,
            Integer criticalLevel) {
        this.stockId = new FXStringProperty(stockId);
        this.description = new FXStringProperty(description);
        this.unitprice = new FXDoubleProperty(unitprice);
        this.sellingprice = new FXDoubleProperty(sellingprice);
        this.unit = new FXStringProperty(unit);
        this.criticalLevel = new FXIntegerProperty(criticalLevel);

        track_properties(this.stockId,
                this.description,
                this.unitprice,
                this.sellingprice,
                this.unit,
                this.criticalLevel);
    }

    // stockId
    public FXStringProperty stockIdProperty() {
        return stockId;
    }

    public String getStockId() {
        return stockIdProperty().get();
    }

    public void setStockId(String stockId) {
        stockIdProperty().set(stockId);
    }

    // description
    public FXStringProperty descriptionProperty() {
        return description;
    }

    public String getDescription() {
        return descriptionProperty().get();
    }

    public void setDescription(String description) {
        descriptionProperty().set(description);
    }

    // unitprice
    public FXDoubleProperty unitpriceProperty() {
        return unitprice;
    }

    public Double getUnitPrice() {
        return unitpriceProperty().get();
    }

    public void setUnitPrice(Double unitprice) {
        unitpriceProperty().set(unitprice);
    }

    // sellingprice
        public FXDoubleProperty sellingpriceProperty() {
            return sellingprice;
        }

        public Double getSellingPrice() {
            return sellingpriceProperty().get();
        }

        public void setSellingPrice(Double sellingprice) {
            sellingpriceProperty().set(sellingprice);
        }

    // unit
    public FXStringProperty unitProperty() {
        return unit;
    }

    public String getUnit() {
        return unitProperty().get();
    }

    public void setUnit(String unit) {
        unitProperty().set(unit);
    }

    // criticalLevel
    public FXIntegerProperty criticalLevelProperty() {
        return criticalLevel;
    }

    public Integer getCriticalLevel() {
        return criticalLevelProperty().get();
    }

    public void setCriticalLevel(Integer criticalLevel) {
        criticalLevelProperty().set(criticalLevel);
    }

    @Override
    public FXModel clone() {
       return new Stock(getStockId(),
                getDescription(),
                getUnitPrice(),
                getSellingPrice(),
                getUnit(),
                getCriticalLevel());


    }

    @Override
    public void copy(FXModel arg0) {
       Stock c = (Stock) arg0;

       setStockId(c.getStockId());
       setDescription(c.getDescription());
       setUnitPrice(c.getUnitPrice());
       setSellingPrice(c.getSellingPrice());
       setUnit(c.getUnit());
       setCriticalLevel(c.getCriticalLevel());
    }

}
