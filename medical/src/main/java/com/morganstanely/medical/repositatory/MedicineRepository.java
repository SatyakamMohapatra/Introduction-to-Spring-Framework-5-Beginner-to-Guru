package com.morganstanely.medical.repositatory;

import com.morganstanely.medical.model.Medicine;
import org.springframework.data.repository.CrudRepository;

public interface MedicineRepository extends CrudRepository<Medicine,Long> { }
