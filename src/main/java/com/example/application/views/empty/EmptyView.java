package com.example.application.views.empty;

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
