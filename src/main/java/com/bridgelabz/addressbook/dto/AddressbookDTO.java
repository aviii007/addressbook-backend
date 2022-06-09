package com.bridgelabz.addressbook.dto;

public class AddressbookDTO {
    public String name;
    public long phoneNumber;

    public AddressbookDTO(String name, long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "AddressbookDTO{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
