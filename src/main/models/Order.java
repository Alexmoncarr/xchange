import java.time.LocalDate;

import org.hibernate.mapping.Collection;
import org.springframework.cglib.core.Local;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "order")

public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @Column(name = "description", nullable = false, length = 200)
    private String description;

    @Column(name = "price", nullable = false, length = 5)
    private double price;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "deliveryDate", nullable = false)
    private LocalDate deliveryDate;

    @Column(name = "expirationDate", nullable = false)
    private LocalDate expirationDate;

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name = "orders", 
        joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "order_id", referencedColumnName = "id"))
    private Collection <Product> products;
  

}
