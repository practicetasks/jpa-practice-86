package many_to_many_example.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;

    @Column(name = "created_at")
    private LocalDate createdAt;

    @ManyToMany(mappedBy = "tasks")
    private List<Employee> employees = new ArrayList<>();
}
