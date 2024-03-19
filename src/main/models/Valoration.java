@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "valoration")
public class Valoration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "mark", nullable = false, length = 50)
    private int mark;

    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @Column(name = "comment", nullable = false, length = 50)
    private String comment;
    
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;
}
