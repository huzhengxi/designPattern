package com.jason.design.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {
    public static final Map<String, Emplyee> EMPLYEE_MAP = new HashMap<String, Emplyee>();

    public static Emplyee getManager(String department) {
        Manager manager = (Manager) EMPLYEE_MAP.get(department);
        if (manager == null) {
            manager = new Manager(department);
            System.out.print("创建部门经理：" + department);
            String reportContent = department + "部门汇报：此次汇报的主要内容是......";
            manager.setReportContent(reportContent);
            System.out.println(" 创建报告：" + reportContent);
            EMPLYEE_MAP.put(department, manager);
        }
        return manager;
    }

}
