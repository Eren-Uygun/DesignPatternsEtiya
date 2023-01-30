package nullObject.services;

import nullObject.caches.ICache;

public class ExternalEmployeeService implements IEmployeeService{

    private ICache cache;

    public ExternalEmployeeService(ICache cache) {
        this.cache = cache;
    }

    @Override
    public void add() {
        this.cache.cache();
        System.out.println("Dış personel eklendi.");
    }

}
