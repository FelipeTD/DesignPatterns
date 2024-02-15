package basico;

public class Subscriber {

    private String name;
    private Channel channel = new Channel();

    public void update() {
        System.out.println("Hey " + name + " Video uploaded");
    }

    public void subscribeChannel(Channel ch) {
        channel = ch;
    }

    public void setName(String name) {
        this.name = name;
    }

}
