interface ProgrammingLanguage {
    public void typeOfLanguage();
}

class Java implements ProgrammingLanguage {
    public void typeOfLanguage() {
        System.out.println("High Level Language");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Java java = new Java();
        java.typeOfLanguage();
    }
}
