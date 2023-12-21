import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
	
	
	SimpleDateFormat timeFormat; 
	SimpleDateFormat dayFormat; 
	SimpleDateFormat dateFormat; 
	JLabel timeLabel; 
	JLabel dayLabel;
	JLabel dateLabel;
	String time;
	String day;
	String date;
	
	
MyFrame(){
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setTitle("My Clock Program");
	this.setLayout(new FlowLayout());
	this.setSize(450,350);
	this.setResizable(true);
	
	timeFormat = new SimpleDateFormat("hh:mm:ss a ");
	dayFormat = new SimpleDateFormat("EEEE");
	dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");
	
	timeLabel = new JLabel();
	time = timeFormat.format(Calendar.getInstance().getTime());
	timeLabel.setText(time);
	timeLabel.setFont(new Font("Verdana", Font.BOLD, 40));
	timeLabel.setForeground(new Color(255, 255, 255));
	timeLabel.setBackground(Color.DARK_GRAY);
	timeLabel.setOpaque(true);
	dayLabel = new JLabel();
	dayLabel.setFont(new Font("Verdana", Font.BOLD, 20));
	
	dateLabel = new JLabel();
	dateLabel.setFont(new Font("Verdana", Font.BOLD, 20));

	this.add(timeLabel);
	this.setVisible(true);
	this.add(dayLabel);
	this.add(dateLabel);
	refreshTime();
}
public void refreshTime() {
	while(true) {
	time = timeFormat.format(Calendar.getInstance().getTime());
	timeLabel.setText(time);
	
	day = dayFormat.format(Calendar.getInstance().getTime());
	dayLabel.setText(day);
	
	date = dateFormat.format(Calendar.getInstance().getTime());
	dateLabel.setText(date);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
}
