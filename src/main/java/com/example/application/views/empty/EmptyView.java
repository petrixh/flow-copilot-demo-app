package com.example.application.views.empty;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Flow Empty For Figma")
@Route(value = "empty2")
@Menu(order = 2, icon = "vaadin:clipboard-check", title = "Empty")
public class EmptyView extends Div {

    public EmptyView() {

        setSizeFull();

    }
}
