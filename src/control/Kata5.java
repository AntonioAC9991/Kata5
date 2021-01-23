package control;

import java.sql.*;
import java.util.List;
import model.Histogram;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReaderBD;

public class Kata5 {
    
    private static List<String> mailList;
    private static Histogram<String> mailHistogram;
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException { 
        execute();
    }
    
    private static void execute() throws ClassNotFoundException, SQLException {
        input();
        process();
        output();
    }
    
    private static void input() throws ClassNotFoundException, SQLException {
        mailList = MailListReaderBD.read(); 
    }
    
    private static void process() {
        mailHistogram = MailHistogramBuilder.build(mailList);
    }
   
    private static void output() {
        new HistogramDisplay(mailHistogram).execute();
    }
    
}
