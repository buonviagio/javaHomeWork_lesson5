package homeWork_lesson7;

public class Reader {
    String [] information;

    public Reader(String...array) {
        this.information = array;
    }
    //String fullName;
    //String numberOfTicket;
    //String department;
    //String dateOfBirth;
    //String telefonNumber;

    //public Reader(String fullName, String numberOfTicket, String department, String dateOfBirth, String telefonNumber) {
    //    this.fullName = fullName;
    //    this.numberOfTicket = numberOfTicket;
    //    this.department = department;
    //    this.dateOfBirth = dateOfBirth;
    //    this.telefonNumber = telefonNumber;
    //}

    void takeBook(int numberOfBooks) {
       System.out.println(information[0] + " взял " + numberOfBooks + " книги.");
    }

    void takeBook (String ... array){
        System.out.print(information[0] + " взял в библиотеке, книги: ");
        for (String a : array){
            System.out.print(a + "; ");
        }
        System.out.println();
    }

    void takeBook (Book...array) {
        System.out.print(information[0] + " взял книги автора: ");
        for (Book a: array){
            System.out.print(a.nameOfAuthor + "; ");
        }
    }

    void returnBook(int numberOfBooks){
        System.out.println(information[0] + " возвратил " + numberOfBooks + " книги.");
    }

    void returnBook (String ... array){
        System.out.print(information[0] + " возвратил в библиотеку, книги: ");
        for (String a : array){
            System.out.print(a + "; ");
        }
        System.out.println();
    }

    void returnBook (Book...array) {
        System.out.print(information[0] + " возвратил книги автора: ");
        for (Book a: array){
            System.out.print(a.nameOfAuthor + "; ");
        }
    }
}
