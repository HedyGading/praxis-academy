package Latihan1;

public class HigherOrderFunctionClass {
static <T> IFactory<T> createFactory(IProducer<T> producer, IConfigurator<T> configurator) {
        return () -> {
           T instance = producer.produce();
           configurator.configure(instance);
           return instance;
        };
    }
    public static void main(String[] args, boolean createFactory) {
       System.out.println(createFactory);
    }
}
//skip