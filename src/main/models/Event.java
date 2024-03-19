@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "event")
public class Event {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @Column(name = "description", nullable = false, length = 50)
    private String description;

    @Column(name = "date", nullable = false, length = 50)
    private LocalDate date;
}
