import java.util.Objects;

public class Phone {
    private String codeRegion;
    private String phoneNumber;

    public Phone(String codeRegion, String phoneNumber) {
        if ((codeRegion.matches("\\d{3}")&&(phoneNumber.matches("\\d{7}")))||(codeRegion.matches("\\d{4}")&&(phoneNumber.matches("\\d{6}"))))
        {
            this.codeRegion = codeRegion;
            this.phoneNumber = phoneNumber;
        }else{
            throw new IllegalArgumentException("Ведено некорректное значение, введите значение формата (ХХХ) ХХХ-ХХ-ХХ или (ХХХХ) ХХ-ХХ-ХХ.");
        }
    }

    public String getCodeRegion() {
        return codeRegion;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
            Phone phone = (Phone) o;
        return Objects.equals(codeRegion, phone.codeRegion) && Objects.equals(phoneNumber, phone.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeRegion, phoneNumber);
    }

    @Override
    public String toString() {
//        Pattern pattern = Pattern.compile("\\d{2,3}[\\s-]?\\d{2}[\\s-]?\\d{2}");
        return "("+getCodeRegion()+") "+ getPhoneNumber().replaceFirst("(\\d{2,3})(\\d{2})(\\d{2})", "$1-$2-$3");
    }

}
