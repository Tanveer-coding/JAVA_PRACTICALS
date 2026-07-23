class Session {

    String topic;
    int duration;
    String trainer;
    String room;

    Session(String topic, int duration, String trainer, String room) {
        this.topic = topic;
        this.duration = duration;
        this.trainer = trainer;
        this.room = room;
    }

    Session(String topic, int duration) {
        this(topic, duration, "Mahendra Yadav", "Lab 3");
    }

    Session(String topic) {
        this(topic, 2);
    }

    void display() {
        System.out.println("\nSESSION DETAILS");
        System.out.println("Topic : " + topic);
        System.out.println("Duration : " + duration + " hours");
        System.out.println("Trainer : " + trainer);
        System.out.println("Room : " + room);
    }
}

public class TrainerSessionPlanner {

    public static void main(String[] args) {

        Session s1 = new Session("Java Arrays");
        Session s2 = new Session("Java Methods", 3);
        Session s3 = new Session("OOP", 4, "Rohit Sharma", "Lab 5");

        s1.display();
        s2.display();
        s3.display();
    }
}