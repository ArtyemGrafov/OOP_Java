public enum Gender {
    MALE, FEMALE;

    public static Gender stringToEnum(String gender) {
        if (gender.equals("male")) return MALE;
        else if (gender.equals("female")) return FEMALE;
        else return null;
    }
}
