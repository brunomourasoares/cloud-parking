package one.digitalinnovation.parking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import one.digitalinnovation.parking.models.Parking;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, String> {
}