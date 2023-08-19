public class RecordRunner {
//    record Person(String name, String phone){}
record Person(String name, String phone){
    /*
    Person(String name, String phone){
        this.name = name;
        if (phone == "")
            throw new IllegalArgumentException("Phone can't blank");
        this.phone = phone;
    }
     */
    //Compact construtor
    Person{
        if (phone == "")
            throw new IllegalArgumentException("Phone can't blank");
    }

}
    public static void main(String[] args){
        Person p1 = new  Person("Ankit", "4325");
        System.out.println(p1);
    }
}
