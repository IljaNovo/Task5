import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {

    private String name;
    private int docNumber;
    private GregorianCalendar birthday;

    public Person(int day, int month, int year) {
        this.name = "no name";
        this.docNumber = UniqueNumber.generate();
        this.birthday = new GregorianCalendar();

        this.birthday.set(Calendar.DAY_OF_MONTH, day);
        this.birthday.set(Calendar.MONTH, month);
        this.birthday.set(Calendar.YEAR, year);
    }

    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.docNumber = UniqueNumber.generate();
        this.birthday = new GregorianCalendar();

        this.birthday.set(Calendar.DAY_OF_MONTH, day);
        this.birthday.set(Calendar.MONTH, month);
        this.birthday.set(Calendar.YEAR, year);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDocNumber() {
        return docNumber;
    }

    public String getBirthday() {
        return birthday.get(Calendar.DAY_OF_MONTH) + "." +
                birthday.get(Calendar.MONTH) + "." +
                birthday.get(Calendar.YEAR);
    }

    public int getAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - birthday.get(Calendar.YEAR);
    }

    
}
