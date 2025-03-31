package com.example.workflow;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.springframework.stereotype.Component;

@Component  // This makes sure Spring manages this bean
public class MyTaskListener implements TaskListener {

    @Override
    public void notify(DelegateTask delegateTask) {
        // Custom logic for when the task is created or completed
        System.out.println("Task " + delegateTask.getName() + " has been triggered.");
    }
}
