package com.sda.mvc_calculator;

import com.sda.mvc_calculator.controller.Controller;
import com.sda.mvc_calculator.model.Model;
import com.sda.mvc_calculator.view.View;

public class Main {

    public static void main(String[] args) {

        Model model = new Model();
        View view = new View(model);
        Controller controller = new Controller(
                view, model
        );

        view.setVisible(true);
    }
}
