package observer_pattern;

public class TextMessageObserver implements Observer{

    private String name;
    private String data;
    private TextMessage tm;

    public TextMessageObserver(TextMessage tm, String name){
        this.tm = tm;
        this.name = name;
    };

    @Override
    public void update() {
        data = tm.getData();
        System.out.println("From observer " + name + ": " + data);
    }

    public String getData(){
        return data;
    }
}
