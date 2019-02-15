package online_store;

import java.util.ArrayList;
import java.util.List;

public class Authentication {
    public static boolean authenticate(String log, String pass) {

        List<Character> UppChar = new ArrayList<>();
        for (Character i = 65; i < 90; i++) {
            UppChar.add(i);
        }

        try {
            if (log.length() > 20) {
                throw new WrongLoginException("Логин должен содержать меньше 20 символов");
            }
            if (pass.length() > 20 || passAuthentication(pass, UppChar) != 1) {
                //!pass.equals(confPass)
                throw new WrongPasswordException("Пароль должен содержать меньше 20 символов и иметь хотя бы одну заглавную букву");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    private static int passAuthentication(String pass, List<Character> list) {
        for (int i = 0; i < pass.length(); i++) {
            for (Character a : list) {
                if (pass.charAt(i) == a) {
                    return 1;
                }
            }
        }
        return 0;
    }

}
