public class Main {
    public static void main(String[] args) {
        IDandPassword idandpasswords = new IDandPassword();

        LoginPage loginpage = new LoginPage(idandpasswords.getLoginInfo());
    }
}
