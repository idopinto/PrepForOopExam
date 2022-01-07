package designpatterns.memento;

/**
 * @author Ohad Klein
 */
public class Main {
    public static void main(String[] args) {
        Originator currentGameSave = new Originator();
        CareTaker saves = new CareTaker();
        String save1 = "save 1";
        currentGameSave.setState(save1);
        saves.add(currentGameSave.saveStateToMemento());
        System.out.println("Current save: " + currentGameSave.getState());
        String save2 = "save 2";
        currentGameSave.setState(save2);
        saves.add(currentGameSave.saveStateToMemento());
        System.out.println("Current save: " + currentGameSave.getState());
        // now going back to save 1:
        currentGameSave.getStateFromMemento(saves.get(0));
        System.out.println("Current save: " + currentGameSave.getState());
    }
}
