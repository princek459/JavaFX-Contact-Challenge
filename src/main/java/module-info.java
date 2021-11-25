module sample.mycontact {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;

    opens datamodel;
    opens sample.mycontact to javafx.fxml;
    exports sample.mycontact;
}