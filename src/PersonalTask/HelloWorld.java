package PersonalTask;

public class HelloWorld {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();

        System.out.println(helloWorld.getMessage());
        helloWorld.setMessage("Hello World");
        System.out.println(helloWorld.getMessage());
    }

    private String message = "";

    public void helloWOrld() {
        this.message = " Default Message ";
    }
    public void setMessage(String m) {
        this.message = m;
    }
    public String getMessage() {
        return message.toUpperCase();
    }

}

