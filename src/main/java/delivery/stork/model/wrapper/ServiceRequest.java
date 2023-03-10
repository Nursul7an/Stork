package delivery.stork.model.wrapper;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ServiceRequest {
    @NotBlank
    String getFrom;
    @NotBlank
    String getTo;
    @NotBlank

    LocalDateTime flightDate;
    @NotBlank

    LocalDateTime arrivalDate;
    @NotBlank
    double capacity;
    @NotBlank
    double price;
}

