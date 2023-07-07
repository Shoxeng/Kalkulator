

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.NoSuchElementException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Kalkulator implements ActionListener {
    Stos stack;
    JLabel label = new JLabel("Number");
    JFrame frame = new JFrame();
    JTextField textfield1 = new JTextField();
    JTextField textfield2 = new JTextField();
    JTextField textfield3 = new JTextField();
    JPanel panel = new JPanel();
    JButton[] button = new JButton[10];
    JButton[] button_f = new JButton[16];

    public Kalkulator() {
        // frame.add(panel,BorderLayout.CENTER);
        stack = new Stos();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Kalkulator");
        frame.setSize(600, 760);
        frame.setLayout(null);
        textfield1.setBounds(50, 25, 500, 50);
        textfield1.setEditable(false);
        frame.add(textfield1);

        textfield2.setBounds(50, 145, 100, 50);
        textfield2.setText("Op.dat");
        frame.add(textfield2);

        textfield3.setBounds(50, 90, 270, 50);
        textfield3.setEditable(false);
        frame.add(textfield3);

        button_f[0] = new JButton("+");
        button_f[1] = new JButton("-");
        button_f[2] = new JButton("*");
        button_f[3] = new JButton("/");
        button_f[4] = new JButton("^");
        button_f[5] = new JButton("sqrt");
        button_f[6] = new JButton("%");
        button_f[7] = new JButton("!");
        button_f[8] = new JButton(".");
        button_f[9] = new JButton("delete");
        button_f[10] = new JButton("clear");
        button_f[11] = new JButton("=");
        button_f[12] = new JButton("import");
        button_f[13] = new JButton("export");
        button_f[14] = new JButton("(");
        button_f[15] = new JButton(")");

        for (int i = 0; i < button_f.length; i++) {
            button_f[i].setFocusable(false);
            button_f[i].addActionListener(this);
        }

        for (int i = 0; i < button.length; i++) {
            button[i] = new JButton(i + "");
            button[i].setFocusable(false);
            button[i].addActionListener(this);
        }

        button_f[12].setBounds(155, 145, 80, 50);
        button_f[13].setBounds(240, 145, 80, 50);
        frame.add(button_f[12]);
        frame.add(button_f[13]);

        button_f[9].setBounds(345, 90, 100, 50);
        button_f[10].setBounds(450, 90, 100, 50);
        frame.add(button_f[9]);
        frame.add(button_f[10]);

        button_f[14].setBounds(345, 145, 100, 50);
        button_f[15].setBounds(450, 145, 100, 50);
        frame.add(button_f[14]);
        frame.add(button_f[15]);

        // panel.setBorder(BorderFactory.createEmptyBorder(100,100,10,100));
        panel.setBounds(50, 210, 500, 500);
        panel.setLayout(new GridLayout(4, 5, 10, 10));
        panel.add(button[1]);
        panel.add(button[2]);
        panel.add(button[3]);
        panel.add(button_f[0]);
        panel.add(button_f[1]);
        panel.add(button[4]);
        panel.add(button[5]);
        panel.add(button[6]);
        panel.add(button_f[2]);
        panel.add(button_f[3]);
        panel.add(button[7]);
        panel.add(button[8]);
        panel.add(button[9]);
        panel.add(button_f[4]);
        panel.add(button_f[5]);
        panel.add(button_f[8]);
        panel.add(button[0]);
        panel.add(button_f[11]);
        panel.add(button_f[6]);
        panel.add(button_f[7]);
        frame.add(panel);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Kalkulator kalk = new Kalkulator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String etykieta = e.getActionCommand();
        try {
            FileOutputStream fileOutput;
            ObjectOutputStream objectOutput;
            FileInputStream fileInput;
            ObjectInputStream objectInput;
            switch (etykieta) {
                case "(":
                    textfield1.setText(textfield1.getText().concat("("));
                    break;
                case ")":
                    textfield1.setText(textfield1.getText().concat(")"));
                    break;
                case "0":
                    textfield1.setText(textfield1.getText().concat("0"));
                    break;
                case "1":
                    textfield1.setText(textfield1.getText().concat("1"));
                    break;
                case "2":
                    textfield1.setText(textfield1.getText().concat("2"));
                    break;
                case "3":
                    textfield1.setText(textfield1.getText().concat("3"));
                    break;
                case "4":
                    textfield1.setText(textfield1.getText().concat("4"));
                    break;
                case "5":
                    textfield1.setText(textfield1.getText().concat("5"));
                    break;
                case "6":
                    textfield1.setText(textfield1.getText().concat("6"));
                    break;
                case "7":
                    textfield1.setText(textfield1.getText().concat("7"));
                    break;
                case "8":
                    textfield1.setText(textfield1.getText().concat("8"));
                    break;
                case "9":
                    textfield1.setText(textfield1.getText().concat("9"));
                    break;
                case "+":
                    textfield1.setText(textfield1.getText().concat("+"));
                    break;
                case "-":
                    textfield1.setText(textfield1.getText().concat("-"));
                    break;
                case "*":
                    textfield1.setText(textfield1.getText().concat("*"));
                    break;
                case "/":
                    textfield1.setText(textfield1.getText().concat("/"));
                    break;
                case "^":
                    textfield1.setText(textfield1.getText().concat("^"));
                    break;
                case "sqrt":
                    textfield1.setText(textfield1.getText().concat("p"));
                    break;
                case "!":
                    textfield1.setText(textfield1.getText().concat("!"));
                    break;
                case "%":
                    textfield1.setText(textfield1.getText().concat("%"));
                    break;
                case ".":
                    textfield1.setText(textfield1.getText().concat("."));
                    break;
                case "=":
                    String ONP = ALGtoONP(textfield1.getText() + "=");
                    System.out.println(ONP);
                    textfield3.setText(calculateONP(ONP) + "");
                    break;
                case "delete":
                    if(textfield1.getText().length() > 0)textfield1.setText(textfield1.getText().substring(0,textfield1.getText().length()-1));
                    break;
                case "clear":
                    textfield1.setText("");
                    break;
                case "import":
                    fileInput = new FileInputStream(textfield2.getText());
                    objectInput = new ObjectInputStream(fileInput);
                    Operacja s = (Operacja) objectInput.readObject();
                    textfield1.setText(s.operacja);
                    objectInput.close();
                    fileInput.close();
                    break;
                case "export":
                    fileOutput = new FileOutputStream(textfield2.getText());
                    objectOutput = new ObjectOutputStream(fileOutput);
                    objectOutput.writeObject(new Operacja(textfield1.getText()));
                    objectOutput.flush();
                    break;
            }

        } catch (Exception ex) {
            textfield3.setText(ex.getMessage());
        } finally {
            while (!stack.isempty()) {
                stack.pop();
            }
        }
    }

    String ALGtoONP(String ALG_in) throws Exception {
        String ALG = ALG_in.replaceAll(" ", "");
        // System.out.println(ALG);
        String ONP = "";
        boolean number = false;

        for (int i = 0; i < ALG.length(); i++) {
            if (ALG.charAt(i) == '(' || ALG.charAt(i) == ')' || ALG.charAt(i) == '*' || ALG.charAt(i) == '/'
                    || ALG.charAt(i) == '+' || ALG.charAt(i) == '-' || ALG.charAt(i) == '^' || ALG.charAt(i) == '%'
                    || ALG.charAt(i) == '!' || ALG.charAt(i) == 'p') {
                if (number) {
                    ONP += "]";
                    number = false;
                }
                ONP += getOperators(ALG.charAt(i));
            } else if (ALG.charAt(i) == '=') {
                if (number) {
                    ONP += "]";
                    number = false;
                }
                while (!stack.isempty()) {
                    ONP += stack.head();
                    stack.pop();
                }
                return ONP;
            } else {
                if (!number) {
                    ONP += "[";
                    number = true;
                }
                ONP += String.valueOf(ALG.charAt(i));
            }
        }
        throw new Exception("Blad rownania");
    }

    String getOperators(char operator) {
        String operators = "";
        int priority = 0;
        switch (operator) {
            case '(':
                stack.push(String.valueOf('('));
                break;
            case ')':
                while (!stack.isempty()) {
                    if (stack.head().equals("(")) {
                        stack.pop();
                        break;
                    }
                    operators += stack.head();
                    stack.pop();
                }
                break;
            default:
                priority = getPriority(operator);
                while (!stack.isempty() && (getPriority(stack.head().charAt(0)) >= priority)) {
                    operators += stack.head();
                    stack.pop();
                }
                stack.push(String.valueOf(operator));
                break;
        }
        return operators;
    }

    static int getPriority(char operator) {
        int priority = 0;
        switch (operator) {
            case '^':
                priority = 3;
                break;
            case 'p':
                priority = 3;
                break;
            case '!':
                priority = 3;
                break;
            case '*':
                priority = 2;
                break;
            case '/':
                priority = 2;
                break;
            case '%':
                priority = 2;
                break;
            case '+':
                priority = 1;
                break;
            case '-':
                priority = 1;
                break;
            default:
                priority = 0;
                break;
        }

        return priority;
    }

    double calculateONP(String ONP) throws Exception {
        double wynik = 0;
        String liczba = "";
        try {
            for (int i = 0; i < ONP.length(); i++) {
                if (ONP.charAt(i) == '[') {
                    i++;
                    while (ONP.charAt(i) != ']') {
                        liczba += ONP.charAt(i);
                        i++;
                    }
                    stack.push(liczba);
                    liczba = "";
                } else {
                    switch (ONP.charAt(i)) {
                        case '+':
                            wynik = Double.parseDouble(stack.head());
                            stack.pop();
                            wynik = Double.parseDouble(stack.head()) + wynik;
                            stack.pop();
                            stack.push(String.valueOf(wynik));
                            break;
                        case '-':
                            wynik = Double.parseDouble(stack.head());
                            stack.pop();
                            wynik = Double.parseDouble(stack.head()) - wynik;
                            stack.pop();
                            stack.push(String.valueOf(wynik));
                            break;
                        case '*':
                            wynik = Double.parseDouble(stack.head());
                            stack.pop();
                            wynik = Double.parseDouble(stack.head()) * wynik;
                            stack.pop();
                            stack.push(String.valueOf(wynik));
                            break;
                        case '/':
                            wynik = Double.parseDouble(stack.head());
                            if (wynik == 0)
                                throw new IllegalArgumentException("Proba dzielenia przez 0");
                            stack.pop();
                            wynik = Double.parseDouble(stack.head()) / wynik;
                            stack.pop();
                            stack.push(String.valueOf(wynik));
                            break;
                        case '%':
                            wynik = Double.parseDouble(stack.head());
                            stack.pop();
                            wynik = Double.parseDouble(stack.head()) % wynik;
                            stack.pop();
                            stack.push(String.valueOf(wynik));
                            break;
                        case '^':
                            wynik = Double.parseDouble(stack.head());
                            stack.pop();
                            wynik = Math.pow(Double.parseDouble(stack.head()), wynik);
                            stack.pop();
                            stack.push(String.valueOf(wynik));
                            break;
                        case 'p':
                            if(Double.parseDouble(stack.head()) < 0) throw new IllegalArgumentException("Proba pierwiastkowania liczby mniejszej od 0");
                            wynik = Math.sqrt(Double.parseDouble(stack.head()));
                            stack.pop();
                            stack.push(String.valueOf(wynik));
                            break;
                        case '!':
                            wynik = silnia(stack.head());
                            stack.pop();
                            stack.push(String.valueOf(wynik));
                            break;

                        default:
                            throw new IllegalArgumentException("Wykryto bledny operator");
                    }
                }
            }
            return wynik;
        } catch (NoSuchElementException ex) {
            throw new IllegalArgumentException("Wpisane rownanie jest bledne");
        } catch (IndexOutOfBoundsException ex) {
            throw new IllegalArgumentException("Wpisane rownanie jest bledne");
        }
        catch (Exception ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }

    }

    static int silnia(String tekst) {
        int wynik = 1;
        try {
            int value = Integer.parseInt(tekst);
            if (value < 0)
                throw new IllegalArgumentException();
            for (int i = 1; i <= value; i++) {
                wynik *= i;
            }

        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Silnia musi byc liczba naturalna, podano: " + tekst);
        }

        return wynik;
    }

}

class Operacja implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    String operacja;

    Operacja(String operacja){
        this.operacja = operacja;
    }
}