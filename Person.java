public class Person {
    private String name;
    private Bank bank;

    public Person(String name, Bank bank) {
        this.name = name;
        this.bank = bank;
    }

    public String getName() {
        return name;
    }

    public Bank getBank() {
        return bank;
    }
}
