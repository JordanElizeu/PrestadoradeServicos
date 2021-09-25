package Aplication;

import entities.Contract;
import entities.Installment;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        SimpleDateFormat form = new SimpleDateFormat("dd/mm/yyyy");
        List<Installment> exec = new ArrayList();
        
        System.out.println("Enter contract data");
        System.out.println("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("Date (dd/MM/yyyy): ");
        Date date = form.parse(sc.nextLine());
        System.out.println("Contract value: ");
        double totalValue = sc.nextDouble();
        System.out.println("Enter number of installments: ");
        double installments = sc.nextDouble();
        
        exec.add(new Installment(installments, new Contract(number, date, totalValue)));
        
        for(Installment ced : exec){
            System.out.println(ced.dueDate() + " - $" + String.format("%.2f", ced.getAmount()));
        }

        sc.close();
 
    }
}
