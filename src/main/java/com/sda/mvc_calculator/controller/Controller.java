package com.sda.mvc_calculator.controller;

import com.sda.mvc_calculator.model.Model;
import com.sda.mvc_calculator.view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;

        view.addMultiplyListener(new MultiplyListener());
    }

    class MultiplyListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String userInput = "";

            userInput = view.getUserInput();
            System.out.println(userInput);
        }
    }

}
