module dev.erl {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive core.fx;

    requires transitive core.db;
    requires core.util;
    requires javafx.graphics;
    requires java.sql.rowset;
    requires javafx.base;
    requires atlantafx.base;

    opens dev.erl to javafx.fxml;
    opens dev.erl.app to javafx.fxml;

    exports dev.erl;
    exports dev.erl.app;
}
