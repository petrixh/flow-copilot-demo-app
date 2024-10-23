package com.example.application.views.flowhelloworld;

import com.vaadin.flow.component.combobox.ComboBox;

import static com.vaadin.flow.i18n.I18NProvider.translate;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Flow Hello World")
@Route(value = "", layout = MainLayout.class)
public class FlowHelloWorldView extends HorizontalLayout {

    private TextField name;
    private Button sayHello;

    public FlowHelloWorldView() {
        name = new TextField(translate("vaadin-text-field.your-name-4.label"));
        sayHello = new Button(translate("vaadin-button.element-5.text"));
        sayHello.addClickListener(e -> {
            Notification.show("Hello " + name.getValue());
        });
        sayHello.addClickShortcut(Key.ENTER);

        setMargin(true);
        setVerticalComponentAlignment(Alignment.END, name, sayHello);
        add(name);
        add(sayHello);

    }

}
