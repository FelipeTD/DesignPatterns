package basico;

public class ObserverMain {

    public static void main(String[] args) {

        Channel telusko = new Channel();

        Subscriber sb1 = new Subscriber();
        sb1.setName("Filipe");

        Subscriber sb2 = new Subscriber();
        sb2.setName("Fofura");

        Subscriber sb3 = new Subscriber();
        sb3.setName("Best");

        Subscriber sb4 = new Subscriber();
        sb4.setName("Gudao");

        Subscriber sb5 = new Subscriber();
        sb5.setName("Miguel");

        Subscriber sb6 = new Subscriber();
        sb6.setName("Petao");

        telusko.subscribe(sb1);
        telusko.subscribe(sb2);
        telusko.subscribe(sb3);
        telusko.subscribe(sb4);
        telusko.subscribe(sb5);
        telusko.subscribe(sb6);

        telusko.unsubscribe(sb3);

        sb1.subscribeChannel(telusko);
        sb2.subscribeChannel(telusko);
        sb3.subscribeChannel(telusko);
        sb4.subscribeChannel(telusko);
        sb5.subscribeChannel(telusko);
        sb6.subscribeChannel(telusko);

        telusko.upload("Video teste");


    }

}
