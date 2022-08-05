module com.constructora.constructora {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires de.jensd.fx.glyphs.fontawesome;

    opens com.constructora.constructora.controlador to javafx.fxml;
    exports com.constructora.constructora.controlador;
    exports com.constructora.constructora.util;
    opens com.constructora.constructora.util to javafx.fxml;
    exports com.constructora.constructora.modelos.dao;
    exports com.constructora.constructora.modelos.vo;
}