import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{
    List<Coche> DB_coche = new ArrayList<Coche>();
    @Override
    public void save(Coche NCoche) {
        DB_coche.add(NCoche);
    }

    @Override
    public List<Coche> findAll() {
        return DB_coche;
    }

    @Override
    public void delete(Coche NCoche) {
        DB_coche.remove(NCoche);
    }
}
