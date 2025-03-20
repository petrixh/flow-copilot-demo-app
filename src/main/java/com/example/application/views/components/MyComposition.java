package com.example.application.views.components;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datetimepicker.DateTimePicker;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

public class MyComposition extends VerticalLayout {

    private DateTimePicker picker = new DateTimePicker();
    private TextField entry = new TextField();
    private ComboBox<String> combo = new ComboBox<>();

    public MyComposition() {

        HorizontalLayout horizontallayout = new HorizontalLayout();
        horizontallayout.add(entry, combo);
        add(picker, horizontallayout);
        setWidthFull();
        setHeight("300px");

    }

}
