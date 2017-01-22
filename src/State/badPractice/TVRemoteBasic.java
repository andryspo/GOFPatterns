package State.badPractice;

public class TVRemoteBasic {

    private String state = "";

    public void setState(String state) {
        this.state = state;
    }

    public void doAction() {
        switch (state) {
            case "ON":
                System.out.println("TV is turned ON");
                break;
            case "OFF":
                System.out.println("TV is turned OFF");
                break;
        }
    }

    public static void main(String[] args) {
        TVRemoteBasic remote = new TVRemoteBasic();

        remote.setState("ON");
        remote.doAction();

        remote.setState("OFF");
        remote.doAction();
    }

}
