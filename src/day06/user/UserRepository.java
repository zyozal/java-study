package day06.user;

import day06.member.Member;

public class UserRepository {

    // 필드
    static User[] users;

    // 생성자
    UserRepository() {
        this.users = new User[5];
        users[0] = new User("abc@def.com", "1234", "콩순이", "여성", 50);
        users[1] = new User("ghi@def.com", "5432", "팥돌이", "남성", 40);
        users[2] = new User("xyz@def.com", "7890", "팥죽이", "여성", 30);
    }

    // 메서드


    /**
     * 생성된 회원정보를 회원 배열에 끝에 추가하는 기능
     * @param newMember - 사용자의 입력으로 전달된 회원 정보 객체
     */
    void addNewUser(User newUser) {

        // 배열에 데이터를 추가하는 로직
        User[] temp = new User[users.length + 1];
        for (int i = 0; i < users.length; i++) {
            temp[i] = users[i];
        }
        temp[temp.length - 1] = newUser;
        users = temp;
    }

    /**
     * 이메일 중복을 확인하는 기능
     * @param targetEmail - 검사할 사용자의 입력 이메일값
     * @return - 이메일이 이미 존재한다면 true,
     *           존재하지 않는 사용가능한 이메일이면 false
     * @author - 죠
     * @since 2024.04.16
     */
    boolean isDuplicateEmail(String targetEmail) {
        for (User u : users) {
            if (targetEmail.equals(u.email)) {
                return true;
            }
        }
        return false;
    }
}
