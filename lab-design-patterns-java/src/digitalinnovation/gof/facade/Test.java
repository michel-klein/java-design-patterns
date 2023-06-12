package digitalinnovation.gof.facade;

import digitalinnovation.gof.singleton.SingletonEager;
import digitalinnovation.gof.singleton.SingletonLazy;
import digitalinnovation.gof.singleton.SingletonLazyHolder;

public class Test {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.migrarCliente("Michel", "88888888");
    }
}
