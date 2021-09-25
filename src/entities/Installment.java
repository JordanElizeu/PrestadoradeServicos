package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {

    private Date dueDate;
    private Double amount;

    private Contract contract;

    public Installment() {
    }

    public Installment(Double amount, Contract contract) {
        this.amount = amount;
        this.contract = contract;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String dueDate() throws ParseException {
        
        String Date = "";
        int increment = 1;

        for (int i = 1; i <= amount; i++) {
            int day = contract.getDate().getDate();
            int month = contract.getDate().getDay() + increment;
            int year = contract.getDate().getYear() + 1900;

            Date = (day + "/" + month + "/" + year+"\n")+Date;
            increment++;
        }
        return Date;
        
     
    }

}
