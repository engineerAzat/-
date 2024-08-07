public class Main {
    public static void main(String[] args) {

        try {
            SecurityUtis.check("asdqewd231", "12346_", "12346_");
            System.out.println("Все отлично");
        }catch (Exception e) {
            System.out.println("Error!" + e.getMessage());
        }



    }
}