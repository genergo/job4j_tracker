package ru.job4j.poly;

public class Service {
    private Store store;

    public Service(Store store) {
        this.store = store;
    }

    public void exrtact() {
        store.save("Petr Arsenev");
    }

    public static void main(String[] args) {
        Store store = new DbStore();
        Service service = new Service(store);
        service.exrtact();
    }
}
