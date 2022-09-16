public class Main {
    public static void main(String[] args) {
        Coche ferrary=new Coche( "FERRARI");
        Coche ferrary1=new Coche( "FERRARI1");
        Coche ferrary2=new Coche( "FERRARI2");

        CocheCRUD crud = new CocheCRUDImpl();
        crud.save(ferrary1);
        crud.save(ferrary);
        crud.save(ferrary2);
        crud.findAll().forEach(car-> System.out.print(car.name+", "));
        System.out.println("\nborrando ferrary2");
        crud.delete(ferrary2);
        crud.findAll().forEach(car-> System.out.print(car.name+", "));


    }
}