import java.util.Scanner;

class Person{

    String name;
    String phoneNumber;
    String email;

    //metodo construtor de uma classe java
    public Person(String name, String phoneNumber, String email){

        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    //metodo setter - alterar valores
    public void setName(String name){
        this.name = name;
    }

    public void setPhoneNumber(String phoneString){
        this.phoneNumber = phoneString;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void displayPerson() {
        System.out.println("Nome: " + name);
        System.out.println("Email: " + email);
        System.out.println("Telefone" + phoneNumber);
    }
}

public class ContactsList {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Person persons[] = new Person[3];

        System.out.println("Preencher lista de contatos");

        for(int i = 0; i < persons.length; i++){

            System.out.println("Nome da pessoa" + i + ":");
            String name = scanner.nextLine();

            System.out.println("Telefone da pessoa" + i + ":");
            String phoneNumber = scanner.nextLine();

            System.out.println("Email da pessoa" + i + ":");
            String email = scanner.nextLine();

            //Criando um novo objeto da classe Person com os atributos informados
            persons[i] = new Person(name, phoneNumber, email);
            
        }

       
        System.out.println("Lista de contatos");
        for(Person person : persons){
            person.displayPerson();
            System.out.println();
        }

        System.out.println("Informe o indice da pessoa para mudar de telefone:");
        int index = scanner.nextInt();

        System.out.println("Pessoa a ter o telefone alterado:");

        Person person = persons[index];

        person.displayPerson();
        System.out.println();

        //System.out.println("Informe o novo telefone da pessoa:");
        //String newPhone = scanner.nextLine();
        
        person.setPhoneNumber("48888888");
        person.displayPerson();



        scanner.close();
    }
}
