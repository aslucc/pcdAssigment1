
import controller.Controller;
import model.Model;
import view.CommandLineView;
import view.GUIView;

public class GUIMain {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Model model = new Model();
        Controller controller = new Controller(model);
        GUIView view = new GUIView(controller);
        model.addObserver(view);
        model.addObserver(new CommandLineView(startTime));
        view.setVisible(true);
    }
}
