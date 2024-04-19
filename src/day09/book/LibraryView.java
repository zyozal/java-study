package day09.book;

import day05.StringList;
import util.SimpleInput;

import static util.SimpleInput.input;

public class LibraryView {

    private static LibraryRepository repository;
    SimpleInput si;


    static {
        repository = new LibraryRepository();
    }

    // 회원정보 조회 위해 입력을 처리
    void makeNewBookUser() {
        System.out.println("\n# 회원 정보를 입력해주세요");
        String name = input("# 이름: ");
        int age = Integer.parseInt(input("# 나이: "));
        Gender g;
        while (true) {
            String gender = input("# 성별(M/F): ").toUpperCase();
            if (gender.equals("M")) {
                g = Gender.MALE;
                break;
            } else if ( gender.equals("F")) {
                g = Gender.FEMALE;
                break;
            }
            System.out.println("# 성별을 잘못 입력했습니다.");
        }
        repository.saveBookUser(new BookUser(name, age, g,0));
    }


    // 메뉴를 출력하는 기능
    public void showMainScreen() {
        System.out.println("\n============ 도서 메뉴 ==============");
        System.out.println("# 1. 마이페이지");
        System.out.println("# 2. 도서 전체 조회");
        System.out.println("# 3. 도서 제목으로 검색");
        System.out.println("# 4. 도서 대여하기");
        System.out.println("# 9. 프로그램 종료하기");
    }

    // 코드의 흐름을 캡슐화
    public void start() {
        makeNewBookUser();

        while (true) {
            showMainScreen();
            String menuNum = input("- 메뉴 번호 : ");

            switch (menuNum) {
                case "1":
                    showUser();
                    break;
                case "2":
                    displayAllBooks();
                    break;
                case "3":
                    searchBook();
                    break;
                case "4":
                    rentBook();
                    break;
                case "9":
                    System.out.println("# 프로그램을 종료합니다!!");
                    return;
                default:
                    System.out.println("# 올바른 메뉴 번호를 입력하세요!");
            }
        }
    }

    private void rentBook() {
        displayAllBooks();
        String bookNum = input("대여할 도서 번호 입력: ");
        // 저장소에 대여 가능한 지 여부 검증
        RentStatus status = repository.rentBook(Integer.parseInt(bookNum));

        if (status == RentStatus.RENT_SUCCESS_WITH_COUPON) {
            System.out.println("# 성공적으로 요리책이 쿠폰발급과 함께 대여되었습니다.");
        } else if (status == RentStatus.RENT_SUCCESS) {
            System.out.println("# 도서가 성공적으로 대여되었습니다.");
        } else {
            System.out.println("# 도서 대여에 실패했습니다.");
        }
    }

    private void searchBook() {

    }

    private void showUser() {
        System.out.println("회원 정보");
        BookUser user = repository.회원정보내놔();

        System.out.println("# 이름: " + user.getName());
        System.out.println("# 나이: " + user.getAge());
        System.out.println("# 성별: " + user.getGender());
        System.out.println("# 쿠폰개수: " + user.getCouponCount());

    }

    private void displayAllBooks() {
        System.out.println("전체 도서 목록");
        Book[] informationList = repository.getAllBooksInfo();

        for (int i = 0; i < informationList.length; i++) {
            Book book = informationList[i];
            System.out.printf("%d. %s\n", i+1, book.info());
        }
    }
}
