package dev.erl.models.enums;

public enum CivilStatus {
    SINGLE( 0), MARRIED(1);

    private int code;

    private CivilStatus(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }

    public static CivilStatus fromCode(int code){
        return switch(code){
            case 0 -> CivilStatus.SINGLE;
            case 1 -> CivilStatus.MARRIED;
            default -> null;
        };
    }
}
