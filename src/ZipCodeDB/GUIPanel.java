package ZipCodeDB;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Jpanel is the "base class". GUI Panel is the "derived" class.

public class GUIPanel extends JPanel { // Jpanel goes inside Jframe
    private JTextField zipcode;
    private JButton submit;
    private JButton Northernmost;
    private JTextArea output;
    private Database db; // the zipcode database

    public GUIPanel(){
        this.zipcode = new JTextField("zipcode", 7);
        this.add(this.zipcode); // this.add is within the base class

        this.submit = new JButton("Submit");
        this.add(this.submit);
        this.submit.addActionListener(new SubmitButtonListener());

        this.Northernmost = new JButton("Northernmost");
        this.add(this.Northernmost);
        this.Northernmost.addActionListener(new SubmitButtonListener());

        this.output = new JTextArea(5, 20);
        this.add(this.output);

        this.db = new Database(); // load the zipcodes

        // add an event handler (button press, mouse click,
        // mouse movement, key pass) to the submit button.
        // an event is an object that represents one of those options.
    }
    // you implement an interface but you extend another class

    class SubmitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // function will get called when the user presses submit

            // get the zipcode that user typed out of the textfield
            String code = zipcode.getText();
            Zipcode zc = db.search(code);
            WeatherObservation wob = zc.getWeatherData();
            output.setText(wob.toString());
            System.out.println(wob);
        }
    }

    class NorthernmostButton implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String code = zipcode.getText();
            Zipcode lat = db.getNorthern();
            WeatherObservation wob = lat.getWeatherData();
            output.setText(wob.toString());
            System.out.println(wob);
        }
    }
}





