package com.morganstanely.medical.bootstrap;

import com.morganstanely.medical.model.Medicine;
import com.morganstanely.medical.repositatory.MedicineRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class BootstapData implements ApplicationListener<ContextRefreshedEvent> {

    private MedicineRepository medicineRepository;

    public BootstapData(MedicineRepository medicineRepository) {
        this.medicineRepository = medicineRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        init();
    }

    private void init(){
        Medicine bComplex = new Medicine();
        bComplex.setName("BComplex");
        bComplex.setCataegory("Vitamin");
        bComplex.setManufacturer("Sun Prama");
        bComplex.setPrice(13.67);
        bComplex.setStock(10);
        bComplex.setExpiryDate(new Date());
        bComplex.setGenericName("paracetamol");
        medicineRepository.save(bComplex);

        Medicine cComplex = new Medicine();
        cComplex.setName("CComplex");
        cComplex.setCataegory("Vitamin");
        cComplex.setManufacturer("New Life");
        cComplex.setPrice(50.67);
        cComplex.setStock(5);
        cComplex.setExpiryDate(new Date());
        cComplex.setGenericName("paracetamol");
        medicineRepository.save(cComplex);
    }
}
