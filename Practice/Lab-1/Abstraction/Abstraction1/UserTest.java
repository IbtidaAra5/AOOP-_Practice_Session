public class UserTest {
    static void main(String[] args) {
        //MobileUser ms=new MobileUser();//abstract class can not be intantiated
        MobileUser ms;//ref variable
        ms=new Rahim();
        ms.sendMessage();
        
        ms=new Karim();
        ms.sendMessage();
    }
}
