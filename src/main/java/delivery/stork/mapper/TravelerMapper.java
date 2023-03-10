package delivery.stork.mapper;

import delivery.stork.model.dto.TravelerDto;
import delivery.stork.model.entity.Traveling;
import delivery.stork.model.entity.User;
import delivery.stork.model.wrapper.ServiceRequest;
import delivery.stork.model.wrapper.TravelingEditRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class TravelerMapper {
    private final UserMapper userMapper;
    public Traveling toTraveler(ServiceRequest serviceRequest, User userTraveler) {
        return  Traveling.builder()
                .getFrom(serviceRequest.getGetFrom())
                .getTo(serviceRequest.getGetTo())
                .flightDate(serviceRequest.getFlightDate())
                .arrivalDate(serviceRequest.getArrivalDate())
                .price(serviceRequest.getPrice())
                .capacity(serviceRequest.getCapacity())
                .userTraveler(userTraveler)
                .build();
    }

    public TravelerDto toTravelerDto(Traveling serviceTraveler) {
        return  TravelerDto.builder()
                .id(serviceTraveler.getId())
                .getFrom(serviceTraveler.getGetFrom())
                .getTo(serviceTraveler.getGetTo())
                .flightDate(serviceTraveler.getFlightDate())
                .arrivalDate(serviceTraveler.getArrivalDate())
                .capacity(serviceTraveler.getCapacity())
                .price(serviceTraveler.getPrice())
                .userTravelerDto(userMapper.toUserDto(serviceTraveler.getUserTraveler()))
                .build();
    }

    public Traveling toTravelingFromEdit(TravelingEditRequest travelingEditRequest, Traveling traveling) {
        traveling.setGetFrom(travelingEditRequest.getGetFrom());
        traveling.setGetTo(travelingEditRequest.getGetTo());
        traveling.setPrice(travelingEditRequest.getPrice());
        traveling.setCapacity(travelingEditRequest.getCapacity());
        traveling.setFlightDate(travelingEditRequest.getFlightDate());
        traveling.setArrivalDate(travelingEditRequest.getFlightDate());
        return traveling;
    }
}
