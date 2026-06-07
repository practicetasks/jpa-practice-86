import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = factory.createEntityManager();

        // Получение по id
//        Category category = entityManager.find(Category.class, 5);
//        System.out.println(category.getId() + ". " + category.getName());


        // Получение списка объектов
//        TypedQuery<Category> query = entityManager.createQuery("select c from Category c", Category.class);
//        List<Category> categories = query.getResultList();
//        for (Category category : categories) {
//            System.out.println(category.getId() + ". " + category.getName());
//        }

//        List<Category> categories = entityManager.createQuery("select c from Category c", Category.class)
//                .getResultList();
//
//        for (Category category : categories) {
//            System.out.println(category.getId() + ". " + category.getName());
//        }

        // Получение select-запроса с условием
//        TypedQuery<Category> query = entityManager.createQuery("select c from Category c where c.name = ?1", Category.class);
//        query.setParameter(1, "Процессоры");
//
//        Category category = query.getSingleResult();
//        System.out.println(category.getId() + ". " + category.getName());

//        // Создание
//        Category category = new Category();
//        category.setName("Тестовая категория");
//
//        try {
//            entityManager.getTransaction().begin(); // открытие транзакций
//            entityManager.persist(category); // insert into categories
//            entityManager.getTransaction().commit(); // фиксирование и закрытие транзакций
//
//            System.out.println("Категория создана");
//        } catch (Exception e) {
//            entityManager.getTransaction().rollback(); // откат изменений
//            System.out.println(e.getMessage());
//        }

        // Обновление
//        Category category = entityManager.find(Category.class, 3);
//        category.setName("НОВОЕ НАЗВАНИЕ");
//
//        try {
//            entityManager.getTransaction().begin(); // открытие транзакций
//            entityManager.merge(category); // update
//            entityManager.getTransaction().commit(); // фиксирование и закрытие транзакций
//
//            System.out.println("Категория обновлена");
//        } catch (Exception e) {
//            entityManager.getTransaction().rollback(); // откат изменений
//            System.out.println(e.getMessage());
//        }

        // Удаление
//        Category category = entityManager.find(Category.class, 3);
//
//        try {
//            entityManager.getTransaction().begin(); // открытие транзакций
//            entityManager.remove(category); // delete
//            entityManager.getTransaction().commit(); // фиксирование и закрытие транзакций
//
//            System.out.println("Категория удалена");
//        } catch (Exception e) {
//            entityManager.getTransaction().rollback(); // откат изменений
//            System.out.println(e.getMessage());
//        }
    }
}
