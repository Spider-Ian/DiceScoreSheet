package com.example.tree;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MainViewCtrl {
    @FXML
    private AnchorPane mainHolder;

    @FXML
    private TabPane mainTab;

    Tab tab;

    VBox vBox;

    HBox hBox;

    Label mathCell;

    Label totalCell;

    Button button;

    private int tabNumber = 0;

    private int vBoxNumber = 0;

    private int rowNumber = 0;

    private int mathCells = 0;

    private int buttonNumber = 1;

    private int currentTab;

    private int currentRow;

    private int currentCell;

    List<List<List>> masterList = new ArrayList<>();

    List<Tab> tabList = new ArrayList<>();

    List<HBox> rowList = new ArrayList<>();

    List<Label> mathCellList = new ArrayList<>();

    //Not used in masterList
    List<Button> buttonList = new ArrayList<>();

    @FXML
    void initialize() {
        setMathCells(5);

        for (int i = 0; i < 2; i++) {
            createTabs();
        }

        //Sets the pointer to the beginning
        currentCell = 0;
        currentRow = 0;
        currentTab = 0;

        mainTab.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> ov, Number oldValue, Number newValue) {
                currentTab = mainTab.getSelectionModel().getSelectedIndex();
                System.out.println("Current tab: " + currentTab);
            }
        });

        //I don't think this adds it right
        masterList.add(Collections.singletonList(tabList));
        masterList.add(Collections.singletonList(rowList));
        masterList.add(Collections.singletonList(mathCellList));

        buttonList.get(0).setOnAction(event1 -> {
            if (currentCell == mathCells) {
                currentRow++;
                currentCell = 0;
                System.out.println("Current tab: " + currentTab + " " + "Current row: " + currentRow + " " + "Current cell: " + currentCell);
                System.out.println("=============================================");
                System.out.println("masterList.get(0)" + masterList.get(0) + " masterList.get(0).get(0)" + masterList.get(0).get(0) + " masterList.get(0).get(0).get(0)" + masterList.get(0).get(0).get(0));
                mathCellList.get(currentCell).setText(buttonList.get(0).getText());
                currentCell++;
            } else {
                System.out.println("Current tab: " + currentTab + " " + "Current row: " + currentRow + " " + "Current cell: " + currentCell);
                System.out.println("=============================================");
                System.out.println("masterList.get(0)" + masterList.get(0) + " masterList.get(0).get(0)" + masterList.get(0).get(0) + " masterList.get(0).get(0).get(0)" + masterList.get(0).get(0).get(0));
                mathCellList.get(currentCell).setText(buttonList.get(0).getText());
                currentCell++;
            }
        });
        buttonList.get(1).setOnAction(event2 -> {
            if (currentCell == mathCells) {
                currentRow++;
                currentCell = 0;
                System.out.println("Current tab: " + currentTab + " " + "Current row: " + currentRow + " " + "Current cell: " + currentCell);
                mathCellList.get(currentCell).setText(buttonList.get(1).getText());
                currentCell++;
            } else {
                System.out.println("Current tab: " + currentTab + " " + "Current row: " + currentRow + " " + "Current cell: " + currentCell);
                mathCellList.get(currentCell).setText(buttonList.get(1).getText());
                currentCell++;
            }
        });
        buttonList.get(2).setOnAction(event3 -> {
            if (currentCell == mathCells) {
                currentRow++;
                currentCell = 0;
                System.out.println("Current tab: " + currentTab + " " + "Current row: " + currentRow + " " + "Current cell: " + currentCell);
                mathCellList.get(currentCell).setText(buttonList.get(2).getText());
                currentCell++;
            } else {
                System.out.println("Current tab: " + currentTab + " " + "Current row: " + currentRow + " " + "Current cell: " + currentCell);
                mathCellList.get(currentCell).setText(buttonList.get(2).getText());
                currentCell++;
            }
        });
        buttonList.get(3).setOnAction(event4 -> {
            if (currentCell == mathCells) {
                currentRow++;
                currentCell = 0;
                System.out.println("Current tab: " + currentTab + " " + "Current row: " + currentRow + " " + "Current cell: " + currentCell);
                mathCellList.get(currentCell).setText(buttonList.get(3).getText());
                currentCell++;
            } else {
                System.out.println("Current tab: " + currentTab + " " + "Current row: " + currentRow + " " + "Current cell: " + currentCell);
                mathCellList.get(currentCell).setText(buttonList.get(3).getText());
                currentCell++;
            }
        });
        buttonList.get(4).setOnAction(event5 -> {
            if (currentCell == mathCells) {
                currentRow++;
                currentCell = 0;
                System.out.println("Current tab: " + currentTab + " " + "Current row: " + currentRow + " " + "Current cell: " + currentCell);
                mathCellList.get(currentCell).setText(buttonList.get(4).getText());
                currentCell++;
            } else {
                System.out.println("Current tab: " + currentTab + " " + "Current row: " + currentRow + " " + "Current cell: " + currentCell);
                mathCellList.get(currentCell).setText(buttonList.get(4).getText());
                currentCell++;
            }
        });
        buttonList.get(5).setOnAction(event6 -> {
            if (currentCell == mathCells) {
                currentRow++;
                currentCell = 0;
                System.out.println("Current tab: " + currentTab + " " + "Current row: " + currentRow + " " + "Current cell: " + currentCell);
                mathCellList.get(currentCell).setText(buttonList.get(5).getText());
                currentCell++;
            } else {
                System.out.println("Current tab: " + currentTab + " " + "Current row: " + currentRow + " " + "Current cell: " + currentCell);
                mathCellList.get(currentCell).setText(buttonList.get(5).getText());
                currentCell++;
            }
        });

        System.out.println("Master list contents: " + masterList);
        //System.out.println("Tab list contents: " + tabList);
        //System.out.println("Row list contents: " + rowList);
        //System.out.println("Cell list contents: " + mathCellList);
    }

    //TODO: What is the best way to keep track of all of these nodes?

    public void createTabs() {
        //TODO: Create Tabs
        tab = new Tab("Tab " + (1+tabNumber));
        tabList.add(tab);
        mainTab.getTabs().add(tab);

        //TODO: Create scrollPane
        ScrollPane scrollPane = new ScrollPane();
        tab.setContent(scrollPane);
        scrollPane.setPrefHeight(400);
        scrollPane.setPrefWidth(300);
        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        //TODO: Create VBox
        vBox = new VBox();
        //
        scrollPane.setContent(vBox);

        for (int i = 0; i < 11; i++) {
            if (i == 0) {
                createRows();
                hBox.setStyle("-fx-background-color:#6489DF;");
                createTitleCells();
                rowNumber++;
            } else if (i % 2 == 0) {
                createRows();
                createRowNumbers();
                createMathCells();
                createTotalCells();
                hBox.setStyle("-fx-background-color:#FFEC8F;");
                rowNumber++;
            } else {
                createRows();
                createRowNumbers();
                createMathCells();
                createTotalCells();
                rowNumber++;
            }
        }
        createButtons();
        rowNumber = 0;
        tabNumber++;
        vBoxNumber++;
        currentTab++;
    }

    public void createRows() {
        //TODO: Create HBoxes that go in the VBox
        hBox = new HBox();
        rowList.add(hBox);
        vBox.getChildren().add(hBox);
    }

    public void createTitleCells() {
        //TODO: Create the first HBox row as title cells
        //TODO: Label:Row Number, Label:Roles, Label:Total
        Label rowNumberTitle = new Label("Row#");
        Label mathTitle = new Label("Mathmatical");
        Label totalTitle = new Label("Total");
        hBox.getChildren().addAll(rowNumberTitle, mathTitle, totalTitle);

    }

    public void createRowNumbers() {
        //TODO: Create a Label that holds the row number
        Label rowNumberCell = new Label("" + rowNumber);
        hBox.getChildren().add(rowNumberCell);
    }

    public void setMathCells(int mathCells) {
        this.mathCells = mathCells;
    }

    public void createMathCells() {
        //TODO: Create 1-6 Labels that can take a button push number
        for (int i = 0; i < mathCells; i++) {
            mathCell = new Label("a");
            mathCellList.add(mathCell);
            hBox.getChildren().add(mathCell);
        }
    }

    public void createTotalCells() {
        //TODO: Create a Label that adds the math cells
        totalCell = new Label("");
        hBox.getChildren().add(totalCell);
    }

    public void createButtons() {
        //TODO: Create a FlowPane that holds 1-6 buttons
        FlowPane buttonHolder = new FlowPane();
        vBox.getChildren().add(buttonHolder);

        for (int i = 0; i < 6; i++) {
            button = new Button("" + buttonNumber);
            buttonList.add(button);
            buttonHolder.getChildren().add(button);
            buttonNumber++;
        }

        buttonNumber = 1;
    }
}