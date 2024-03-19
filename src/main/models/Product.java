import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "description", nullable = false, length = 200)
    private String description;

    @Column(name = "price", nullable = false, length = 5)
    private double price;

}
