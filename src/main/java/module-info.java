module org.gustavo.bucketsort {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.github.duarte50.sorting_algorithms to javafx.fxml;
    exports io.github.duarte50.sorting_algorithms;
    exports io.github.duarte50.sorting_algorithms.enums;
}