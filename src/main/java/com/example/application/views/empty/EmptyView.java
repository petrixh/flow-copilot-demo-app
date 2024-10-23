package com.example.application.views.empty;

import static com.vaadin.flow.i18n.I18NProvider.translate;

import com.vaadin.flow.component.notification.Notification;

import com.vaadin.flow.theme.lumo.LumoUtility;

import com.vaadin.flow.component.html.H3;

import com.vaadin.flow.component.checkbox.CheckboxGroup;

import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.component.combobox.ComboBox;

import com.vaadin.flow.component.button.Button;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import com.vaadin.flow.component.textfield.TextField;

import com.vaadin.flow.component.datepicker.DatePicker;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;



@PageTitle("Flow Empty For Figma")
@Route(value = "empty2", layout = MainLayout.class)
public class EmptyView extends Div {

    public EmptyView() {

        setSizeFull();
    }
}
