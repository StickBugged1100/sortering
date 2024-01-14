import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int platser = Integer.parseInt(JOptionPane.showInputDialog("size array"));
        int max = Integer.parseInt(JOptionPane.showInputDialog("max number"));
        int min = Integer.parseInt(JOptionPane.showInputDialog("min number"));
        int[] a = new int[platser];

        int i;
        for (i = 0; i < a.length; i++) {
            int random = min + (int) (Math.random() * (max + 1 - min));
            a[i] = random;
        }

        for (i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}