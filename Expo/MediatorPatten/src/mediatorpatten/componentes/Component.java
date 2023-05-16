package mediatorpatten.componentes;

import mediatorpatten.mediador.Mediator;



/**
 * Common component interface.
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
