package many_to_many_example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import many_to_many_example.model.Employee;
import many_to_many_example.model.Task;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        EntityManager em = Persistence.createEntityManagerFactory("default")
                .createEntityManager();

        Employee admin = new Employee();
        admin.setName("Denis");
        admin.setPosition("Linux System Administrator");

        Employee developer = new Employee();
        developer.setName("Ansar");
        developer.setPosition("Kotlin/Ktor Developer");

        try {
            em.getTransaction().begin();

            em.persist(admin);
            em.persist(developer);

            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        }

        Task task = new Task();
        task.setTitle("Настройка отказоустойчивости");
        task.setDescription("В витрине вышел из строя резервный сервер, прошу настроить платформу X, настроить БД, доступы, интерфейс, порты ....");
        task.setCreatedAt(LocalDate.now());

        admin.getTasks().add(task);
        developer.getTasks().add(task);
        task.getEmployees().add(admin);
        task.getEmployees().add(developer);

        try {
            em.getTransaction().begin();

            em.persist(task);

            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        }
    }
}
