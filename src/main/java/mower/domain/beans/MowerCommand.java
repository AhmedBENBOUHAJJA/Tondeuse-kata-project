package mower.domain.beans;

public enum MowerCommand {

    Avance("A"),
    Droite("D"),
    Gauche("G");

    private String code;

    MowerCommand(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static MowerCommand getCommandeFromCode(final String code) {
        return null;
    }

}
