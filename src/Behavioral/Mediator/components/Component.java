package Behavioral.Mediator.components;

import Behavioral.Mediator.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
