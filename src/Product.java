public class Product {
    private String name;
    private int number;
    private String value;

    public Product(String name, String value, int number) {
        this.name = name;
        this.value = value;
        this.number = number;
    }

    public void addNumber(int number){
        this.number += number;
    }

    public String takeValue(){
        if (number > 0){
            number--;
            return value;
        }
        else {
            return null;
        }
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return new String("name " + name + "\nnumber " + number + "\nvalue " + value + "\n");
    }
}
