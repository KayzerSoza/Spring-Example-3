package com.example.demo.data.repository;

import com.example.demo.data.entity.Guest;
import com.example.demo.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository<Guest,Long> {
}
