
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;

        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de c: "));

        if (a == 0) {
            JOptionPane.showMessageDialog(null, "Não é equação de 2º grau");
        } else {
            delta = (b * b) - (4 * a * c);

            if (delta < 0) {
                JOptionPane.showMessageDialog(null, "Não existem raízes reais");

            } else if (delta == 0) {
                x1 = -b / (2 * a);
                JOptionPane.showMessageDialog(null, "Uma raiz: " + x1);

            } else {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                JOptionPane.showMessageDialog(null, "Duas raízes: " + x1 + " e " + x2);
            }
        }
    }
}
