public class main {
    public static void main(String[] args) {
        linkedlist<String> namesList = new linkedlist<>();

        namesList.insert("Mohammed");
        namesList.insert("Ahmed");
        namesList.insert("Ali");
        namesList.insert("Saleh");
        namesList.findFirst();

        while (!namesList.last()) {
            String names = namesList.retrieve();
            System.out.println(names);
            namesList.findNext();
        }

        String lastName = namesList.retrieve();
        System.out.println(lastName);

}
}
