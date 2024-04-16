package day06.user;

public class UserController {

    UserView uv;

    UserController() {
        this.uv = new UserView();
    }

    // 메뉴 입력 분기에 따라 할 일을 나워주는 기능
    void run() {
        while (true) {
            String menuNum = uv.showProgramMenu();

            switch (menuNum) {
                case "1":
                    uv.inputNewUser();
                    break;
                case "2":
                    break;
                case "3":
                    uv.showUsers();
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    boolean flag = uv.exitProgram();
                    if (flag) return;
            }
        }
    }
}
