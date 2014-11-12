import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class Calendar1 {

		
	HashMap<Integer, String> MONTHS = new HashMap();
	public static  String[] DAYS = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
	public static  int[] YEARS = {2009,2010,2011,2012,2013,2014,2015, 2016, 2017, 2018, 2019};
	
	
	
	
	private JFrame Frame;
	private void initialize() {
		Frame = new JFrame();
		Frame.setBounds(100, 100, 400, 400);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.getContentPane().setLayout(null);
		
		MONTHS.put(1, "January"); MONTHS.put(2, "February");MONTHS.put(3, "March");MONTHS.put(4, "April");MONTHS.put(5, "May");MONTHS.put(6, "June");MONTHS.put(7, "July");MONTHS.put(8, "August");MONTHS.put(9, "September");MONTHS.put(10, "October");MONTHS.put(11, "November");MONTHS.put(12, "December");

		Calendar now= Calendar.getInstance();
		int month= now.get(Calendar.MONTH)+1;
		int day= now.get(Calendar.DATE);
		final int year= now.get(Calendar.YEAR);		
		for(int a=1; a<MONTHS.size()+1; a++){
		System.out.println(MONTHS.get(a));}
		
		JLabel Month = new JLabel("Month");
		Month.setBounds(100, 50, 50, 25);
		Frame.getContentPane().add(Month);
		
		JLabel Year = new JLabel("Year");
		Year.setBounds(100, 150, 50, 25);
		Frame.getContentPane().add(Year);
		
		JLabel Day = new JLabel("Day");
		Day.setBounds(100, 100, 50, 25);
		Frame.getContentPane().add(Day);
		
		final JComboBox MonthBox = new JComboBox();
		MonthBox.setBounds(175, 50, 125, 25);
		Frame.getContentPane().add(MonthBox);
		for(int a=1; a<MONTHS.size()+1; a++){
			MonthBox.addItem(MONTHS.get(a));}
		
		final JComboBox DayBox = new JComboBox();
		DayBox.setBounds(175, 100, 50, 25);
		Frame.getContentPane().add(DayBox);
		for (int a=0; a<DAYS.length; a++){
			DayBox.addItem(DAYS[a]);}
		
		final JComboBox YearBox = new JComboBox();
		YearBox.setBounds(175, 150, 100, 25);
		Frame.getContentPane().add(YearBox);
		for (int a=0; a<YEARS.length; a++){
			YearBox.addItem(YEARS[a]);}
		
		
	for (int a=1; a<MONTHS.size()+1;a++){
		if (month== a){
			MonthBox.setSelectedItem(MONTHS.get(a));
		}
	}
	
	for (int a=0; a<DAYS.length;a++){
		if (day== a){
			DayBox.setSelectedItem(DAYS[a-1]);
		}
	}

	
	for (int a=0; a<YEARS.length;a++){
		if (year== YEARS[a] ){
			YearBox.setSelectedItem(YEARS[a]);
		}
	}
	
	
	
	
		
		MonthBox.addActionListener(new ActionListener() {
			 
            public void actionPerformed(ActionEvent e)
            {
            Object user_selection = MonthBox.getSelectedItem();
            
            if (user_selection.toString()=="April" || user_selection.toString()=="June" || user_selection.toString()=="September"
                    || user_selection.toString()=="November"){
                    DayBox.removeAllItems();
                    for (int a=0; a<DAYS.length -1;a++){
                    	DayBox.addItem(DAYS[a]);  }}          
            else if (user_selection.toString()=="January" || user_selection.toString()=="March" || user_selection.toString()=="May"
                    || user_selection.toString()=="July"  || user_selection.toString()=="August"  || user_selection.toString()=="October"
                    || user_selection.toString()=="December"){
                                   DayBox.removeAllItems();
                                    for (int a=0; a<DAYS.length;a++){
                                    	DayBox.addItem(DAYS[a]);}} 
            else {
                      DayBox.removeAllItems();
                      for (int a=0; a<DAYS.length -3;a++){
                      	DayBox.addItem(DAYS[a]);
                      }			}
            } 	}			)	;      }
         /*
            else if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
            {
            	if(user_selection.toString()=="February" ){
                    DayBox.removeAllItems();
                    for (int x=0; x<DAYS.length -2;x++){
                    	DayBox.addItem(DAYS[x]);	}}}
           
            CODE FOR LEAP YEAR
             COULDN'T GET IT TO WORK NOT SURE WHY HERE'S WHAT I HAD
             */		

	
	public Calendar1() {
		initialize();
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calendar1 window = new Calendar1();
					window.Frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
             }
