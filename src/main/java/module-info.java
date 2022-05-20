module com.example.demo1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens rectangle to javafx.fxml;
    exports rectangle;

    opens showhide;
    exports showhide to javafx.fxml;

    opens texteditor to javafx.fxml;
    exports texteditor;

    opens circle;
    exports circle to javafx.fxml;

    opens piggyback;
    exports piggyback to javafx.fxml;

    opens InvestmentCalculator;
    exports  InvestmentCalculator to javafx.fxml;

    opens ignSelector;
    exports ignSelector to javafx.fxml;

    opens showhide2;
    exports showhide2 to javafx.fxml;

    opens numberGuess;
    exports numberGuess to javafx.fxml;

    opens RestaurantMenu;
    exports RestaurantMenu to javafx.fxml;

    opens textnumber;
    exports textnumber to javafx.fxml;

    opens photoAlbum;
    exports photoAlbum to javafx.fxml;

    opens MovieAnalyzer;
    exports MovieAnalyzer to javafx.fxml;
}