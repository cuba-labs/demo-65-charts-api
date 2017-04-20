package com.company.demo.web.screens;

import com.haulmont.charts.gui.components.charts.PieChart;
import com.haulmont.cuba.web.app.mainwindow.AppMainWindow;

import javax.inject.Inject;
import java.util.Map;

public class ExtAppMainWindow extends AppMainWindow {
    @Inject
    private PieChart pie3dChart;

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

        pie3dChart.addSliceClickListener(event ->
                showNotification("Slice clicked " + event.getItem().getInstanceName())
        );
    }
}