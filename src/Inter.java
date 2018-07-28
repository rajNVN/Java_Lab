import java.util.Scanner;
//previous one
/*interface common {
    void set_data(String a, double b);

    void print_data();
}

class Teacher implements common {
    private String name;
    private double salary;

    public void set_data(String a, double b) {
        this.name = a;
        this.salary = b;
    }

    public void print_data() {
        System.out.println("Teacher Details:\n"
                + "Name : " + name
                + "\nSalary : " + salary);
    }
}

class Child implements common {
    private String name;
    private double age;

    public void set_data(String a, double b) {
        this.name = a;
        this.age = b;
    }

    public void print_data() {
        System.out.println("Child Details:\n"
                + "Name : " + name
                + "\nAge : " + age);
    }
}


public class Inter {
    public static void main(String nvn[]) {
        Scanner scan = new Scanner(System.in);
        common com;
        Teacher teach = new Teacher();
        Child child = new Child();

        System.out.print("Enter Teacher details : \n Name <---");
        String a = scan.nextLine();
        System.out.println("Salary <---");
        double b = scan.nextDouble();
        com = teach;
        com.set_data(a, b);

        System.out.print("Enter Child details : \n Name <---");
        a = scan.next();
        System.out.println("Age <---");
        b = scan.nextDouble();
        com = child;
        com.set_data(a, b);

        while (true) {
            System.out.print("0 : Children details \t 1 : Teacher details : ");
            String c = scan.next();
            switch (c) {
                case 0:
                    com = child;
                    com.print_data();
                    break;
                case 1:
                    com = teach;
                    com.print_data();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
*/

interface common {
    void print_health();
}

class Yourname implements common {
    private double health;

    Yourname(double a) {
        health = a;
    }

    public void print_health() {
        System.out.println("You have " + health + " points");
    }
}

class Enemy implements common {
    private double health;

    Enemy(double a) {
        health = a;
    }

    public void print_health() {
        System.out.println("Enemy have " + health + " points");
    }
}

public class Inter
{
    public static void main(String nvn[]) {
        System.out.print("Enter total game points : ");
        int total = new Scanner(System.in).nextInt();
        System.out.print("Enter your participation : ");
        double health = new Scanner(System.in).nextDouble();
        common c;
        Yourname you = new Yourname(health);
        Enemy enemy = new Enemy(total - health);
        while (true) {
            System.out.print("Enter 0 to see your health 1 to see enemy health : ");
            int ch = new Scanner(System.in).nextInt();
            switch (ch) {
                case 0:
                    c = you;
                    c.print_health();
                    break;
                case 1:
                    c = enemy;
                    c.print_health();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}