class Enrollment {

    String id;
    String learner;
    String course;
    double fee;
    String paymentStatus;

    Enrollment(String id, String learner, String course,
               double fee, String paymentStatus) {

        this.id = id;
        this.learner = learner;
        this.course = course;
        this.fee = fee;
        this.paymentStatus = paymentStatus;
    }

    Enrollment(String id, String learner, String course,
               double fee) {

        this(id, learner, course, fee, "Pending");
    }

    void display() {

        System.out.println("\nENROLLMENT RECORD");
        System.out.println("ID : " + id);
        System.out.println("Learner : " + learner);
        System.out.println("Course : " + course);
        System.out.println("Fee : Rs. " + fee);
        System.out.println("Payment Status : " + paymentStatus);
    }
}

public class CourseEnrollmentRecord {

    public static void main(String[] args) {

        Enrollment e1 =
                new Enrollment("E101",
                        "Aman",
                        "Java Programming",
                        12000);

        Enrollment e2 =
                new Enrollment("E102",
                        "Riya",
                        "Python",
                        15000,
                        "Paid");

        e1.display();
        e2.display();
    }
}