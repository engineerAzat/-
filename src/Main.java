public class Main {
    public static void main(String[] args) {

        try {
            SecurityUtis.check("asdqewd231", "12346_", "12346_");

            System.out.println("Все отлично");
        } catch (WrongLoginException e) {
            System.err.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Finally!");
        }



    }
}