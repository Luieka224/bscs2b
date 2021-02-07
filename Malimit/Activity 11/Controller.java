import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Controller{
    private View view;
    private Model model;

    public Controller(
        Model model,
        View view) {
            this.model = model;
            this.view = view;

            this.view.calculateNumbers(new CalculatorListener());
    }

    class CalculatorListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int num1, num2, result;
            char operation = '0';

            System.out.println("Button clicked: "+ e.getActionCommand());

            operation = e.getActionCommand().toString().charAt(0);

            if(operation != 'C') {
                try {
                    num1 = view.getNum1();
                    num2 = view.getNum2();

                    model.calculate(num1, num2, operation);
                    result = model.getResult();
                    view.setResult(result);
                } catch (NumberFormatException message) {
                    view.errorMessage(message.toString());
                }
            } else {
                view.clearAll();
            }
        }
    }
}