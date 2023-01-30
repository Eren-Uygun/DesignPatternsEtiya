package nullObject;


import nullObject.caches.DummyCacheService;
import nullObject.caches.RedisCacheService;
import nullObject.services.ExternalEmployeeService;
import nullObject.services.IEmployeeService;

public class Main {
    public static void main(String[] args) {

        IEmployeeService iEmployeeService = new ExternalEmployeeService(new RedisCacheService());
        iEmployeeService.add();

        IEmployeeService iEmployeeService1 = new ExternalEmployeeService(new DummyCacheService());
        iEmployeeService1.add();

    }
}
