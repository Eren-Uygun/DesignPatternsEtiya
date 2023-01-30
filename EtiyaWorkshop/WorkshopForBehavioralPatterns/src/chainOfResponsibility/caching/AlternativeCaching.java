package chainOfResponsibility.caching;

public class AlternativeCaching extends AbstractCache{
    @Override
    public void cache(String message) {
        System.out.println("Alternatif cache işlemi yapıldı.");
    }
}
