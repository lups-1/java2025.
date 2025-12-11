package Laba7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// ================= КЛАС ПРАЦІВНИК =================
class Worker {
    private String name;
    private String surname;
    private double salary;

    public Worker(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " " + surname + " (salary: " + salary + ")";
    }
}

// ================= КЛАС ВІДДІЛ =================
class Department {
    private String name;
    private Worker boss;
    private List<Worker> workers;

    public Department(String name, Worker boss) {
        this.name = name;
        this.boss = boss;
        this.workers = new ArrayList<>();
    }

    public void addWorker(Worker w) {
        workers.add(w);
    }

    public Worker getBoss() {
        return boss;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public String getName() {
        return name;
    }
}

// ================= КЛАС ФІРМА =================
class Firm {
    private String name;
    private Worker director;
    private List<Department> departments;

    public Firm(String name, Worker director) {
        this.name = name;
        this.director = director;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department d) {
        departments.add(d);
    }

    public Worker getDirector() {
        return director;
    }

    public List<Department> getDepartments() {
        return departments;
    }
}

// =======================================================
// =================   ГОЛОВНИЙ КЛАС   ===================
// =======================================================
public class lab7 {
    public static void main(String[] args) {

        // ----- Створення тестових даних -----
        Worker director = new Worker("Ivan", "Petrenko", 30000);
        Firm firm = new Firm("TechCorp", director);

        Department dep1 = new Department("IT", new Worker("Anna", "Koval", 20000));
        dep1.addWorker(new Worker("Oleh", "Sydorenko", 15000));
        dep1.addWorker(new Worker("Maksym", "Ivanov", 22000)); // > boss

        Department dep2 = new Department("HR", new Worker("Svitlana", "Orlova", 18000));
        dep2.addWorker(new Worker("Larysa", "Shevchenko", 14000));

        firm.addDepartment(dep1);
        firm.addDepartment(dep2);

        // =====================================================
        //               1) МАКСИМАЛЬНА З/П   (for-each)
        // =====================================================
        double maxSalary = director.getSalary();

        for (Department d : firm.getDepartments()) {
            if (d.getBoss().getSalary() > maxSalary)
                maxSalary = d.getBoss().getSalary();

            for (Worker w : d.getWorkers()) {
                if (w.getSalary() > maxSalary)
                    maxSalary = w.getSalary();
            }
        }

        System.out.println("1) Максимальна зарплата: " + maxSalary);


        // =====================================================
        //   2) Відділ, де хоч один працівник отримує більше
        //      за свого начальника (типізований Iterator)
        // =====================================================

        Iterator<Department> itDep = firm.getDepartments().iterator();
        while (itDep.hasNext()) {
            Department d = itDep.next();
            double bossSalary = d.getBoss().getSalary();

            Iterator<Worker> itWorkers = d.getWorkers().iterator();
            while (itWorkers.hasNext()) {
                Worker w = itWorkers.next();
                if (w.getSalary() > bossSalary) {
                    System.out.println("2) Є такий відділ: " + d.getName());
                    break;
                }
            }
        }


        // =====================================================
        // 3) Список усіх співробітників (нетипізований Iterator)
        // =====================================================

        List<Object> allPeople = new ArrayList<>();
        allPeople.add(firm.getDirector());

        for (Department d : firm.getDepartments()) {
            allPeople.add(d.getBoss());
            allPeople.addAll(d.getWorkers());
        }

        Iterator it = allPeople.iterator(); // ← НЕТИПІЗОВАНИЙ
        System.out.println("3) Всі співробітники:");
        while (it.hasNext()) {
            System.out.println("   " + it.next());
        }
    }
}
