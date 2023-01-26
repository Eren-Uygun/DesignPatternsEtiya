package singletonPattern.services;

public class HumanCloneService implements ICloneService {

    public static volatile HumanCloneService instance;
    public String message ;

    public HumanCloneService(String message) {
        this.message = message;
    }

    public static HumanCloneService getInstance(String message){
        HumanCloneService humanCloneService = instance;
        if (humanCloneService != null){
          return  humanCloneService;
        }
        synchronized (HumanCloneService.class){
            if (instance == null){
                instance = new HumanCloneService(message);
            }
            return instance;
        }

    }

    @Override
    public void clonne() {
        System.out.println("Cloning ....... " + message);
    }
}
