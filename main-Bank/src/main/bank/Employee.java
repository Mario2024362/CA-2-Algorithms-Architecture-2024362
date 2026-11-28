/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.bank;

/**
 *
 * @author Mario Cornejo
 */
public class Employee {
    
        public enum Department {
        IT("IT"), CUSTOMER_SERVICE("Customer Service"), LOANS("Loans"), FINANCE("Finance"),
        HR("HR"), MARKETING("Marketing"), OPERATIONS("Operations"), RISK_COMPLIANCE("Risk & Compliance");

        public final String label;
        Department(String label) { this.label = label; }
    }

    // Valid manager types, from the highest level to the lowest
    public enum ManagerType {
        HEAD_MANAGER("Head Manager"), SENIOR_MANAGER("Senior Manager"), MANAGER("Manager"),
        ASSISTANT_MANAGER("Assistant Manager"), TEAM_LEAD("Team Lead"), OFFICER("Officer"), CLERK("Clerk");

        public final String label;
        ManagerType(String label) { this.label = label; }
    }

    private final String name;
    private final String managerType;
    private final String department;

    public Employee(String name, String managerType, String department) {
        this.name = name;
        this.managerType = managerType;
        this.department = department;
    }
    
     public String getName()        { return name; }
    public String getManagerType() { return managerType; }
    public String getDepartment()  { return department; }

    // Position in the hierarchy of job
    public int rank() {
        for (ManagerType t : ManagerType.values()) {
            if (t.label.equalsIgnoreCase(managerType)) return t.ordinal();
        }
        return ManagerType.values().length; // unknown type goes to the bottom
    }
}
