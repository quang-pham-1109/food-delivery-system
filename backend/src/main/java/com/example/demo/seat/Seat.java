package com.example.demo.seat;

import com.example.demo.booking.Booking;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.scheduling.support.SimpleTriggerContext;

@Entity
@Table(name = "Seat")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Seat {
    @Id
    @Column(name = "seat_id")
    private String SeatID;

    private String Zone;
    private Boolean isBooked;

}
