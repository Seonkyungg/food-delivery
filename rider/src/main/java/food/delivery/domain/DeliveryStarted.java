package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;

    public DeliveryStarted(Rider aggregate){
        super(aggregate);
    }
    public DeliveryStarted(){
        super();
    }
}
