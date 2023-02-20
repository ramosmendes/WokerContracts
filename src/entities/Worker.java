/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author rivaldor
 */
public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void addContract(HourContract contract) {

    }

    public void removeContract(HourContract contract) {

    }

    public Double income(Integer year, Integer month) {
        return null;
    }
}
