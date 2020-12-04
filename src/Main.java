import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        if(getCoefficients()==null)
            return;
        Frame frame = new Frame(getCoefficients());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static Double[] getCoefficients() throws IOException {
        try {
            BufferedReader bf = new BufferedReader(new FileReader("Initial_Data.txt"));
            int amount = Integer.parseInt(bf.readLine());
            Double[] coefficients = new Double[amount];
            for (int i = 0; i < amount; i++) {
                coefficients[i] = Double.parseDouble(bf.readLine());
            }
            return coefficients;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(new JFrame(), "File is not found:\n" + e);
        }
        return null;
    }
}
