
package dsa;

public interface ISolution {

    default void execute(Object... args) {
        
        for (Object arg : args) {
           
            execute(arg);
        }
    }

    void execute(Object args);
}
