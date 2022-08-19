package com.tsamby.roomwebapp.controllers;

import com.tsamby.roomwebapp.models.Room;
import com.tsamby.roomwebapp.models.StaffMember;
import com.tsamby.roomwebapp.service.StaffService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffRestController {

    private final StaffService staffService;

    public StaffRestController(StaffService staffService){
        this.staffService = staffService;
    }

    @GetMapping
    public List<StaffMember> getAllStaff(){
        return  staffService.getAllStaff();
    }
}
