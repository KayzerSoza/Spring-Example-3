package com.example.demo.data.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name="RESERVATION")
public class Reservation {
  @Id
  @Column(name="RESERVATION_ID")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long reservationId;

  @Column(name="ROOM_ID") private long roomId;
  @Column(name="GUEST_ID") private long guestId;
  @Column(name="RES_DATE") private Date reservationDate;


}
