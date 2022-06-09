package com.bridgelabz.addressbook.service;

import com.bridgelabz.addressbook.dto.AddressbookDTO;
import com.bridgelabz.addressbook.model.AddressbookData;

import java.util.ArrayList;
import java.util.List;

public class AddressbookService implements IAddressbookService {

    @Override
    public List<AddressbookData> getAddressbookData() {
        List<AddressbookData> addressbookDataList = new ArrayList<>();
        addressbookDataList.add(new AddressbookData(1,new AddressbookDTO("yash","8602203308")));
        return addressbookDataList;
    }

    @Override
    public AddressbookData getAddressbookDataById(int personId) {
        AddressbookData addressbookData =  null;
        addressbookData = new AddressbookData(personId,new AddressbookDTO("yash","23456789"));
        return addressbookData;
    }

    @Override
    public AddressbookData createAddressbookData(AddressbookDTO addressbookDTO) {
        AddressbookData addressbookData = null;
        addressbookData = new AddressbookData(1,addressbookDTO);
        return addressbookData;
    }

    @Override
    public AddressbookData updateAddressbookData(int personId,AddressbookDTO addressbookDTO) {
        AddressbookData addressbookData = null;
        addressbookData = new AddressbookData(personId,addressbookDTO);
        return addressbookData;
    }

    @Override
    public void deleteAddressbookData(int personId) {
    }
}
