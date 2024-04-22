package day10.exception;

public class LoginUser {

    private String account; // 가입시 계정명
    private String password; // 가입시 패스워드

    public LoginUser(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public enum LoginStatus {
        SUCCESS, ID_FAIL, PW_FAIL
    }

    // 로그인 검증
    public LoginStatus loginValidate(String inputAccount, String inputPassword) {

        // 아이디가 일치하는가?
        if (!inputAccount.equals(account)) {
            System.out.println("계정이 일치하지 않습니다.");
            return LoginStatus.ID_FAIL;
        }

        // 비번이 일치하는가?
        if (!inputPassword.equals(password)) {
            System.out.println("비밀번호가 일치하지 않습니다.");
            return LoginStatus.PW_FAIL;
        }

        System.out.println("로그인이 성공했습니다.");
        return LoginStatus.SUCCESS;

    }

}
