module br.edu.ifsp.symploteca {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.edu.ifsp.symploteca to javafx.fxml;
    exports br.edu.ifsp.symploteca;
}