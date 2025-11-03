package com.avisoft.SpringCICD.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {

    public ArrayList<String> userList(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Aman");
        arrayList.add("Shrinu");
        arrayList.add("Vishwa");
        arrayList.add("Vishal");
        return arrayList;
    }
}
