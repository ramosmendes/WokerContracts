/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.Date;

/**
 *
 * @author rivaldor
 */
public class HourContract {

    private Date date;
    private Double valuePerHour;
    private Integer hours;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public Double totalValue() {
        return valuePerHour + hours;
    }

}
