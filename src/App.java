import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Object[] options = { "Convertir Divisas", "Convertir Temperatura", "Salir" };
        int elegir = JOptionPane.showOptionDialog(null, "¿Que quieres hacer?", "Conversor", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        if (elegir == 2) {
            JOptionPane.showMessageDialog(null, "Programa cerrado");
            System.exit(0);
        }
        if (elegir == 0) {
            DecimalFormat formatearDivisa = new DecimalFormat("#.##");
            boolean continuarPrograma = true;
            while (continuarPrograma) {
                String opciones[] = { "Pesos AR a Dólares", "Pesos AR a Euros", "Pesos AR a Libras Esterlinas",
                        "Pesos AR a Yen JPY", "Pesos AR a Won KRW" };
                String cambio = (String) JOptionPane.showInputDialog(null, "Elija una opción: ", "Conversor de Moneda",
                        JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                String input = JOptionPane.showInputDialog(null, "Ingrese cantidad de Pesos: ");
                double pesos = 0.00;

                try {
                    pesos = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no valido");
                }

                // DOLARES
                if (cambio.equals("Pesos AR a Dolares")) {
                    double dolar = pesos / 3.9; // Poner el valor de la moneda
                    JOptionPane.showMessageDialog(null, pesos + " Pesos Argentinos "
                            + formatearDivisa.format(dolar) + " Dólares ");
                    // EUROS
                } else if (cambio.equals(" Pesos AR a Euros ")) {
                    double euro = pesos / 3.89;
                    JOptionPane.showMessageDialog(null, pesos + "Pesos Argentinos "
                            + formatearDivisa.format(euro) + "Euros");
                    // LIBRAS ESTERLINAS
                } else if (cambio.equals("Pesos AR a Libras Esterlinas")) {
                    double librasE = pesos / 3.80;
                    JOptionPane.showMessageDialog(null, pesos + "Pesos Argentinos "
                            + formatearDivisa.format(librasE) + "Libras Esterlinas");
                    // YEN JAPONÉS
                } else if (cambio.equals("Pesos AR a Yen JPY")) {
                    double yenJ = pesos / 3.90;
                    JOptionPane.showMessageDialog(null, pesos + "Pesos Argentinos "
                            + formatearDivisa.format(yenJ) + "Yen JPY");
                    // WON SUL-COREANO
                } else if (cambio.equals("Pesos AR a Won KRW")) {
                    double wonK = pesos / 3.28;
                    JOptionPane.showMessageDialog(null, pesos + "Pesos Argentinos "
                            + formatearDivisa.format(wonK) + "Won KRW");
                }

                int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Confirmar",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                if (confirmar == JOptionPane.NO_OPTION || confirmar == JOptionPane.CANCEL_OPTION) {
                    continuarPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa finalizado");

                }

            }

        }
        if (elegir == 1) {
            boolean continuarPrograma = true;
            while (continuarPrograma) {
                String[] opciones = { "Celsius a Fahrenheit", "Fahrenheit a Celsius" };
                int opcion = JOptionPane.showOptionDialog(null, "Elija una opción: ", "Conversor de Temepratura",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones);

                String valorNominal = JOptionPane.showInputDialog(null, "Ingresar el valor");
                double valor = 0.0;

                try {
                    valor = Double.parseDouble(valorNominal);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no válido");
                    System.exit(0);
                }

                double resultado = 0;
                if (opcion == 0) {
                    resultado = (valor * 9 / 5) + 32;
                    JOptionPane.showMessageDialog(null,
                            +valor + " Grados Celsius son: " + resultado + "Grados Fahrenheit");
                } else if (opcion == 1) {
                    resultado = (valor - 32) * 5 / 9;
                    JOptionPane.showMessageDialog(null,
                            valor + " Grados Fahrenheit son: " + resultado + "Grados Celsius");
                }
                int continuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "", JOptionPane.YES_NO_OPTION);
                if (continuar == JOptionPane.NO_OPTION) {
                    continuarPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                }
            }
        }
    }
}
