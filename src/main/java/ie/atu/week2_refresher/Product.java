package ie.atu.week2_refresher;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Long id;
    @NotBlank(message = "name cannot null")
    private String name;
    @Positive(message = "price must be positive")
    private double price;
}
