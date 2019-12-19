import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LambdaLesson {

    public static void main(String[] args) {

        String value = "456";
        ActionListener actionListener = (event) -> {
//            value = 888;
            System.out.println(event.getActionCommand());
        };
        actionListener.actionPerformed(new ActionEvent(new Object(), 1, "123"));

    }

}
