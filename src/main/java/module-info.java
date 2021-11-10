module com.mycompany.week11_demo_simplepaintapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.week11_demo_simplepaintapp to javafx.fxml;
    exports com.mycompany.week11_demo_simplepaintapp;
}
