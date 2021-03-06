package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.dto.AddressbookDTO;
import com.bridgelabz.addressbook.dto.ResponseDTO;
import com.bridgelabz.addressbook.model.AddressbookData;
import com.bridgelabz.addressbook.service.IAddressbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressbookController {
    @Autowired
    private IAddressbookService addressbookService;

    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<ResponseDTO> getAddressbookData() {
        List<AddressbookData> addressbookDataList = null;
        addressbookDataList = addressbookService.getAddressbookData();
        ResponseDTO respDTO = new ResponseDTO("Get Call Successful", addressbookDataList);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{personId}")
    public ResponseEntity<ResponseDTO> getAddressbookData(@PathVariable(value = "personId") int personId) {
        AddressbookData addressbookData = null;
        addressbookData = addressbookService.getAddressbookDataById(personId);
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success for id: " +personId ,addressbookData);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressbookData(@RequestBody AddressbookDTO addressbookDTO) {
        AddressbookData addressbookData = null;
        addressbookData = addressbookService.createAddressbookData(addressbookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Created Employee Payroll Data for: ",addressbookData);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

    @PutMapping("/update/{personId}")
    public ResponseEntity<ResponseDTO> updateAddressbookData(@PathVariable int personId,@RequestBody AddressbookDTO addressbookDTO){
        AddressbookData addressbookData = null;
        addressbookData = new AddressbookData(personId,addressbookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Updated Employee Payroll Data for: ",addressbookData);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{personId}")
    public ResponseEntity<ResponseDTO> deleteAddressbookData(@PathVariable("personId") int personId) {
        addressbookService.deleteAddressbookData(personId);
        ResponseDTO responseDTO = new ResponseDTO("Deleted successfully","Deleted id: "+personId);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }
}