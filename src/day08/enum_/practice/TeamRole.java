package day08.enum_.practice;

public enum TeamRole {
    LEADER("Manages the team and coordinates."),
    DEVELOPER("Develops the software."),
    DESIGNER("Designs the user interface."),
    TESTER("Tests the software for bugs.");

    // 이하를 작성하세요
    private final String description;

    TeamRole(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
