

public interface EventRepository extends JpaRepository<Event, Long> {


    Event findByEventTitle(String title);

    
}
