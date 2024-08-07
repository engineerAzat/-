public class Main {
    public static void main(String[] args) {

        try {
            SecurityUtis.check("asdqewd231", "12346_*", "12346_");

        } catch (WrongPasswordException e) {
            System.err.println("Error!");
        }


    }
}